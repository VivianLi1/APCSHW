public class DriverSA{
    public static void main(String[]args){
	SuperArray A = new SuperArray(3);
	SuperArray B = new SuperArray(3);
	try{
	    for(int i = 0; i < 3; i++){
		A.set(i, "" + (char)('a' + i)) ;	   
	    }
	    System.out.println(A.toString());
	    A.add(1, "cat");
	    System.out.println(A.toString());
	    A.selectionSort();
	    // System.out.println(A.toString());

	}
	catch (IndexOutOfBoundsException e){
	    System.out.println("Index out of bounds");
	}
    }
}
