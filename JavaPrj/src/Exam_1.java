
public class Exam_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c=0;
		for(a=3; a<=8; a++) {
			if(a==3||a==5) {
				System.out.println("<"+a+">´Ü");
			}
			for(b=1; b<=9; b++) {
				c=a*b;
				System.out.println(c);
			}
		}
	}

}
