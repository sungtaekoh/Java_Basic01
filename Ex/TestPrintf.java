package Ex;

public class TestPrintf {
	public static void main(String[] args) {
		//printf를 이용한 출력
		
		//System.out.printf("age:%d", age);
//		System.out.printf("age:%c%n", 14);
//		System.out.printf("age:14%n");
		
//		System.out.printf("age:%d year:%d", age, year);
//		System.out.printf("age:%d year:%d", 14, 2019);
		
//		문자열 출력
		String url = "가나다라마바사아자차카타파하";
		System.out.printf("1.%s%n", url);
		System.out.printf("2.[%20s]%n", url);// 20글자만큼의 띄어쓰기(우측정렬)
		System.out.printf("3.[%-20s]%n", url);// 20글자만큼의 띄어쓰기(좌측정렬)
		System.out.printf("4.%.8s%n", url); //왼쪽에서 8글자만큼만 출력
		System.out.printf("5.%1s%n", url);
	}
}
