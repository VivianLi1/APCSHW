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

    public WordGrid(int rows, int cols, long thisSeed){
        this(rows, cols);
	setSeed(thisSeed);
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

    public boolean addWord(String word, int row, int col, int dx, int dy){
	boolean b = true;
	if(checkWord(word, row, col, dx, dy)){
	    for(int i = 0; i < word.length(); i++){
		data[row + i * dy][col + i * dx] = word.charAt(i);
	    }
	}
	else{ b = false;}
	return b;
    }

    public boolean addWordRandomly(String word){
	boolean b;
	int tries = 100;
        do{
	    b = addWord(word, rand.nextInt(data.length), rand.nextInt(data[0].length), rand.nextInt(3) - 1, rand.nextInt(3) - 1);
	    tries--;
	}
	while(!b && tries > 0);
   
	return (tries != 0);
    }

    public void addListofWords(ArrayList<String> wordlist){
	for(int i = 0; i < wordlist.size(); i++){
	    if(addWordRandomly(wordlist.get(i)))
	    words.add(wordlist.get(i));
	    
	}
    }

    private boolean checkWord(String word, int row, int col, int dx, int dy){
	int l = word.length();
	if ((dx == 0 && dy == 0) ||
	    row < 0 || col < 0 ||
	    row + dy * l > data.length || row + dy * l < -1 ||
	    col + dx * l > data[0].length || col + dx * l < -1){
	    return false;
	}
        for(int i = 0; i < l; i++){
	    if(data[row][col] != '-' && data[row][col] != word.charAt(i)){
		return false;
	    }
	    row = row + dy;
	    col = col + dx;	    
	}
	return true;
    }	    	

    public void loadWordsFromFile(String fileName, boolean fillRandomLetters){
	try{
	    File list = new File(fileName);
	    Scanner in = new Scanner(list);
	    ArrayList<String> puzzleWords = new ArrayList<String>();
	    while(in.hasNext()){
		puzzleWords.add(in.next());
	    }
	    addListofWords(puzzleWords);
	    if(fillRandomLetters){
		fillRest(fillRandomLetters);
	    }
	}
	catch(FileNotFoundException e){
	    System.out.println("FILE NOT FOUND!1!!");
	}
    }
	    

    private void setSeed(long seed){
	rand.setSeed(seed);
    }

    private void fillRest(boolean fill){
	for(int i = 0; i < data.length; i++){
	    for(int j = 0; j < data[0].length; j++){
		if(fill && data[i][j] == '-' ){
		    data[i][j] = (char)('a' + rand.nextInt(26));
		}		
	    }
	}
    }

    public String wordsInPuzzle(){
	String wordList = "";
	for(int i = 0; i < words.size(); i++){
	    wordList = wordList + words.get(i) + " ";
	    if((i + 1) % 8 == 0){ 
		wordList += "\n";
	    }
	}
	return wordList;
    }
}   

