
public class Play {

	String[] game;
	int[] occupied;
	
	Play(){								
		this.game =  new String[] {"_","|", " ", "X", "O", ""};			
		this.occupied = new int [10];
	}
	
	public String setGrid() {
		String temp = "";
		for(int i = 0; i<3; i++) {
			for (int c = 0; c<3; c++) {
				if(i<2) 
					temp += this.game[c];
				else
					temp += this.game[3];
				
			}
			temp += "\n";
		}
		
		return temp;
	}
	

	@Override
	public String toString() {
		return game;
	}
	
}
