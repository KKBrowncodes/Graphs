import java.util.*;
public class Node {
  public ArrayList<Node> edges;
  public char value;
  public Node(char value) {
    edges = new ArrayList<>();
    this.value = value;
  }
}