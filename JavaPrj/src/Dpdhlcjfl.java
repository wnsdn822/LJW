
public class Dpdhlcjfl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa= new int[3];
		try {
			aa[2] = 100/0;
			aa[3] = 100;
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열첨자가 배열 크기보다 커요~~");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누는 등의 오류");
		}finally {
			System.out.println("아 부분은 무조건 나와요~~");
		}
	}

}
