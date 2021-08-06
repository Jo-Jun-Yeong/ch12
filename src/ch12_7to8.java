import java.util.HashMap;
/*#ch12_7 Iterator<E>
 * - 클래스를 작성할 때, Object타입 대신 T와 같은타입변수를 사용
 * 		-일반 클래스-
 * 		public interface Iterator{
 * 			booelan haNext();
 * 			Object next();
 * 			void remove();
 * 		}
 * 	
 * 		Iterator it = list.iterator();
 * 		while(it.hasNext()){
 * 			Student s = (Student)it.next();
 * 		}
 * 
 * 
 * 		-제네릭 클래스-
 * 		public interface Iterator<E>{
 * 			boolean haNext();
 * 			E next();
 * 			void remove();
 * 		}
 * 
 * 		-<Studeent>를 타입변수로 한 제네릭 클래스-
 * 		Iterator<Student> it = list.iterator<Student>();
 *  	while(it.hasNext()){
 *  		Student s = it.next();
 *  	}
 *  
 * #ch12_8 HashMap<K,V>
 * 	-여러 개의 타입변수가 필요한 경우, 콤마(,)를 구분자로 선언
 * ex)	HashMap<K,V> map = new HashMap<>(); //JDK1.7부터 생성자의<>생략 가능
 * 		map.put("홍길동", new Student("홍길동", ....));
 * 
 *		Stuednt a = map.get("홍길동");
 *		System.out.println(a.name);
 *		출력 : 홍길동
 *
 *		class Student{
 *		String name="";
 *		int ban, num, kor, eng, math;
 *
 *		public static void Student(String name, int ban,num,kor,eng,math){
 *			
 *		}
 *		
 *		}
 * */

public class ch12_7to8 {
	public static void main() {
		HashMap<String, Student> map = new HashMap<>();
		
		map.put("1등", new Student("홍길동", 1, 1, 100, 90, 95));
		Student one = map.get("1등");
		System.out.println(one.name);
	}
}

class Student{
	String name="";
	int ban;
	int num;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban,int num,int kor,int eng,int math) {
		this.name=name;
		this.ban=ban;
		this.num=num;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
		
	}
}
