
public class EnhancedFor {

	public static void main(String[] args) {
		int [] arr = {1,  2,  3, 4, 5};
		int b=0;
		
		for(int a : arr) {
			System.out.println(a);
			
		}
		
		System.out.println("향상된 for문 수현");
		
		for(int i=0; i<arr.length; i++) {
			b=arr[i];
			System.out.println(b);
		}
		
	}//main()
}
