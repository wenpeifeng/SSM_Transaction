package com.ahead.service.impl;

import com.ahead.dao.UserDao;
import com.ahead.pojo.Users;
import com.ahead.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // 交给Spring去创建对象
public class UserServiceImpl implements UserService {

    // 切记：在所有的业务逻辑层中一定会有数据访问层的对象
    @Autowired
    private UserDao userDao;


    @Override
    public int insert(Users users) {
        int num = userDao.insert(users);
        System.out.println("添加用户成功！ num="+num);

        // 假设这里抛出异常，测试事务回滚
        System.out.println(1/0);
        return num;
    }
}
