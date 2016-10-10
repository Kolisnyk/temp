class Holdem{
	public static String[52] deck = new String[];
	public static nt numberOfIterations = 0;
	public static String[] won = {highestCard,onePair,twoPairs,tripleCards, straight, flash, fullHouse, care, straightFlash, flashRoyal};


	static { 
		Integer[] rank = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		String[] suit = {"c", "s", "h", "d"};
 		for (int  i = 0; i < 52; i++) 			
 			for (int j = 0; j < 13; j++)
 				for (int k = 0; k < 4; k++){
 				deck[i] = suit[k] + rank[j];
 			}
	}

public static void main (String[] args){
	Integer[7] Cards = new Integer[];
	
	for  (int i=0; i < 7; i++){		
			Cards[i] = generate(deck);
	}

	


public int[] generate (String[] deck){

}
}
