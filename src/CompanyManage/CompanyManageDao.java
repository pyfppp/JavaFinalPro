package CompanyManage;

/**
 * @copyright (C),2018,信息科学与工程学院软件工程一班
 * @description 与数据表对接的企业管理接口
 * @date 2018-6-20 上午 11:58
 * @author 裴逸凡
 * 
 */

public interface CompanyManageDao {

	// 企业用户密码修改
	public int CompanyPasswordModify(Company company, String oldPassword);

	// 查询企业信息
	public int CompanyInfoExhibition();

}
