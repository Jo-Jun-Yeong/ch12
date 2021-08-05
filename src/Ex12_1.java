import java.util.*;

class Product {}
class Tv extends Product{
	
}
class Audio extends Product{
	
}

public class Ex12_1 {
	public static void main(String[] args) {
		ArrayList <Product> productlist  = new ArrayList<Product>();
		ArrayList <Tv> 		tvList = new ArrayList<Tv>();
		
//		ArrayList<Product>  tvList = new ArrayList<Tv>(); 타입 	//에러 변수가 다르기 떄문에 오류
//		List<Tv> 			tvList = new ArrayList<Tv>();		/Ok ArrayList가 List를 구현해 주기 때문에 가능
		
		productlist.add(new Tv());		//public  boolean add(Product e) //Product와 그 자손  Ok
		productlist.add(new Audio()); 	
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productlist);
	}

	public static void printAll(ArrayList<Product> list) {
		
		for(Product p : list) 
			System.out.print(p);
	}//printAll()
	
}
