package jdbcDemo;/**
 * Created by wm on 2018/12/17.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * @program: cream
 * @description: Jdbc批量操作demo  Statement和PreparedStatement
 * @author: WangMei
 * @create: 2018-12-17 16:26
 **/
public class JdbcBatchDemo {


    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/cream?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useCursorFetch=true&useCursorFetch=true&allowMultiQueries=true";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "123456";

//    public static void main(String[] args) {
//        Connection conn = null;
//        try {
//            //STEP 2: Register JDBC driver
//            Class.forName("com.mysql.jdbc.Driver");
//
//            //STEP 3: Open a connection
//            System.out.println("Connecting to database...");
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement statement = conn.createStatement();
//
//            conn.setAutoCommit(false);
//
//            String SQL = "insert into user(uuid ,user_name)values(111,'nihao')";
//            statement.addBatch(SQL);
//
//            SQL = "insert into user(uuid ,user_name)values(112,'nihaoa')";
//            statement.addBatch(SQL);
//
//            int[] count = statement.executeBatch();
//
//            conn.commit();
//
//        }catch (Exception e){
//
//        }
//    }



    public static void main(String[] args) {
        Connection conn = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            conn.setAutoCommit(false);

            String SQL = "insert into user(uuid ,user_name)values(?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setInt(1,12);
            preparedStatement.setString(2,"wangmeimei");
            preparedStatement.addBatch();

            preparedStatement.setInt(1,13);
            preparedStatement.setString(2,"wangmeimeimei");
            preparedStatement.addBatch();

            preparedStatement.executeBatch();

            conn.commit();

        }catch (Exception e){

        }
    }
}
