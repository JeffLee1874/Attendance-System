//package com.example.atSys.shiro;
//
//import com.example.atSys.dao.MangageDao;
//import com.example.atSys.entity.EmpInfo;
//import com.example.atSys.entity.Resource;
//import com.example.atSys.service.ResourceService;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.AuthenticationInfo;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class MyShiroRealm extends AuthorizingRealm {
//    @Autowired
//    private MangageDao mangageDao;
//	@Autowired
//	private ResourceService resourceService;
//
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//		//获取登录名
//        String name = (String)principalCollection.getPrimaryPrincipal();
//		//根据用户名查找
//		EmpInfo emp = mangageDao.queryInfo(name);
//
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        return null;
//    }
//}
