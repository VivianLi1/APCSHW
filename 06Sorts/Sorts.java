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
	int temp;
	for(int i = 1; i < array.length; i++){
	    for(int j = 0; j < array.length - i; j++){
		if(array[j] > array[j + 1]){
		    temp = array[j + 1];
		    array[j + 1] = array[j];
		    array[j] = temp;
		}
	    }
	}
    }

    public static void insertionSort(int[] array){
	for(inti = 1; i < array.length
    }
}
