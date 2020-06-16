import java.util.Scanner;
public class BaekJoon_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int b=1; b<=a; b++) {
			for(int i=1;i<=b;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	}


