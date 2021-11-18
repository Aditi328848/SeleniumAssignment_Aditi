package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Learnpropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties p =new Properties();
InputStream inputstream=new FileInputStream("src/main/resources/test.properties");
p.load(inputstream);
System.out.println(p.getProperty("url"));
System.out.println(p.getProperty("port"));

	}

}
