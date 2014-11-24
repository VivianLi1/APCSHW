public class Driver{
    public static void main(String[]args){
	WordGrid test = new WordGrid(10,10);
	System.out.println(test.toString());
	System.out.println(test.addWordHorizontal("apples", 3, 4));
	System.out.println(test.toString());
    }
}
