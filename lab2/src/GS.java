import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class GS {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> allaFiler = new ArrayList<String>();
		ArrayList<Node> graph = new ArrayList<Node>();
		allaFiler.add("testlab2/words-10");
		allaFiler.add("testlab2/words-250");
		allaFiler.add("testlab2/words-5757");

		for (String fileNames : allaFiler) {

			Scanner scan;
			scan = new Scanner(new File(fileNames + ".dat.txt"));
			ArrayList<String> words = new ArrayList<String>();
			while (scan.hasNext()) {
				words.add(scan.nextLine());
			}
			for (String word : words) {							
				Node node = null;
				for (Node n : graph) {
					node = n.getNodeIfContains(word);
					if (node != null) {
						break;
					}
				}
				if (node == null) {
					node = new Node(word);
					graph.add(node);
				}

				for (String otherWord : words) {						// Compare word to all other words
					if (otherWord.contains(word.substring(1, 1))
							&& otherWord.contains(word.substring(2, 2))		//If contains the right letters (THIS IS WRONG, no check for multiples of one letter)
							&& otherWord.contains(word.substring(3, 3))
							&& otherWord.contains(word.substring(4, 4))
							&& !(otherWord.equals(word))) {					// Not a match with itself
						Node childNode = null;
						for (Node n : graph) {
							childNode = n.getNodeIfContains(otherWord);		//If matched word already exists in the graph, use it....
							if (childNode != null) {
								break;
							}
						}
						if (childNode == null) {							// else create a node with that word.
							childNode = new Node(otherWord);
						}
						node.children.add(childNode);						// add matched word as child
					}
				}
			}
			
			
			
			
			// BFS-ALGORITHM
			try {
				scan = new Scanner(new File(fileNames + "-test.in.txt"));
			} catch (FileNotFoundException e1) {
				System.exit(1);
			}
			ArrayList<String> outPut = new ArrayList<String>();
			while (scan.hasNext()) {
				outPut.add("HAR SKA AVSTANDET IN FOR VARJE ORDPAR");
			}
			
			
			
			

			try {
				scan = new Scanner(new File(fileNames + "-test.out.txt"));
			} catch (FileNotFoundException e) {
				System.exit(1);
			}
			ArrayList<String> outFile = new ArrayList<String>();
			int i = 0;
			while (scan.hasNext()) {
				outFile.add(scan.nextLine());
			}
			boolean failed = false;
			for (i = 0; i < outFile.size(); i++) {
				System.out.println(outPut.get(i));
				if (!(outFile.get(i).equals(outFile.get(i)))) {

					System.out.println("samst");
					failed = true;
				}
			}
			if (!failed) {
				System.out.println("Det stammer javligt bra \n");
			}

		}

	}

}