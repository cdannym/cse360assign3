package cse360assign2;

public class TestAnalytics {

	public static void main (String args[] ){
		Analytics object = new Analytics();
		
		//Test when array is empty, all return -1
		System.out.println(object.mean(object));
		System.out.println(object.median(object));
		System.out.println(object.high(object));
		System.out.println(object.low(object));
		
		
		System.out.println("***Insert method***");
		System.out.println("Input Values: 1, 2, 3, 4, 5 \n"); //10 values are inserted
		object.insert(1);
		object.insert(2);
		object.insert(3);
		object.insert(4);
		object.insert(5);
		
		
		System.out.println("***Print method***");
		object.print();
		System.out.println("\n");
		
		
		System.out.println("***Mean method***");
		System.out.println(object.mean(object));
		System.out.println("\n");
		
		
		System.out.println("***Median method***");
		System.out.println(object.median(object));
		System.out.println("\n");
		
		
		System.out.println("***High method***");
		System.out.println(object.high(object));
		System.out.println("\n");
		
		
		System.out.println("***Low method***");
		System.out.println(object.low(object));
		System.out.println("\n");
		
		System.out.println("***NumInts method***");
		System.out.println(object.numInts(object));
		System.out.println("\n");
		
		System.out.println("***Grow method***");
		object.insert(6);
		object.insert(7);
		object.insert(8);
		object.insert(9);
		object.insert(10);
		object.insert(11);
		System.out.println("\n");
		object.print();
		System.out.println("\n");
	}
	
}
