/*#ch12_2 타입 변수
 * 	- 클래스를 작성할 때,  Object타입 대신 타입변수(E)를 선언해서 사용
 *  public class ArrayList extends AbstractList{
 *  	private transient Object [] elementData;
 *  	public boolean add(Object o){생략};
 *  	public Object get(int index){생략};
 *  } 일반 클래스(1)
 *  
 *  위의 코드를
 * 	public class ArrayList<E> extends AbstractList{
 *  	private transient E [] elementData;
 *  	public boolean add(E o){생략};
 *  	public E get(int index){생략};
 *  }지네릭 클래스(2)
 *  
 *  <""> : ""는 뭘 써도 상관 없고 여러 글자도 되지만
 *  		보통 Type의 "T" Elment의 "E"가 대표적이다.
 *  
 *  - 객체를 생성시, 타입변수(E)대신 실제 타입(Tv)을 지정 대입.
 *  	//타입변수 E대신에 실제타입<Tv>를 대입한다.
 *  
 *   ex) ArrayList<Tv> tvList = new ArrayList<Tv>();
 *   		(참조변수)	<"">		=일치=		생성자<"">
 *   
 *   위와같이 객체 생성시(2)의 class의 wlspflrtmsms <Tv>가 된다.
 *   따라서 타입변수 대신 실제 타입이 지정되면, 형변환 과 생략이 되는 장점이 있다.
 *   
 *   ArrayList tvList = new ArrayList();
 *   tvList.add(new Tv());
 *   Tv t = (Tv)tv.List.get(0); <-여기의 tv.List는 Object타입이다
 *   
 *   위의 코드를 제네릭 코드를 적용하면
 *   
 *   ArrayList<Tv> tvList = new ArrayList<Tv>();
 *   tvList.add(new  Tv());
 *   Tv t = tvList.get(0); <-여기의 tvList 타입은 <Tv>이다
 *   따라서 위와같이 형변환이 필요가 없어진다.
 *   * */
public class ch12_2 {

}
