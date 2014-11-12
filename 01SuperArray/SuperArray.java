public class SuperArray{

    Object[] data;
    int countSize;

    public SuperArray(){
	data = new Object[10];
    }

    public SuperArray(int length){
	data = new Object[length];
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

    public void add(Object e){
	if (data[data.length - 1] != null){
	    resize(data.length * 2);
	}
	data[data.length - 1] = e;
    }

    public void add(int index, Object o){
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

    public Object set(int index, Object o){
	if (index >= countSize || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	Object keep = data[index];
	data[index] = o;
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
	Object[] dataNew = new Object[newCapacity];
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

