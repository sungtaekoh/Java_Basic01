package Ex;

public class TestPrintf {
	public static void main(String[] args) {
		//printf�� �̿��� ���
		
		//System.out.printf("age:%d", age);
//		System.out.printf("age:%c%n", 14);
//		System.out.printf("age:14%n");
		
//		System.out.printf("age:%d year:%d", age, year);
//		System.out.printf("age:%d year:%d", 14, 2019);
		
//		���ڿ� ���
		String url = "�����ٶ󸶹ٻ������īŸ����";
		System.out.printf("1.%s%n", url);
		System.out.printf("2.[%20s]%n", url);// 20���ڸ�ŭ�� ����(��������)
		System.out.printf("3.[%-20s]%n", url);// 20���ڸ�ŭ�� ����(��������)
		System.out.printf("4.%.8s%n", url); //���ʿ��� 8���ڸ�ŭ�� ���
		System.out.printf("5.%1s%n", url);
	}
}
