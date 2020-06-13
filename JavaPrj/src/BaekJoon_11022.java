import java.util.Scanner;
public class BaekJoon_11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int b=1; b<=a; b++) {
			int c= s.nextInt();
			int d =s.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n",b, c, d, c+d);
		}
	}

}
