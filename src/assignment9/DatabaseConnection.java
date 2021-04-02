package assignment9;

import java.io.FileInputStream;
public class DatabaseConnection {
	public static Connection setConnection() throws IOException
	{
		
		Connection con=null;
		FileInputStream fileInputStream=null;
		try {
				
				Properties properties= new Properties();
				String path="C:\\Users\\INDIA\\eclipse-workspace\\ASS09_golla_anudeep\\DataBase.properties";
			    fileInputStream= new FileInputStream(path);
			    properties.load(fileInputStream);
			    Class.forName(properties.getProperty("db.classname"));
			    String url=properties.getProperty("db.url");
		   		String user=properties.getProperty("db.user");
		   		String pwd=properties.getProperty("db.password");
		   		con= DriverManager.getConnection(url,user,pwd);
		   }
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	
}
}

