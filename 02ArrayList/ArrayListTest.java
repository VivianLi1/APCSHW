import java.util.*;

public class ArrayListTest{

    static void collapseDuplicates(ArrayList<Integer> L){
	for(int i = 0; i < L.size()-1; i++){
	    if(L.get(i) == L.get(i + 1)){
		L.remove(i+1);
	    }
	}
    }

    public static void main(String[]args){
	ArrayList<Integer> K = new ArrayList<Integer>();
	K.add(0, 1);
	K.add(1, 2);
	K.add(2, 2);
	K.add(3, 3);
	System.out.println(K.toString());
        collapseDuplicates(K);
	System.out.println(K.toString());

    }
}
