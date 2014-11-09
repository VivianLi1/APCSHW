public class SuperArray{

    Object[] data;
    int countSize;

    public SuperArray(){
	setSize(10);
	countSize = 10;
    }

    public SuperArray(int length){
        setSize(length);
	countSize = length;
    }

    public void setSize(int b){
	data = new Object[b];
    }

    public String toString(){
	return "[ " + data.toString() + " ]";
    }

    public void add(Object e){
	resize(countSize + 1);
	data[data.length - 1] = e;
    }

    public int size(){
	return countSize;
    }

    public void resize(int newCapacity){
	Object[] dataNew;
	dataNew = new Object[newCapacity];
	countSize = newCapacity;
    }


}

