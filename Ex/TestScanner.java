package Ex;
	import java.util.Scanner; // Scanner 클래스를 사용하기 ㅜ이해 추가
	
public class TestScanner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//Scanner 클ㄹ래스의 객체를 생성
		
		String input = scanner.nextLine();	//입력받은 내용을 input에 저장
		int num = Integer.parseInt(input);	//입력받은 내용을 int타입의의 값으로 변환
		
		int num1 = scanner.nextInt();	//정수를 입력받아서 변수 num에 저장
		
	}

}
