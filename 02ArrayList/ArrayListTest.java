import java.util.*;

public class ArrayListTest{

    static void collapseDuplicates(ArrayList<Integer> L){
	int g = 0;
	while(g < L.size() - 1){
	    for(int i = 1; i < L.size()-1; i++){
		if(L.get(g) == L.get(i)){
		    L.remove(i);
		}
		g++;
	    }
	   
	}
    }


    public static void main(String[]args){
	ArrayList<Integer> K = new ArrayList<Integer>();
	K.add(1);
	K.add(2);
	K.add(2);
	K.add(2);
	K.add(3);
	System.out.println(K.toString());
	collapseDuplicates(K);
	System.out.println(K.toString());

    }
}
