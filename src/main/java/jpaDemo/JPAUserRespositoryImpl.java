package jpaDemo;/**
 * Created by wm on 2018/12/19.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @program: cream
 * @description: 用户实现
 * @author: WangMei
 * @create: 2018-12-19 11:24
 **/
@Service("jPAUserRepository")
public class JPAUserRespositoryImpl implements JPAUserRespository{

    @Autowired
    private EntityManager entityManager;

    public void insert(UserEntity userEntity){
        entityManager.persist(userEntity);
    }

    public List<UserEntity> selectAll(){
        return ( List<UserEntity>)entityManager.createQuery("SELECT u FROM UserEntity u").getResultList();
    }

    public void delete(final  Long uuid){
        Query query  = entityManager.createQuery("DELETE FROM UserEntity u WHERE u.uuid =?1");
        query.setParameter(1,uuid);
        query.executeUpdate();
    }



}
