package Ex;

public class TestString {
	public static void main(String[] args) {
		//���ڿ�
				String name1 = new String("java");
				String name2 = "java";
				 
				//���ڿ� ����
				String name3 = "ja" + "va";
				System.out.println(name3);
				
				String str = name3 + 8.0;
				System.out.println(str);
				
				int num = 3 + 1;
				System.out.println(num);
				
				//���ڸ� ���ڿ��� ���ϸ� ���ڿ�+���ڿ��� ����Ѵ�.
				String str2 = 7 + "7";
				System.out.println(str2);//��� 77
				
				//�տ��ִ°ͺ��� ������� ����Ѵ�
				String str3 = 7 + 7 + " ";//(7+7)+""��� "14"
				System.out.println(str3);
				
				String str4 = "" + 7 + 7;
				System.out.println(str4);
//				""+7 = "7" + 7 = 77���
	}
}
