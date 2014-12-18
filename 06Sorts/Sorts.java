public class Sorts{

    public static void bubbleSort(int[] array){
	int temp;
	for(int i = 0; i < array.length; i++){
	    for(int j = 1; j < array.length; i++){
		if(array[i] > array[j]){
		    temp = array[i];
		    array[i] = array[j];
		    array[j] = temp;
		}
	    }
	}
    }
}
