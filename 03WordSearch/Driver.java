import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[]args){

	WordGrid test = null;
	if(args.length == 4){
	    test = new WordGrid(Integer.parseInt(args[0]),Integer.parseInt(args[1]), Integer.parseInt(args[2]));

	    if(Integer.parseInt(args[3]) == 1){
		test.loadWordsFromFile("words.txt", false);
	    }
	    if(Integer.parseInt(args[3]) == 0){
		test.loadWordsFromFile("words.txt", true);
	    }
	}

	if(args.length == 3){
	    test = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	    test.loadWordsFromFile("words.txt", true);
	}

	if(args.length == 2){
	    test = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	    test.loadWordsFromFile("words.txt", true);
	}

	if(args.length < 2){
	    test = new WordGrid(50, 50);
	    System.out.println("USING DEFAULT PUZZLE CHOICES");
	    test.loadWordsFromFile("words.txt", true);
	}



	System.out.println( "Find these words: \n" + test.wordsInPuzzle());
	System.out.println(test);
    }
}


