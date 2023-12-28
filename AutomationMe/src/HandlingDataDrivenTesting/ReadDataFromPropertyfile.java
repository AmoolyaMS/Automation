package HandlingDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyfile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p = new Properties();
p.load(fis);
String url = p.getProperty("url");
String un = p.getProperty("username");
String pwd = p.getProperty("pwd");


	}

}
