import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[]args){

	WordGrid test;
	if(args.length == 4){
	    test = new WordGrid(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]), Integer.parseInt(arg[2]));
	try{
	    test.loadWordsFromFile("words.txt", true);
	}
	catch(FileNotFoundException e){
	    System.out.println("file not found");
	    System.exit(0);
	}
    }
}
