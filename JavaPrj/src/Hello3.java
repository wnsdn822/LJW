import java.io.IOException;
import java.util.Scanner;
public class Hello3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a,b;
		int result;
		char k;
		
		Scanner s = new Scanner(System.in);
		System.out.printf("ù��° ����� ���� �Է��ϼ���: ");
		a = s.nextInt();
		System.out.print("+-*/%==>");
		k = (char) System.in.read();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� : ");
		b = s.nextInt();
		
		if(k=='+') {
			result = a+b;
			System.out.println(a + "+" + b + "=" + result);
		}
		if(k=='-') {
			result = a-b;
			System.out.println(a + "-" + b + "=" + result);
		}
		if(k=='*') {
			result = a*b;
			System.out.println(a + "*" + b + "=" + result);
		}
		if(k=='/') {
			if(b!=0) {
			result = a/b;
			System.out.println(a + "+" + b + "=" + result);
		}else
		 System.out.println("0���� ������ �ȵ˴ϴ�.");
			
	}
	if(k=='%') {
		if(b!=0) {
			result = a % b;
			System.out.println(a + "%" + b + "=" + result);
		}else
		 System.out.println("0���� ������ ������ ���� �ȵ˴ϴ�. ");
	}
}
}