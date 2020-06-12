import java.util.Scanner;
public class BaekJoon__1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int A=s.nextInt();
		int B=s.nextInt();
		
		if(A>B)
			System.out.println(">");
		else if(A<B)
			System.out.println("<");
		else
			System.out.println("==");
	}

}
