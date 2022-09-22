package Java_concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigfileJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("\\Users\\royar\\git\\Practice\\ApiTesting\\src\\main\\resources\\Config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		
		String username= prop.getProperty("Username");
	    String Password= prop.getProperty("Password");
	    String Message= prop.getProperty("Message");
	    
	    System.out.println(username);
	    System.out.println(Password);
	    System.out.println(Message);
	}

}
