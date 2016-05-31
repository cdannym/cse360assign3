/*
 * Student Name: Carlos Martinez
 * Student PIN: 35
 * Description: This program utilizes three methods that allow the user 
 * 				to insert values into an array, make the array larger
 * 				if capacity is reached, and print the array's values 
 * 				so the user can see them.
 */

package cse360assign1;
public class OrderedIntList {
	private int[] array;  
	private int counter; 
	
	
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
}