/* #ch12_5 지네릭 타입과 다형성
 * 	- 참조변수와 생성자의 대입된 타입은 일치해야 한다.
 * 	  ex) ArrayList<Tv> list = new ArrayList<Tv>(); //Ok일치
 * 		  ArrayList<Product> list = new ArrayLIst<Tv>(); //에러 참조변수의 지네릭<Product>과 생성자의 지네릭<Tv>가 서로 일치 안함
 * 
 * 	- 지네릭 클래스간의 다형성은 성립(여히 대입된 타입은 일치해야 한다.)
 * 		List<Tv> list = new ArrayList<Tv>(); //Ok ArrayList가 List를 구현
 * 		List<Tv> list = new LinkedList<Tv>(); //Ok LinkedList가 List를 구현함
 * 
 * 	- 매개변수의 다형성도 성립
 * 		ArrayList<Product> list = new ArrayLIst<Product>();
 * 		list.add(new Product());
 * 		list.add(new Tv());		//Ok Product()의 자손도 가능
 * 		list.add(new Audio()); 	//Ok		""
 * 
 * *get()인 경우, 타입이 Product p = list.get(o)는 가능하지
 * 						Tv t 인 경우엔 get(o)의 타입이 Product이기 때문에
 * 						형변환을 해줘야 한다. Tv t = (Tv)list.add(o);
 * 
 * */
public class ch12_5 {

}
