package com.example.atSys.shiro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.example.atSys.redis.RedisConfig;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.atSys.dao.MangageDao;
import com.example.atSys.entity.EmpInfo;
import com.example.atSys.entity.Resource;
//import com.example.atSys.redis.RedisConfig;
import com.example.atSys.service.ResourceService;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class ShiroRealm extends AuthorizingRealm {

	@Autowired
	private MangageDao mangageDao;
	@Autowired
	private ResourceService resourceService;
//	@Autowired
//	private RedisConfig redisConfig;

	// 获取授权信息
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String) SecurityUtils.getSubject().getPrincipal();
		Map<String, Object> map = new HashMap<String, Object>();
		EmpInfo user = mangageDao.queryInfo(username);
		map.put("userid", user.getEmpId());
		List<Resource> resourcesList = resourceService.loadUserResources(map);

		/*
		 * JedisPool jp=redisConfig.redisPoolFactory(); Jedis jd=jp.getResource();
		 * jd.append("吕冠森", "Engine");
		 */

		// 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Session session = SecurityUtils.getSubject().getSession();
		boolean flog = true, flog1 = true,flog2=true;
		for (Resource resources : resourcesList) {
			info.addStringPermission(resources.getResUrl());
			if ("/empManageAuthority".equals(resources.getResUrl())) {
				session.setAttribute("empManageAuthority", "/empManageAuthority");
				flog = false;
			}

			if ("/deptauthority".equals(resources.getResUrl())) {
				session.setAttribute("deptauthority", "/deptauthority");
				flog1 = false;
			}
			if ("/approvalauthority".equals(resources.getResUrl())) {
				session.setAttribute("approvalauthority", "/approvalauthority");
				flog2 = false;
			}

		}
		if (flog) {
			session.removeAttribute("empManageAuthority");
		}
		if (flog1) {
			session.removeAttribute("deptauthority");
		}
		if(flog2) {
			session.removeAttribute("approvalauthority");
		}

		return info;
	}

	// 获取验证信息
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 获取用户的输入的账号.
		String username = (String) token.getPrincipal();

		EmpInfo user = mangageDao.queryInfo(username);
		if (user == null)
			throw new UnknownAccountException();
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getEmpName(), // 用户名
				// 使用shiro:principal=""可以获取到改值SecurityUtils.getSubject().getPrincipal()可以获取到该值
				user.getEmpPass(), // 密码
				ByteSource.Util.bytes(username), getName() // realm name
		);
		// 当验证都通过后，把用户信息放在session
		Session session = SecurityUtils.getSubject().getSession();
		session.setAttribute("userSession", user);
		session.setAttribute("userSessionId", user.getEmpId());

		System.out.println("信息" + session.getId());
		return authenticationInfo;
	}

	/**
	 * 根据userId 清除当前session存在的用户的权限缓存
	 *
	 * @param userIds
	 *            已经修改了权限的userId
	 */
	public void clearUserAuthByUserId(List<Integer> userIds) {
		if (null == userIds || userIds.size() == 0)
			return;
		// 定义返回
		List<SimplePrincipalCollection> list = new ArrayList<SimplePrincipalCollection>();

		RealmSecurityManager securityManager = (RealmSecurityManager) SecurityUtils.getSecurityManager();
		ShiroRealm realm = (ShiroRealm) securityManager.getRealms().iterator().next();
		for (SimplePrincipalCollection simplePrincipalCollection : list) {
			realm.clearCachedAuthorizationInfo(simplePrincipalCollection);
		}
	}
}
