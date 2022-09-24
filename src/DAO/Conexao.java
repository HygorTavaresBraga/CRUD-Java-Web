package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private String driver="com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/crud_java_web";
    private String user = "root";
    private String password = "";
    
    public Connection conectar() {
    	
    	Connection con = null;
    	try {
    		Class.forName(driver);
    		con = DriverManager.getConnection(url,user,password);
    		return con;
    	}catch(Exception e) {
    		System.out.println(e);
    		return null;
    	}
    }
	
}
