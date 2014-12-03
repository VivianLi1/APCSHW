import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[]args){

	WordGrid test = null;
	if(args.length == 4){
	    test = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	    for(int i = 0; i < 4; i++){
		if(Integer.parseInt(args[i]) % 1 != 0){
		    System.out.println("INVALID INPUT. PLEASE USE INTEGERS.");
		}
	    }
	    if(Integer.parseInt(args[3]) == 1){
		test.loadWordsFromFile("words.txt", false);
	    }
	    if(Integer.parseInt(args[3] == 0)){
		test.loadWordFromFile("words.txt", true);
	    }
	}

	else{
	    if(args.length == 3){
		test = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	    }

	    if(args.length == 2){
		test = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	    }

	    if(args.length < 2){
		test = new WordGrid(50, 50);
		System.out.println("USING DEFAULT PUZZLE CHOICES");
	    }

	    for(int i = 0; i < args.length; i++){
		if(Integer.parseInt(args[i]) % 1 != 0){
		    System.out.println("INVALID INPUT. PLEASE USE INTEGERS.");
		}
	    }

	    test.loadWordsFromFile("words.txt", false);
	}

	System.out.println( "Find these words: \n" + test.wordsInPuzzle());
	System.out.println(test);
    }
}


