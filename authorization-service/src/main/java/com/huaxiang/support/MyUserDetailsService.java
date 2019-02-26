package com.huaxiang.support;

import com.huaxiang.domain.SysUser;
import com.huaxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 授权的时候是对角色授权，而认证的时候应该基于资源，而不是角色，因为资源是不变的，而用户的角色是会变的
     */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        SysUser sysUser = userService.getUserByName(username);
//        if (null == sysUser) {
//            throw new UsernameNotFoundException(username);
//        }
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        for (SysRole role : sysUser.getRoleList()) {
//            for (SysPermission permission : role.getPermissionList()) {
//                authorities.add(new SimpleGrantedAuthority(permission.getCode()));
//            }
//        }
//
//        return new User(sysUser.getUsername(), sysUser.getPassword(), authorities);
        return buildUser(username);
    }

    private SysUser buildUser(String username) {
        // 根据用户名查找用户信息
        //根据查找到的用户信息判断用户是否被冻结
        return new SysUser("zhangsan", "123456",
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin,ROLE_USER"));
    }
}
