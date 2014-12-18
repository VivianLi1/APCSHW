import java.util.*;

public class Driver{

    public static void main(String[] args){
	double startTime, endTime;
	int n = 50000;

	int[] test = Sorts.makeArray(n);
	//System.out.println(Arrays.toString(test));

	int[] clone = Arrays.copyOf(test, n);
	//System.out.println(Arrays.toString(clone));
	startTime = System.currentTimeMillis();
	Sorts.bubbleSort(clone);
	endTime = System.currentTimeMillis();
	System.out.print("bubble: ");
	System.out.println(endTime - startTime);
	//System.out.println(Arrays.toString(clone));
	
	int[] clone2 = Arrays.copyOf(test, n);
	startTime = System.currentTimeMillis();
	Sorts.insertionSort(clone2);
	endTime = System.currentTimeMillis();
	System.out.print("insertion: ");
	System.out.println(endTime - startTime);
	//System.out.println(Arrays.toString(clone));
      
	int[] clone3 = Arrays.copyOf(test, n);
	startTime = System.currentTimeMillis();
	Sorts.selectionSort(clone3);
	endTime = System.currentTimeMillis();
	System.out.print("selection: ");
	System.out.println(endTime - startTime);
	//System.out.println(Arrays.toString(clone));
	
	int[] clone4 = Arrays.copyOf(test, n);
	startTime = System.currentTimeMillis();
	Arrays.sort(clone4);
	endTime = System.currentTimeMillis();
	System.out.print("Array.sort: ");
	System.out.println(endTime - startTime);
	//System.out.println(Arrays.toString(clone));

	
    }
}

