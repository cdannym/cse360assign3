package cse360assign2;

public class Analytics extends OrderedIntList{
	public double mean;
	public int median = 0;
	public int high = 0;
	public int low = 0;
	
	/**
	   * This method is used to add each element in the array's values and divide
	   * them by the number of elements in the array
	   * @param a user-entered array
	   * @return the evaluated mean
	   */
	public double mean(Analytics value){
		if(counter != 0){
			mean = 0;
			for(int i = 0; i < counter; i++){
				mean = mean + value.array[i];
			}
			mean = mean / counter;
		}
		else{
			mean = -1;
		}
		return mean;
	}
	/**
	   * This method is used to print the median of the array
	   * @param a user-entered array
	   * @return the evaluated median
	   */
	public int median(Analytics value){
		if(counter != 0){
			if(counter % 2 == 0){
				median = value.array[(counter / 2) - 1] + value.array[counter / 2];
				median = median / 2; 
			}
			else {
				median = value.array[counter / 2];
			}
		}
		else{
			median = -1;
		}
		return median;
	}
	
	/**
	   * This method is used to print the last value in the array which is also
	   * the largest value in the array
	   * @param a user-entered array
	   * @return the highest value
	   */
	public int high(Analytics value){
		if(counter != 0){
			high = value.array[counter-1];
		}
		else {
			high = -1;
		}
		return high;
	}
	
	/**
	   * This method is used to print the first value in the array which is also
	   * the smalles value in the array
	   * @param a user-entered array
	   * @return the lowest value
	   */
	public int low(Analytics value){
		if(counter != 0){
			low = value.array[0];
		}
		else{
			low = -1;
		}
		return low;
	}
	/**
	   * This method is used to return the number of values in the array
	   * @param a user-entered array
	   * @return the number of values
	   */
	public int numInts(Analytics value){
		return counter;
	}
	
}
