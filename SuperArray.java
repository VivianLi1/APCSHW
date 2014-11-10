public class SuperArray{

    Object[] data;
    int countSize;

    public SuperArray(){
	setSize(10);
	data = new Object[10];
    }

    public SuperArray(int length){
        setSize(length);
	data = new Object[length];
    }

    public void setSize(int b){
	countSize = b;
    }

    public Object get(int index){
	if (index > countSize - 1){
	    System.out.println("ERROR: INDEX OUT OF RANGE");
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
	resize(countSize + 1);
	data[countSize - 1] = e;
    }

    public int getSize(){
	return countSize;
    }

    public void resize(int newCapacity){
	Object[] dataNew = new Object[newCapacity];
	for (int i = 0; i < countSize; i++){
	    dataNew[i] = data[i];
	}
	data = dataNew;
	countSize = newCapacity;
    }


}

