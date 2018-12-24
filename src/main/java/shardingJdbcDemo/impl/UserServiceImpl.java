package shardingJdbcDemo.impl;/**
 * Created by wm on 2018/12/23.
 */

import jpaDemo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shardingJdbcDemo.UserService;
import shardingJdbcDemo.repository.UserRepository;

/**
 * @program: cream
 * @description: user
 * @author: WangMei
 * @create: 2018-12-23 21:17
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public int deleteByPrimaryKey(Integer var1) {
        return userRepository.deleteByPrimaryKey(var1);
    }

    public int insert(UserEntity var1) {
        return userRepository.insert(var1);
    }

    public UserEntity selectByPrimaryKey(Integer var1) {
        return userRepository.selectByPrimaryKey(var1);
    }

    public int insertSelective(UserEntity var1) {
        return userRepository.insertSelective(var1);
    }

    public int updateByPrimaryKeySelective(UserEntity var1) {
        return userRepository.updateByPrimaryKeySelective(var1);
    }

    public int updateByPrimaryKey(UserEntity var1) {
        return userRepository.updateByPrimaryKey(var1);
    }
}
