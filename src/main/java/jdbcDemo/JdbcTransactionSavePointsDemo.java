package jdbcDemo;/**
 * Created by wm on 2018/12/17.
 */

import java.sql.*;

/**
 * @program: cream
 * @description: 事务保存点应用demo
 *              ps：对于这理解的还不是很清晰，savepoint地方相当于立一个flag,如果后续操作出现异常，就回滚到flag的位置重新提交事务。目前理解是这样的。
 * @author: WangMei
 * @create: 2018-12-17 15:08
 **/
public class JdbcTransactionSavePointsDemo {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/cream?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useCursorFetch=true&useCursorFetch=true&allowMultiQueries=true";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "123456";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Set auto commit as false.
            conn.setAutoCommit(false);

            //STEP 5: Execute a query to create statment with
            // required arguments for RS example.
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            //STEP 6: Now list all the available records.
            String sql = "SELECT uuid,user_name FROM user";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("List result set for reference....");
            printRs(rs);

            // STEP 7: delete rows having ID equals 3
            // But save point before doing so.
            Savepoint savepoint1 = conn.setSavepoint("ROWS_DELETED_1");
            System.out.println("Deleting row....");
            String SQL = "DELETE FROM user " +
                    "WHERE uuid = 3";
            stmt.executeUpdate(SQL);

            //STEP 8: Rollback the changes afetr save point 2.
            conn.rollback(savepoint1);

            // STEP 9: delete rows having ID equals 6
            // But save point before doing so.
            Savepoint savepoint2 = conn.setSavepoint("ROWS_DELETED_2");
            System.out.println("Deleting row....");
            SQL = "DELETE FROM user " +
                    "WHERE uuid = 7";
            stmt.executeUpdate(SQL);

            //STEP 10: Now list all the available records.
            sql = "SELECT uuid ,user_name FROM user";
            rs = stmt.executeQuery(sql);
            System.out.println("List result set for reference....");
            printRs(rs);

            //STEP 10: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
            // If there is an error then rollback the changes.
            System.out.println("Rolling back data here....");
            try{
                if(conn!=null)
                    conn.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }//end try

        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main

    public static void printRs(ResultSet rs) throws SQLException{
        //Ensure we start with first row
        rs.beforeFirst();
        while(rs.next()){
            //Retrieve by column name
            int uuid  = rs.getInt("uuid");
            String userName = rs.getString("user_name");

            //Display values
            System.out.print("uuid: " + uuid);
            System.out.print(", userName: " + userName);
        }
        System.out.println();
    }//end printRs()
}
