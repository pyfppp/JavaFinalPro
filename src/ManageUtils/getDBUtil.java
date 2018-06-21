package ManageUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Copyright (C),2018,信息科学与工程学院软件工程系一班
 * @Author 裴逸凡
 * @Date 2018-6-20 下午 14:26
 * @Description 对数据库常用操作的封装工具类
 * 
 * 
 */

public class getDBUtil {

	// 连接数据库数据设置
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String USERNAME = "root";
	private static String URL = "jdbc:mysql://localhost:3306/practice";
	private static String PASSWORD = "peiyifan";

	/**
	 * @Descreiption 获取目标数据库链接
	 * @Parameters null
	 * @return Connection类实体对象
	 *
	 */
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}


}
