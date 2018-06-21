package ManageUtils;


import java.security.NoSuchAlgorithmException;
import static ManageUtils.getString16ToString32Util.String16ToString32;

/**
 * @Copyright (C),2018,信息科学与工程学院软件工程系一班
 * @Author 裴逸凡
 * @Date 2018-6-20 下午15:04
 * @Description 对所有类型用户修改密码功能的封装工具类
 * 
 * 
 */

public class modifyPasswordUtilUtil {
	
	/**
	 * @Descreiption 更改当前用户密码
	 * @return 一个boolean类型值
	 *
	 */
	public static boolean PasswordModiify(String companyName,String old32MD5,String newPassword) {
		String new32MD5 = getMD5StringUtil.getMD5Code(newPassword);
		if(new32MD5==old32MD5) {
			return true;
		}else {
			return false;
		}
	}
}
