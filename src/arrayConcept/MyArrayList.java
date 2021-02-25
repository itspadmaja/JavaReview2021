package arrayConcept;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		//default class
		//dynamic array
		//order based/Index based Arraylist/collection
		
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		ar.add(600);
		ar.add(700);
		ar.add(800);
		ar.remove(4);
		ar.add(900);
		ar.add(1000);
		ar.add(1100);
		//ar.get(4);
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		ar.add("Krishna");
		ar.add(25);
		ar.add(12.22);
		ar.add('M');
		ar.add(true);
		//to print all values from arraylist
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		

	}

}
