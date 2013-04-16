import java.util.ArrayList;

public class Node {
	String word;
	public ArrayList<Node> children;

	public Node(String word) {
		this.word = word;
		children = new ArrayList<Node>();
	}

	public Node getNodeIfContains(String child) {
		if (word.equals(child)){
			return this;			// Om jag ar sokt, returnera mig
		}
		for (Node s : children) {
			Node node = s.getNodeIfContains(child); //fortsatt leta
			if (node!=null){
				return node; // Om hittad
			}
		}
		return null; //finns inte har
	}

	public String getWord() {
		return word;
	}
}