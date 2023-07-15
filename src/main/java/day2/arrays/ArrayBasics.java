package day2.arrays;

import java.util.Arrays;

public class ArrayBasics{
	//count average
	int average(int[] input){
		int sum = 0;
		int average = 0;
		for(int i=0;i<input.length;i++){
			sum = sum + input[i];
		}

		return sum/input.length;
	}

	int max(int[] input){
		int max = input[0];
		for(int i=1;i<input.length;i++){
					if(input[i]>max){
						max = input[i];
					}
				}

				return max;

	}
    

    public static void main(String[] args) {
    		//Count the average

    		//find max with in array

    		int [] arr = {1,2,5,7,9,44,86};

    		ArrayBasics basics = new ArrayBasics();
    		System.out.println(basics.average(arr));
    		System.out.println(basics.max(arr));

    		int [] copyArr = arr.clone();

    		copyArr[5] = 5;


			System.out.println(copyArr[5]);
    		System.out.println(arr[5]);



			int[] copiedArray = new int[7];
			System.arraycopy(arr,0,copiedArray,6,7);

			 copiedArray[5] = 55;


			System.out.println(copyArr[5]);
    		System.out.println(arr[5]);


    	}
    }


