package cse360assign2;

public class Analytics extends OrderedIntList{
	public double mean;
	public int median = 0;
	public int high = 0;
	public int low = 0;
	
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
	
	public int high(Analytics value){
		if(counter != 0){
			high = value.array[counter-1];
		}
		else {
			high = -1;
		}
		return high;
	}
	
	public int low(Analytics value){
		if(counter != 0){
			low = value.array[0];
		}
		else{
			low = -1;
		}
		return low;
	}
	
	public int numInts(Analytics value){
		return counter;
	}
	
}
