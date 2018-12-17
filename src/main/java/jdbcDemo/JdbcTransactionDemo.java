package jdbcDemo;/**
 * Created by wm on 2018/12/17.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: cream
 * @description: JDBC事务项目实例
 * @author: WangMei
 * @create: 2018-12-17 14:40
 **/
public class JdbcTransactionDemo {


    //主键重复，会回滚，两个有任意一个失败，事务失败
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //注册jdbc驱动
        Class.forName("com.mysql.jdbc.Driver");
        final  String user = "root";
        final  String password = "123456";

        //通过驱动管理创建连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cream?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useCursorFetch=true&useCursorFetch=true&allowMultiQueries=true",user,password);

        try {
            conn.setAutoCommit(false);

            Statement statement = conn.createStatement();
            String sql = "Insert into user  values (5 ,'wm')";
            statement.executeUpdate(sql);

            sql = "Insert into user  values (6 ,'zjj')";
            statement.executeUpdate(sql);

            conn.commit();
        }catch (Exception e){
            conn.rollback();
        }

    }
}
