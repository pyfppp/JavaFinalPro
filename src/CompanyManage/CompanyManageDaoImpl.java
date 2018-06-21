package CompanyManage;

import static ManageUtils.getDBUtil.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static ManageUtils.disconnectDB.disconnect;
import static ManageUtils.getMD5StringUtil.getMD5Code;

/**
 * @copyright (C),2018,信息科学与工程学院软件工程一班
 * @description 与数据表对接的企业管理接口实现
 * @date 2018-6-20 上午 12:00
 * @author 裴逸凡
 * 
 */

public class CompanyManageDaoImpl implements CompanyManageDao {

	public int CompanyPasswordModify(Company company, String oldPassowrd) {

		// 用户输入的oldpassword验证是否为空
		String sql = "select * from company where password = ?";

		Connection connection = getConnection();
		// 将用户验证输入的oldpassword转换成32位MD5码
		String old32MD5 = getMD5Code(oldPassowrd);
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, old32MD5);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				// 1表示结果集不为空
				return 1;
			} else {

				// 0表示结果集为空
				return 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}

		// -1表示程序本身出现错误
		return -1;
	}

	@Override
	public int CompanyInfoExhibition() {
		// TODO Auto-generated method stub
		Connection connection = getConnection();

		return 1;
	}

}
