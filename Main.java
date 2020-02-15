import java.util.*;

class Main {
  public static void main(String[] args) {
    testRegular();
  }

  public static void testRegular() {
    Node a = new Node('a');
    Node b = new Node('b');
    Node c = new Node('c');
    Node d = new Node('d');
    Node e = new Node('e');
    Node f = new Node('f');
    Node g = new Node('g');

    // a points to b and c
    // b points to c 
    // c points to d and e
    // d points to nothing
    // e points to f
    // f points to nothing
    // g is an island
    a.edges.add(b);
    a.edges.add(c);
    b.edges.add(c);
    c.edges.add(d);
    c.edges.add(e);
    e.edges.add(f);

    System.out.println("DFS between a and f: " + dfs(a, f));

    System.out.println("BFS between a and f: " + bfs(a, f));
  }

  // Runs dfs to see if path between start and end exists
  public static boolean dfs (Node start, Node end) {
    if (start==null){
      return false
    }
    if(start.equals(end)){
      return false
    }
  }

  // Runs bfs to see if path between start and end exists
  public static boolean bfs (Node start, Node end) {
   if (start==null){
      return false
    }
    else if(start.value==end.value){
      return true:
    }
  }

  public static void testBonus() {
    NodeBonus a = new NodeBonus('a');
    NodeBonus b = new NodeBonus('b');
    NodeBonus c = new NodeBonus ('c');
    NodeBonus d = new NodeBonus('d');
    NodeBonus e = new NodeBonus('e');
    NodeBonus f = new NodeBonus('f');
    NodeBonus g = new NodeBonus('g');

    // a points to b and c
    // b points to c 
    // c points to d and e
    // d points to nothing
    // e points to f
    // f points to nothing
    // g is an island
    a.edges.add(new NodeEdge(b, 2));
    a.edges.add(new NodeEdge(c, 5));
    b.edges.add(new NodeEdge(c, 1));
    c.edges.add(new NodeEdge(d, 4));
    c.edges.add(new NodeEdge(e, 3));
    e.edges.add(new NodeEdge(f, 6));

    // Add your own test methods to see if you can find the *min* path to get between two nodes. Return -1 if no path found
  }
}