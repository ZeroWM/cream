package jpaDemo;/**
 * Created by wm on 2018/12/19.
 */

import java.util.List;

/**
 * @program: cream
 * @description: JPAUser接口
 * @author: WangMei
 * @create: 2018-12-19 14:56
 **/
public interface JPAUserRespository {

    public void insert(UserEntity userEntity);

    public List<UserEntity> selectAll();

    public void delete(final  Long uuid);
}
