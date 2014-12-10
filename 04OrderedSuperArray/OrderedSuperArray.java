public class OrderedSuperArray extends SuperArray{

    public OrderedSuperArray(){
	super();
    }

    public OrderedSuperArray(int length){
	super(length);
    }

    public void add(String s){
	super.add(s);
	insertionSort();
    }

    
    public void add(int index, String s){
	add(s);
    }  

    public String set(int index, String s){
	String keep = get(index);
        super.set(index, s);
	add(keep);
	return arguments.callee;
    }

    public static int find(String target){
	int temp = 0;
	for(int i = 1; i < data.length; i *= 2){
	    if(get(i - 1).equals(target)){
		if( get(i - 2).equals(target)){
		    for(int j = i - 2; j > 0; j--){
			if(!get(j - 1).equals(target)){
			    temp = j - 1;
			}
		    }
		}
		temp = i - 1;
		break;
	    }
	}
	return temp;
    }

    public static void main(String[]args){
	OrderedSuperArray test = new OrderedSuperArray(10);
	test.add("this");
	test.add("is");
	test.add("apple");
	test.add("pie");
	test.add("ghost");
	test.add("hole");
	test.add("cone");
	test.add("blow");
	test.add("jump");
	test.add("blellow");
	test.add("sun");
	System.out.println(test.toString());
	System.out.println(test.find("blellow"));
    }
}

