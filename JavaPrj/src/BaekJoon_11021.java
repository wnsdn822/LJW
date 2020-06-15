import java.util.Scanner;
public class BaekJoon_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		for(int b=1; b<=a; b++) {
			int d=s.nextInt();
			int c = s.nextInt();
			System.out.printf("Case #%d: %d \n",b, d+c);
		}
	}

}
