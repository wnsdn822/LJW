import java.util.Scanner;
public class BaekJoon_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		
		int a;
		int b;
		int c;
		for(c=0; c<t; c++) {
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.printf("%d", a+b);
		System.out.println();
	}

}
}