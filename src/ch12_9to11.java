/*#12_9 제한된 지네릭 클래스
 * 	-extends로 대입할 수 있는 타입을 제한
 * 	ex)
 * 		class FruitBox <T extends Fruit>{
 * 			ArrayList<T> list = new ArrayList<>();
 * 			...
 * 		}
 * 	
 * 		Fruit<Apple> AppleBox = new Fruit<Apple>();	//OK
 * 		Fruit<Toy> ToyBox = new Fruit<Toy>(); //에러
 *#12_11 제네릭스의 제약
 *	-1. 타입 변수에 대입은 인스턴스 별로 다르게 가능함
 *	ex) Box<Apple> appleBox = new Box<Apple>(); 	//Apple객체만 가능
 *		Box<Grape> grapeBox = new Box<Grape>(); 	//Grape객체만 가능
 *
 *	-2. 따라서 static 맴버에 타입변수 사용 불가
 *	ex) class Box<T> {
 *			static T item;
 *			static int compare(T t1, t2, t3){...} //에러
 * *		}
 * 
 *  -3. 배열,객체 생성할 때 타입변수 사용 불가, 타입변수로 배열 선언은 가능
 * 	ex) class Box{
 * 			T [] inArr; //Ok T타입의 배열을 위한 참조변수
 * 			....
 * 
 * 			T[] toArray(){
 * 				T [] tmpArr = new [item.length]; //에러 제네렉 배열 생성 불가.
 * 			}
 * 		}
 * **즉 new다음 나올 객체,배열의 생성은 
 * 		확정된 참조변수만 가능하다.**
 * */
public class ch12_9to11 {

}
