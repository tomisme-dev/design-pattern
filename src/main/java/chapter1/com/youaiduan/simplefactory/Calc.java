package chapter1.com.youaiduan.simplefactory;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
	public static Pattern patter = Pattern.compile("(-?\\d+\\.?\\d*)(\\s*[+-/*]\\s*)(-?\\d+\\.?\\d*)");
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("请输入，例如：a+b");
			String input = scanner.nextLine();
			input = input.trim();
//			退出逻辑
			if(input.trim().equalsIgnoreCase("quit")) {
				System.out.println("即将推出，拜拜");
				break;
			}
//			匹配规则
			Matcher matcher = patter.matcher(input);
			if(!matcher.matches()) {
				System.out.println("输入不符合规范，请重新输入：");
				continue;
			}
			
			String operator = matcher.group(2);
			Double num1 = Double.valueOf(matcher.group(1));
			Double num2 = Double.valueOf(matcher.group(3));
			AbstractOperation operation = OperationFacctory.createOperate(operator);
			operation.setNum1(num1);
			operation.setNum2(num2);
			try {
				double result = operation.getResult();
				System.out.println(result);
			} catch (NumberException e1) {
				e1.printStackTrace();
				System.out.println(e1.getMessage());
			}
			
			try {
				double calc = calc(Double.valueOf(matcher.group(1)), Double.valueOf(matcher.group(3).trim()), matcher.group(2));
				System.out.println(input + "=" + calc);
			} catch (NumberFormatException e) {
				System.out.println("输入不符合规范");
			} catch (ZeroException e) {
				System.out.println("除数不能为零，请重新输入");
			}
			
		}
		System.out.println(patter.matcher("0.23+57").groupCount());
//		System.out.println(patter.matcher("0.23+57").group());
		Matcher matcher = patter.matcher("0.23+57");
		matcher.find();
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
		System.out.println(matcher.group(3));
		
	}
	
	
	public static double calc(double a, double b, String sign) throws ZeroException {
		double result = 0;
		switch (sign) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
//			除数不能为零
			if(Math.abs(b) < 1E-8) {
				throw new ZeroException();
			}
			result = a / b;
		default:
			break;
		}
		return result;
	}
}


class ZeroException extends Exception {
	private static final long serialVersionUID = -5973094133630409548L;
	
}