package shardingJdbcDemo.entity;/**
 * Created by wm on 2018/12/21.
 */

/**
 * @program: cream
 * @description: 用户实体
 * @author: WangMei
 * @create: 2018-12-21 16:44
 **/
public class UserEntity {

    private Long uuid ;
    private String userName ;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
