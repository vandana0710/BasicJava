package basic.MyExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class MyThrowsException {
	
	public void method() throws IOException {
		throw new IOException("error observed");
		}
	
	public void method1() throws SQLException {
		throw new SQLException("sql exception");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThrowsException m=new MyThrowsException();
		try {
			m.method();
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("Regular code flow");
	}

}
