package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class IdNameXpathForParametrization {
public String readDataFromLocatorsFile(String key) throws IOException
{
	FileInputStream fis=new FileInputStream("./data/locators_of_ActitimeLogin.properties");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
}
