package ManageUtils;

import java.util.Random;

/**
 * @Copyright (C),2018,信息科学与工程学院软件工程系一班
 * @Author 裴逸凡
 * @Date 2018-6-21 下午14:19
 * @Description 获取四个字符组成的验证码
 * 			
 */

public class getCheckCodeUtil {
	public static String getCheckCodeUtil() {
		StringBuilder stringBuilder = new StringBuilder();
		String sourceString = "123456789abcdefghijklmnpqrstuvwxyz";
		for(int i=0;i<4;i++) {
			Random random = new Random();
			int choice = random.nextInt(sourceString.length());
			stringBuilder.append(sourceString.toCharArray()[choice]);
		}
		String finalString = stringBuilder.toString();
		return finalString;
	}
}
