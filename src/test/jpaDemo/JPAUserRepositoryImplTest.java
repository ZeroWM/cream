package jpaDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by wm on 2018/12/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class JPAUserRepositoryImplTest {

    @Autowired
    JPAUserRespository jpaUserRespository;

    @Test
    public void insert() throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setUuid(111L);
        userEntity.setUserName("wm");
        jpaUserRespository.insert(userEntity);
    }

    @Test
    public void selectAll() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}