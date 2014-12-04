public class OrderedSuperArray extends SuperArray{

    public void add(String s){
	super.add(s);
	insertionSort();
    }

    
    public void add(int index, String s){
	add(s);
    }  

    public String set(int index, String s){
        super.set(index, s);
	insertionSort();
	return super.set(index, s);
    }
}

