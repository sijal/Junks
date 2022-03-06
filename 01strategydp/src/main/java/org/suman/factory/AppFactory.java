package org.suman.factory;

import java.io.IOException;
import java.util.Properties;

public class AppFactory {
	static Properties prop = new Properties();
	static {
		try {
			/*prop.load(new FileInputStream(new File(
					"D:\\Suman\\workspace\\sts_Spring_Durga\\Core\\01strategydp\\src\\main\\resources\\appClasses.properties")));*/
			prop.load(AppFactory.class.getClassLoader().getResourceAsStream("appClasses.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public static Object createObject(String lclassname) {
		String fqnCLass = (String) prop.get(lclassname);
		Object obj = null;
		Class<?> clazz = null;
		try {
			clazz = Class.forName(fqnCLass);
			obj = clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
