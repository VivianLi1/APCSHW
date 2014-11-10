public class DriverSA{
    public static void main(String[]args){
	SuperArray A = new SuperArray();
	SuperArray B = new SuperArray(3);
	System.out.println(B.toString()); // [ null null null ]
	B.add(1);
	System.out.println(B.toString());
    }
}
