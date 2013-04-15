import java.util.ArrayList;


public class Node {
	String word;
	public ArrayList<Node> children;
	public Node(String word) {
		this.word=word;
		children = new ArrayList<Node>();
	}
}
