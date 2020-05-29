import java.util.ArrayList;
import java.util.List;
public class Arraylist {

	public static void main(String[] args) {
		//List 인터페이스는 메모리에 올릴 수 없기 떄문에 ArrayList 클래스를 통해 메모리를 올림
		List<String> rList = new ArrayList<>();
		
		// List 컬렉션프레임워크에 데이터를 추가함
		rList.add("이협건");
		rList.add("이준우");
		rList.add("하하하");
		rList.add("ㅜㅜㅜ");
		rList.add("홍길동");
		
		//배열크기 출력
		System.out.println("배열의 크기" + rList.size ());
		
		for(int i=0; i<rList.size(); i++) {
			System.out.println("["+ i +"]번째 배열 기억공간 :" + rList.get(i));
		}
	}

}
