package shardingJdbcDemo.repository;/**
 * Created by wm on 2018/12/23.
 */

import jpaDemo.UserEntity;

/**
 * @program: cream
 * @description: 用户持久层
 * @author: WangMei
 * @create: 2018-12-23 10:59
 **/
public interface UserRepository {

    int deleteByPrimaryKey(Integer var1);

    int insert(UserEntity var1);

    int insertSelective(UserEntity var1);

    UserEntity selectByPrimaryKey(Integer var1);

    int updateByPrimaryKeySelective(UserEntity var1);

    int updateByPrimaryKey(UserEntity var1);

}
