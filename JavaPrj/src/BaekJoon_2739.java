import java.util.Scanner;
public class BaekJoon_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int b;
		int a = s.nextInt();
		
		for( b=1; b<=9; b++) {
			System.out.printf("%d * %d = %d\n", a,b,a*b);
		}
	}
}
