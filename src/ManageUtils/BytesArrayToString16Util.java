package ManageUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 将MD5字节数组转换成16进制字符串
 *
 * @author 裴逸凡
 * @param  MD5字节数组
 * @return MD516进制字符串
 */

public class BytesArrayToString16Util {
	public static String BytesToHexString(byte[]bytes) {
		StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < bytes.length; i++) {
	        String hex = Integer.toHexString(0xFF & bytes[i]);
	        if (hex.length() == 1) {
	            sb.append('0');
	        }
	        sb.append(hex);
	    }
	    return sb.toString();
	}
}


