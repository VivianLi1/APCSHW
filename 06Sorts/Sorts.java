import java.util.*;

public class Sorts{

    public static int[] makeArray(int n){
        int[] arr = new int[n];
	Random rand = new Random();
	for(int i = 0; i < n; i++){
	    arr[i] = rand.nextInt((500000 - 100000) + 1) + 500000;
	}
	return arr;
    }

    public static void bubbleSort(int[] array){
	for(int i = 1; i < array.length; i++){
	    for(int j = 0; j < array.length - i; j++){
		if(array[j] > array[j + 1]){
		    int temp = array[j + 1];
		    array[j + 1] = array[j];
		    array[j] = temp;
		}
	    }
	}
    }

    public static void insertionSort(int[] array){
	for(int i = 1; i < array.length; i++){
 	    int temp = array[i];
	    int j = i - 1;
	    while(j > -1 && array[j] > temp){
		array[j + 1] = array[j];
		j--;
	    }
	    array[j + 1] = temp;
	}	
    }


    public static void selectionSort(int[] array){
	int hold = 0;
	for(int i = 1; i < array.length; i++){
	    for(int j = i + 1; j < array.length; j++){
		if(array[j] < array[hold]){
		    hold = j;
		    int temp = array[i];
		    array[i] = array[hold];
		    array[hold] = temp;
		}
	    }
	}
    }
}


