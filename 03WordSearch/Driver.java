import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[]args){
	WordGrid test = new WordGrid(0,0);
	try{
	    test.loadWordsFromFile("words.txt", true);
	}
	catch(FileNotFoundException e){
	    System.out.println("file not found");
	    System.exit(0);
	}
    }
}
