
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCreateClass {

	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/myschool";

	   //  Database credentials
	   static final String USER = "wawa";
	   static final String PASS = "mypass!@#";
	   
	   public static void main(String[] args) {
	   java.sql.Connection conn = null;
	   java.sql.Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      JDBCCreateClass.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Creating table in given database...");
	      stmt = conn.createStatement();
	      
	      String sql = "CREATE TABLE CLASS " +
	                   "(Subject VARCHAR (225), " +
	                   " credit_hour INTEGER not null, " + 
	                   " PRIMARY KEY ( Subject )) "; 

	      stmt.executeUpdate(sql);
	      System.out.println("Created table in given database...");
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
	   private static void forName(String string) {
		// TODO Auto-generated method stub
		
	}
	{//end JDBCExample
	}

}