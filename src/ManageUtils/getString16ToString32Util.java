package ManageUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 将16位MD5字符串转换成32位的MD5字符串
 * @author 裴逸凡
 * @param  16进制表示的字符串
 * @return result 字符串
 */

public class getString16ToString32Util {
	public static String String16ToString32(String sourceStr) {
	String result = "";
    try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(sourceStr.getBytes());
        byte b[] = md.digest();
        int i;
        StringBuffer buf = new StringBuffer("");
        for (int offset = 0; offset < b.length; offset++) {
            i = b[offset];
            if (i < 0)
                i += 256;
            if (i < 16)
                buf.append("0");
            buf.append(Integer.toHexString(i));
        }
        result = buf.toString();
    } catch (NoSuchAlgorithmException e) {
        System.out.println(e);
    }
    return result;
}
	}

