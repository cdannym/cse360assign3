/*
 * Student Name: Carlos Martinez
 * Student PIN: 35
 * Description: This program utilizes three methods that allow the user 
 * 				to insert values into an array, make the array larger
 * 				if capacity is reached, and print the array's values 
 * 				so the user can see them.
 */

package cse360assign2;
public class OrderedIntList {
	protected int[] array;  
	protected int counter; 
	private static boolean test = true;
	
	
	OrderedIntList ()
	{
		array = new int[10];
	}
	
	/**
	   * This method is used to insert integers into the array.
	   * @param value this is the value that gets inserted.
	   * @return there is nothing to return.
	   */
	public void insert(int value) {
		if(counter == array.length){
			grow();
		}
		if(counter == 0){
			array[0] = value;
			counter++;
		}
		else {
			int finalIndex = 0;
			for (int index = 0; index < counter && value > array[index]; index++, finalIndex++){
				//where the break statement used to be
			}
			for (int index = counter; index > finalIndex; index--) {
				array[index] = array[index - 1];
			}
			array[finalIndex] = value; 
			counter++;
		}
	}
	
	/**
	   * This method is used to increase the size of the array 
	   * when it becomes full yet there are still values to be 
	   * inserted.
	   * @param there are no parameters.
	   * @return there is nothing to return.
	   */
	private void grow(){
		int[] temporary = new int[counter * 2];
		for (int index = 0; index < counter; index++ ){
			temporary[index] = array[index];
		}
		array = temporary;
	}
	
	/**
	   * This method is used to print the values that the array contains
	   * in columns of 5.
	   * @param there are no parameters
	   * @return there is nothing to return
	   */
	public void print() {
		for (int index = 0; index < counter; index++) {
			if (index % 5 == 0) {
				System.out.println();
			}
			System.out.print(array[index]+"\t");	
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		if(test = true){ //TOGGLE THIS BOOLEAN VARIABLE IN ORDER TO INSTRUMENT TEST 
			OrderedIntList object = new OrderedIntList();
			System.out.println("***Insert method***");
			System.out.println("Input Values: 2, 3, 72, 56, 30, 50, 3, 9, 8, 10 \n"); //10 values are inserted
			object.insert(2);
			object.insert(3);
			object.insert(72);
			object.insert(56);
			object.insert(30);
			object.insert(50);
			object.insert(3);
			object.insert(9);
			object.insert(8);
			object.insert(10);
			System.out.println("***Print method***");
			object.print();
			System.out.println("\n");
			System.out.println("***Grow method*** \n");
			System.out.println("Input Value: 11\n "); //11th value triggers (and tests) grow method
			object.insert(11);
			System.out.println("***Print method***");
			object.print();
			
			System.out.println("\n\n");
			
		}
		else {
			System.out.println("No instrument testing");
		}
		
	}
}