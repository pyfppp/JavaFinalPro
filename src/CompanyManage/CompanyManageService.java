package CompanyManage;
/**
 * @copyright (C),2018,信息科学与工程学院软件工程一班
 * @description 与CompanyManageDao结合定义功能接口
 * @date 2018-6-20 上午 12:00
 * @author 裴逸凡
 * 
 */
public interface CompanyManageService {
	public boolean CompanyPasswordModify(Company company);
	
	
	public boolean CompanyInfoExhibition(Company company);
}
