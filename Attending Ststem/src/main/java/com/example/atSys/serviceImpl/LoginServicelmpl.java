package com.example.atSys.serviceImpl;

import com.example.atSys.entity.Permission;
import com.example.atSys.entity.Role;
import com.example.atSys.entity.user;
import com.example.atSys.service.LoginService;
import org.springframework.stereotype.Service;

import java.security.Permissions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service("LoginService")
public class LoginServicelmpl implements LoginService {

    @Override
    public user getUserByName(String getMapByName) {
        //模拟数据库查询，正常情况此处是从数据库或者缓存查询。
        return getMapByName(getMapByName);
    }

    /**
     * 模拟数据库查询
     * @param userName
     * @return
     */
    private user getMapByName(String userName){
        //共添加两个用户，两个用户都是admin一个角色，
        //wsl有query和add权限，zhangsan只有一个query权限
        Permission permissions1 = new Permission("1","query");
        Permission permissions2 = new Permission("2","add");
        Set<Permission> permissionsSet = new HashSet<>();
        permissionsSet.add(permissions1);
        permissionsSet.add(permissions2);
        Role role = new Role("1","admin",permissionsSet);
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(role);
        user user = new user("1","wsl","123456",roleSet);
        Map<String ,user> map = new HashMap<>();
        map.put(user.getUserName(), user);

        Permission permissions3 = new Permission("3","query");
        Set<Permission> permissionsSet1 = new HashSet<>();
        permissionsSet1.add(permissions3);
        Role role1 = new Role("2","user",permissionsSet1);
        Set<Role> roleSet1 = new HashSet<>();
        roleSet1.add(role1);
        user user1 = new user("2","zhangsan","123456",roleSet1);
        map.put(user1.getUserName(), user1);
        return map.get(userName);
    }
}
