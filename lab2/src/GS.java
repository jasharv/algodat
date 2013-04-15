import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class GS {
	public static void main(String[] args) {	        
		ArrayList<String> allaFiler = new ArrayList<String>();
		ArrayList<Node> graph = new ArrayList<Node>();
		allaFiler.add("testlab2/words-10-test");
		allaFiler.add("testlab2/words-250-test");
		allaFiler.add("testlab2/words-5757-test");
		
		for(String fileNames:allaFiler){

			Scanner scan = new Scanner(new File(fileNames + ".dat.txt"));
			ArrayList<String> words = new ArrayList<String>();
			while(scan.hasNext()) {
				words.add(scan.nextLine());
			}
			for(String word: words){
				graph.add(new Node(word));
				
				for(String otherWord: words){
					if(otherWord.contains(word.substring(1,1)){
						
					}
				}
			}
			
			
			
			
			
			
			
			
			
		
		try {
			scan = new Scanner(new File(fileNames + ".out.txt"));
		} catch (FileNotFoundException e) {
			System.exit(1);
		}
		String[] outFile = new String[n];
		int i = 0;
		while(scan.hasNext()){
			outFile[i] = (scan.nextLine());
			i++;
		}

		Arrays.sort(outFile);
		Arrays.sort(outPut);
		boolean failed = false;
		for (i = 0; i < n; i++){
			System.out.println(outPut[i]);
			if(!(outFile[i].equals(outPut[i]))){
				
				System.out.println("samst");
				failed = true;
			}
			
		}
		if(!failed){
		System.out.println("Det stammer javligt bra \n");
		}
     
        }
		 
	}
	
}
