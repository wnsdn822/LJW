import java.util.Scanner;
public class BaekJoon_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int A=s.nextInt();
		int B=s.nextInt();
		System.out.println(A*(B%10));
		System.out.println(A*((B%100)/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
	}

}
