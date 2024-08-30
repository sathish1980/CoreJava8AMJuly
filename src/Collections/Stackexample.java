package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Stackexample {
	
	/*
	 * 
	 */
	
	public void stackListimplementation()
	{
		//ListInterface L = new ListInterface();
		Stack<Integer> al2 = new Stack<>();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(200);
		al.add(201);
		al.add(200);
		al2.add(3);
		al2.add(3);
		al2.add(4);
		al2.add(6);
		al2.add(1);
		al2.push(8);
		
		al2.addAll(al);
		al2.remove(0);
		al2.pop();
		System.out.println(al2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackexample L = new Stackexample();
		L.stackListimplementation();
	}

}
