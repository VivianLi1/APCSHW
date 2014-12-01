public class DriverSA{
    public static void main(String[]args){
	SuperArray A = new SuperArray();
	SuperArray B = new SuperArray(3);
	try{
	System.out.println(B.toString()); // [ null null null ]
	B.add(1);
	System.out.println(B.toString());
	}
	catch (IndexOutOfBoundsException e){
	    System.out.println("Index out of bounds");
	}
    }
}
