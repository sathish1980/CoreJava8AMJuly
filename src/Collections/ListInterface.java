package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListInterface {
	
	/*
	 * 
	 */
	
	public void ArrayListimplementation()
	{
		//ListInterface L = new ListInterface();
		LinkedList<Integer> al2 = new LinkedList<>();
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);
		al.add(1);
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(12);
		al.add(1, 99);
		al.addAll(al1);
		System.out.println(al);
		
		for(int eachvalue :al)
		{
			System.out.println(eachvalue);
		}
		
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		Iterator i =al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//update
		al.set(2, 2000);
		System.out.println(al);
		
		// delete
		al.remove(2);
		System.out.println(al);
		al.removeFirst();
		al.removeLast();
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(3000));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListInterface L = new ListInterface();
		L.ArrayListimplementation();
	}

}
