public class SuperArray{

    String[] data, copy;
    int countSize;

    public SuperArray(){
	this(10);
    }

    public SuperArray(int length){
	data = new String[length];
	countSize = length;
    }

    public String get(int index){
	if (index >= getSize() || index < 0){
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
	if (data[getSize() - 1] != null){
	    resize(data.length * 2);
	}
        data[getSize() - 1] = s;
    }

    public void add(int index, String s){
	if (index < 0){
	    throw new IndexOutOfBoundsException();
	}
	if (index >= data.length){
	    resize(data.length * 2);
	    data[index] = s;
	} else { //index < data.length
	    for (int i = index; i < data.length - 1; i++){
		data[i + 1] = data[i];
		data[index] = s;
	    }
	}
    }

    public String set(int index, String s){
	if (index >= countSize || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	String keep = data[index];
	data[index] = s;
	return keep;
    }

    public String remove(int index){ 
	String removed = data[index];
	copy = data.clone();
        if (index >= getSize() || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	for (int i = index; i < getSize() - 1; i++){
	    copy[i] = data[i + 1];
	}
	if(countSize < copy.length / 4){
	    resize(data.length / 2);
	}
	countSize = countSize - 1;
	data = copy.clone();
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
    
    public void insertionSort(){
	for(int i = 0; i < getSize() - 1; i++){
	    if(get(i).compareTo(get(i + 1)) > 0){
		set(i, get(i + 1));
		set((i + 1), get(i));
	    }
	    for(int j = 0; j < i; j++){
		if(get(i+1).compareTo(get(j - 1)) < 0){
			set(j, get(j - 1));
			set((j - 1), get(i + 1));
		    }
	    }
	}    
    }

    public int find(String target){
	int temp = 0;
	for(int i = 0; i < getSize(); i++){
	    if(get(i).equals(target)){
		temp = i;
	    }
	}
	return temp;
    }

    public void selectionSort(){
	for(int i = 0; i < getSize() - 1; i++){
	    for(int j = 0; j < getSize() - 1; i++)
	    if(get(i).compareTo(get(j + 1)) > 0){
		set(i, get(j + 1));
	    }
	}
    }
}

