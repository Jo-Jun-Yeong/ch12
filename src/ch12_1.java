/*#지네릭스(Generics)란?
 * 	-컴파일시 타입을 체크해 주는 기술(compie-time type -check) -JDK1.5
 *  -객체의 타입 안정성을 높이고  형변환의 번거러움이 줄어든다.
 *    지네렉스가 도입된 이후에는 꼭 지네렉스를 사용 한다.
 *    ArrayList<Object> Arr = new ArrayList<Object>(); //일반클래스
 *    ArrayList<String> Arr = new ArrList<String>(); //지네릭클래스
 *    
 *  Ex) // Tv객체만 생성할 수 있는 ArrayList작성
 *  		ArrayList<Tv> tvList = new ArrayList<Tv>();
 *  				 <"">""만 저장이 가능, 타입정보를 추가 제공해 준다.
 *  
 *   		tvList.add(new Tv()); 	//tv타입 이므로 저장 가능
 *   		tvList.add(new Audio()); //컴파일에서 에러를 잡아준다.
 *   
 *   즉, 런타임에서 발생할 에러를 컴파일 타임에서 잡아 낼 수 있게끔 해주는 기능이다.
 * */
public class ch12_1 {

}
