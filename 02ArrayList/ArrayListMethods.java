import java.util.*;

public class ArrayListMethods{

    static void collapseDuplicates(ArrayList<Integer> L){

	for(int g = 0; g < L.size() - 1; g++){
	    for(int i = 1; i < L.size(); i++){
		if(L.get(g) == L.get(i)){
		    L.remove(i);
		}
	    }	   
	}
    }

    static void randomize(ArrayList<Integer> L){
	Random rand = new Random();
	for(int i = 0; i < L.size(); i++){
	   int temp = L.remove(i);
	   L.add(rand.nextInt(L.size() - 1), temp);
	}
    }


    public static void main(String[]args){
	ArrayList<Integer> K = new ArrayList<Integer>();
	K.add(1);
	K.add(2);
	K.add(2);
	K.add(2);
	K.add(3);
       	K.add(3);
	System.out.println(K.toString());
	collapseDuplicates(K);
	System.out.println(K.toString());

	ArrayList<Integer> M = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++){
	    M.add(i, i);
	}
	System.out.println(M);
	randomize(M);
	System.out.println(M);
    }
}
