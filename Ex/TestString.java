package Ex;

public class TestString {
	public static void main(String[] args) {
		//문자열
				String name1 = new String("java");
				String name2 = "java";
				 
				//문자열 결합
				String name3 = "ja" + "va";
				System.out.println(name3);
				
				String str = name3 + 8.0;
				System.out.println(str);
				
				int num = 3 + 1;
				System.out.println(num);
				
				//숫자를 문자열과 더하면 문자열+문자열로 취급한다.
				String str2 = 7 + "7";
				System.out.println(str2);//결과 77
				
				//앞에있는것부터 순서대로 계산한다
				String str3 = 7 + 7 + " ";//(7+7)+""결과 "14"
				System.out.println(str3);
				
				String str4 = "" + 7 + 7;
				System.out.println(str4);
//				""+7 = "7" + 7 = 77결과
	}
}
