package basic.MyExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class MyThrowsException2 {
	
	static MyThrowsException2 obj;

		static void method() throws IOException,SQLException{
			method1();
		
			throw new IOException("error observed");
			}
		
		static void method1() throws SQLException {
			System.out.println("in method 1");
			throw new SQLException("sql exception");
			}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyThrowsException m=new MyThrowsException();
			try {
				method();
			} catch(SQLException e) {
				System.out.println("in sql exception");
			} catch(IOException e) {
				System.out.println("in io exception");
			}
			System.out.println("Regular code flow");

	}

}
