package jpaDemo;/**
 * Created by wm on 2018/12/19.
 */


import javax.persistence.*;

/**
 * @program: cream
 * @description: 用户信息实体
 * @author: WangMei
 * @create: 2018-12-19 11:14
 **/
@Entity
@Table(name = "user")
public final  class UserEntity {

    private Long uuid ;
    private String userName ;

    @Id
    @Column(name = "uuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
