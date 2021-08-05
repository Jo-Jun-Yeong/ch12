import java.util.*;

class Fruit implements Eatable{
	public String toString() {return "Fruit";}
	
}

interface Eatable{}

class Apple extends Fruit{public String toString () {return "Apple";}}
class Grape extends Fruit{public String toString () {return "Grape";}}
class Toy{public String toString () {return "Toy";}}

class Ex12_3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitbox =  new FruitBox<>();
		FruitBox<Apple> applebox = new FruitBox<>();
		FruitBox<Grape> grapebox = new FruitBox<>();
		
		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
		
		applebox.add(new Apple());
		applebox.add(new Apple());
		
		grapebox.add(new Grape());
		grapebox.add(new Grape());
		grapebox.add(new Grape());
		
		
		System.out.println(fruitbox.size());
		System.out.println("FruitBox : " + fruitbox.list);
		System.out.println("AppleeBox : " + applebox.list);
		System.out.println("GrapeBox : " + grapebox.list);
	}//main()
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
					//interface는 ","가 아니라 "&" 

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);} 	//박스에 추가 메서드
	T get(int i) {return list.get(i);}	//박스에서 꺼낼때 메서드
	int size() {return  list.size();}
	public String toString() {return list.toString();}
}
