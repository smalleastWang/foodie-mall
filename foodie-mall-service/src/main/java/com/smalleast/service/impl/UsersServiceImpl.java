package com.smalleast.service.impl;

import com.smalleast.bo.UserBo;
import com.smalleast.enums.Sex;
import com.smalleast.mapper.UsersMapper;
import com.smalleast.pojo.Users;
import com.smalleast.service.UsersService;
import com.smalleast.utils.DateUtils;
import com.smalleast.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Resource
    private Sid sid;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUserNameIsExist(String username) {

        Example userExample = new Example(Users.class);

        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username", username);

        Users result = usersMapper.selectOneByExample(userExample);

        return result == null ? false : true;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Users createUser(UserBo userBo) {

        String faceUrl = "http://cdn.duitang.com/uploads/item/201410/20/20141020162058_UrMNe.jpeg";
        String userId = sid.nextShort();
        Users user = new Users();
        user.setId(userId);
        user.setUsername(userBo.getUsername());
        user.setPassword(MD5Utils.getMD5(userBo.getPassword()));
        user.setNickname(userBo.getUsername());
        // 默认头像
        user.setFace(faceUrl);
        // 默认生日
        user.setBirthday(DateUtils.parseDate("1900-01-01"));
        Date date = DateUtils.parseDate("1900-01-01");
        // 性别默认保密
        user.setSex(Sex.secret.type);

        user.setCreateTime(new Date());
        user.setUpdatedTime(new Date());

        usersMapper.insert(user);

        return user;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Users loginUser(UserBo userBo) {
        String MD5Pwd = MD5Utils.getMD5(userBo.getPassword());
        Users user = new Users();
        user.setUsername(userBo.getUsername());
        Users result= usersMapper.selectOne(user);
        if (result != null && MD5Pwd.equals(result.getPassword())) {
            return result;
        }
        return null;
    }
}
