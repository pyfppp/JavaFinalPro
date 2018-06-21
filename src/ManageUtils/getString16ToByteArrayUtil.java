package ManageUtils;

/**
 * 16进制表示的字符串转换为字节数组
 *
 * @author 裴逸凡
 * @param  16进制字符串
 * @return 字节数组
 */

public class getString16ToByteArrayUtil {
	public static byte[] HexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] b = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        // 两位一组，表示一个字节,把这样表示的16进制字符串，还原成一个字节
	        b[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character
	                .digit(s.charAt(i + 1), 16));
	    }
	    return b;
	}
}
