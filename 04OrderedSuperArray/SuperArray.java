public class SuperArray{

    String[] data;
    int countSize;

    public SuperArray(){
	data = new String[10];
    }

    public SuperArray(int length){
	data = new String[length];
    }

    public Object get(int index){
	if (index >= countSize || index < 0){
	    throw new IndexOutOfBoundsException();
	}

	return data[index];
    }

    public String toString(){
	String printThis = "";
	printThis = "[ ";
	for(int i = 0; i < data.length; i++){
	    printThis = printThis + data[i] + " ";
	}
	printThis = printThis + "]";
	return printThis;
    }

    public void add(String s){
	if (data[data.length - 1] != null){
	    resize(data.length * 2);
	}
	data[data.length - 1] = s;
	for(int i = 0; i < data.length; i++){
	    if(s.compareTo(data[i]) > 0){
		data[i] = data[i + 1];
		data[i] = s;
	    }
	}
    }

    /*
    public void add(int index, String s){
	if (index < 0){
	    throw new IndexOutOfBoundsException();
	}
	if (index >= data.length){
	    resize(data.length * 2);
	    data[index] = o;
	} else { //index < data.length
	    for (int i = index; i < data.length - 1; i++){
		data[i + 1] = data[i];
		data[index] = o;
	    }
	}
    }
    */

    public String set(int index, String s){
	if (index >= countSize || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	String keep = data[index];
	data[index] = s;
	return keep;
    }

    public Object remove(int index){ 
    //need to deal w/ size change and null return
	Object removed = data[index];
        if (index >= countSize || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	for (int i = index; i < data.length; i++){
	    data[i] = data[i + 1];
	}
	return removed;
    }


    public int getSize(){
	return countSize;
    }

    public void resize(int newCapacity){
	String[] dataNew = new String[newCapacity];
	if (newCapacity > data.length){
	    for (int i = 0; i < data.length; i++){
		dataNew[i] = data[i];
	    }
	}
	else{
	    for (int i = 0; i < newCapacity ; i++){
		dataNew[i] = data[i];
	    }
	}
	countSize = newCapacity;
	data = dataNew;
    }


}

