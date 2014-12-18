import java.util.*;

public class Driver{

    public static void main(String[] args){
	double startTime, endTime;
	int n = 5;

	int[] test = Sorts.makeArray(n);
	System.out.println(Arrays.toString(test));

	int[] clone = Arrays.copyOf(test, n);
	//System.out.println(Arrays.toString(clone));
	startTime = System.currentTimeMillis();
	Sorts.bubbleSort(clone);
	endTime = System.currentTimeMillis();
	System.out.print("bubble: ");
	System.out.println(endTime - startTime);
	System.out.println(Arrays.toString(clone));
	/*
	startTime = System.currentTimeMillis();
	Sorts.insertion(clone2);
	endTime = System.currentTimeMillis();
	System.out.println("insertion: ");
	System.out.print(endTime - startTime);
	
	startTime = System.currentTimeMillis();
	Sorts.selection(clone3);
	endTime = System.currentTimeMillis();
	System.out.println("selection: ");
	System.out.print(endTime - startTime);
	
	startTime = System.currentTimeMillis();
	Arrays.sort(clone4);
	endTime = System.currentTimeMillis();
	System.out.println("Array.sort: ");
	System.out.print(endTime - startTime);
	*/
    }
}

