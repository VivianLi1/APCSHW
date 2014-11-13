import java.util.*;

public class ArrayListTest{
    ArrayList M = new ArrayList();

    public void collapseDuplicates(ArrayList<Integer> L){
	for(int i = 0; i < L.size(); i++){
	    if(L.get(i) == L.get(i + 1)){
		L.remove(i+1);
	    }
	}
    }

    public static void main(String[]args){
    }
}