public class Driver{
    public static void main(String[]args){
	WordGrid test = new WordGrid(5,5);
	System.out.println(test.toString());
	System.out.println(test.addWordHorizontal("apples", 3, 4));
	System.out.println(test.toString());
    }
}
