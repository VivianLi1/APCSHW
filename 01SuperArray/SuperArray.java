public class SuperArray{

    Object[] data;
    int countSize = 0;

    public SuperArray(){
	data = new Object[10];
    }

    public SuperArray(int length){
	data = new Object[length];
    }

    public Object get(int index){
	if (index > countSize - 1 || index < 0){
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
	if (data[0] == null){
	    data[0] = e;
	}else{
	data[countSize - 1] = e;
	}

    }

    public void add(int index, Object o){
	//if (index > 
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

