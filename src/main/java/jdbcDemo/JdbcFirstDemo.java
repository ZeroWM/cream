package jdbcDemo;/**
 * Created by wm on 2018/12/15.
 */
import java.sql.*;
/**
 * @program: cream
 * @description: JDBC第一个项目实例
 * @author: WangMei
 * @create: 2018-12-15 16:21
 **/
public class JdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //注册jdbc驱动
        Class.forName("com.mysql.jdbc.Driver");
        final  String user = "root";
        final  String password = "123456";

        //通过驱动管理创建连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cream?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useCursorFetch=true&useCursorFetch=true&allowMultiQueries=true",user,password);

        //创建执行sql
        Statement statement = conn.createStatement();
        String sql = "select * from user ";

        //返回结果集
        ResultSet resultSet = statement.executeQuery(sql);

        //结果集，
        while (resultSet.next()) {
            Long uuid =  resultSet.getLong("uuid");
            String user_name = resultSet.getString("user_name");
            System.out.println("---------" + uuid);
            System.out.println("---------" + user_name);
        }

        resultSet.close();
        statement.close();
        conn.close();

    }
}
