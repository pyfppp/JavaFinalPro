package ManageUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class disconnectDB {
	/**
	 * @Description 安区关闭数据库链接相关的各个对象
	 * @return void
	 * 
	 */
	public static void disconnect(ResultSet resultset, Statement statement, Connection connection) {
		try {
			resultset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @Description 安区关闭数据库链接相关的各个对象
	 * @return void
	 * 
	 */
	public static void disconnect(ResultSet resultset, PreparedStatement preparedstatement, Connection connection) {
		try {
			resultset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			preparedstatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
