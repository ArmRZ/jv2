package lab.oodp.moreclass.pattern;

public class Pattern {
	private int numberOfCharacter;
	private char character;
	
	
	//constructor
	
	public Pattern (int numOfChar, char c ){
		numberOfCharacter = numOfChar;
		character = c;
		
	}
	//getter&setter here
	public int getNum(){
		
		return numberOfCharacter;
	}
	public void setNum(int numberOfCharacter) {
		
	this.numberOfCharacter = numberOfCharacter;	
	}
	
public int getChar(){
		
		return character;
	}
	public void setChar(char character) {
		
	this.character = character;	
	}
	
	//toString method here
	public String toString() {
		String s = "";
		for(int i = 0; i<this.numberOfCharacter; i++) {
			
			s = s + this.character;
		}
		return s;
		
	}
	
} 
	
	

