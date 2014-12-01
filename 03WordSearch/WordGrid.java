import java.util.*;
import java.io.*;

public class WordGrid{
    private char[][] data;
    private ArrayList<String> words = new ArrayList<String>();
    private Random rand = new Random();

    /**Initialize the grid to the size specified and fill all of the positions with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows, int cols){
	data = new char[rows][cols];
	clear();
    }

    /**Set all values in the WordGrid to spaces ' '*/
    public void clear(){
	for(int i = 0; i < data.length; i++){
	    for(int j = 0; j < data[i].length; j++){
		data[i][j] = '-';
	    }
	}
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row separated by newlines.
     */
    public String toString(){
	String printThis = "";
	for(int i = 0; i < data.length; i++){
	    for(int j = 0; j < data[i].length; j++){
		printThis = printThis + data[i][j] + " ";
	    }
	    printThis += "\n";
	}
	return printThis;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must have a corresponding
     *letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid
     *@param row is the vertical position of the word's start location
     *@param col is the horizontal position of the word's start location
     *@return true when the word is added successfully.
     *When the word doesn't fit, or there are overlapping letters that do not match,
     *then false is returned.
     */
    public boolean addWordHorizontal(String word, int row, int col){
	boolean b = true;
	//checks if word size exceeds grid length horizontally
	if(word.length() > data[0].length){
	    b = false;
	}
	//
	for(int i = 0; i < word.length(); i++){
	    if( data[row][col + i] == word.charAt(i) || data[row][col + i] == '-'){
		data[row][col + i] = word.charAt(i);
	    }else{
		b = false;
	    }
	}
	return b;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from up to down, must fit on the WordGrid, and must have a corresponding
     *letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid
     *@param row is the vertical position of the word's start location
     *@param col is the horizontal position of the word's start location
     *@return true when the word is added successfully.
     *When the word doesn't fit, or there are overlapping letters that do not match,
     *then false is returned.
     */
    public boolean addWordVertical(String word, int row, int col){
	boolean b = true;
	//checks if word size exceeds grid length verically
	if(word.length() > data[0].length){
	    b = false;
	}
	//
	for(int i = 0; i < word.length(); i++){
	    if(data[row + i][col] == word.charAt(i) || data[row + i][col] == '-'){
		data[row + i][col] = word.charAt(i);
	    }else{
		b = false;
	    }
	}
	return b;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right and up to down, must fit on the WordGrid, and must have a corresponding
     *letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid
     *@param row is the vertical position of the word's start location
     *@param col is the horizontal position of the word's start location
     *@return true when the word is added successfully.
     *When the word doesn't fit, or there are overlapping letters that do not match,
     *then false is returned.
     */
    public boolean addWordDiagonal(String word, int row, int col){
	boolean b = true;
	//word has to be smaller or equal both vertically and horizontally
	if(word.length() > data.length || word.length() > data[0].length){
	    b = false;

	}
	for(int i = 0; i < word.length(); i++){
	    if(data[row + i][col + i] == word.charAt(i) || data[row + i][col + i] == '-'){
		data[row + i][col + i] = word.charAt(i);
	    }else{
		b = false;
	    }
	}
	return b;
    }

    public void addWord(String word, int row, int col, int dx, int dy){
    }

    public void loadWordsFromFile(String fileName, boolean fillRandomLetters)
	throws FileNotFoundException{
	File list = new File(fileName);
	Scanner in = new Scanner(list);

	while(in.hasNextLine()){
	    String line = in.nextLine();
	    words.add(in.nextLine());
	}

	for(int i = 0; i < data.length; i++){
	    for(int j = 0; j < data[0].length; j++){
		if(fillRandomLetters && data[i][j] == '-'){
		    data[i][j] = (char)('a' + rand.nextInt(26));
		}
	    }
	}
    }

    public void setSeed(long seed){
	rand.setSeed(seed);
    }
}   

