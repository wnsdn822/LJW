
public class Five_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; 
		int hap=0;
		int num[] = new int[90];
		
		for(i=0; i<90; i++) {
			num[i] =(i+10)+1;
			hap+=num[i];
		}
		i=0;
		while (i<90) {
			System.out.println(num[i]);
			i ++;
		}
		System.out.println(hap);

	
	}

}
 
