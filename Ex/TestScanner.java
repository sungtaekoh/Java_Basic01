package Ex;
	import java.util.Scanner; // Scanner Ŭ������ ����ϱ� ������ �߰�
	
public class TestScanner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//Scanner Ŭ�������� ��ü�� ����
		
		String input = scanner.nextLine();	//�Է¹��� ������ input�� ����
		int num = Integer.parseInt(input);	//�Է¹��� ������ intŸ������ ������ ��ȯ
		
		int num1 = scanner.nextInt();	//������ �Է¹޾Ƽ� ���� num�� ����
		
	}

}
