package ManageUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import static ArrayUtils.BytesArrayToHex.*;

/**
 * @Copyright (C),2018,信息科学与工程学院软件工程系一班
 * @Author 裴逸凡
 * @Date 2018-6-20 下午16:37
 * @Description 获取指定MD5码的封装工具类
 * 			
 */
public class getMD5Util {
	public static String getMD5Code(String originalString) {
		String targetString = "";
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] targetByteArray = null;
			try {
				targetByteArray = originalString.getBytes("utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			messageDigest.update(targetByteArray);
			byte[] resultByteArray = messageDigest.digest();
			
			//使用自己封装的jar包MyUtils并静态导入，直接使用方法而不用类调用或隐式调用			
			targetString = BytesToHexString(resultByteArray);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return targetString;
	}
}
