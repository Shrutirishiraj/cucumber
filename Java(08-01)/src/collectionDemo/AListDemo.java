package collectionDemo;

import java.util.ArrayList;

public class AListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al = new ArrayList<>();
		al.add(123);
		al.add("abc");
		al.add(2.3f);
		al.add('c');
		al.add(true);
		
		
		System.out.println("number of elements in array list : " + al.size());
		
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println("element at index "+i+"is : "+al.get(i));
		}
		
		al.add(1, "element");
	
		
		System.out.println("     new list");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("element at index "+i+"is : "+al.get(i));
		}
	}

}
