package trie;



public class NumberofDistinctSubstring {

	  public static int countDistinctSubstrings(String s) {
	    Node root = new Node();
	    int n = s.length();
	    int count = 0;

	    for (int i = 0; i < n; i++) {
	      Node node = root;

	      for (int j = i; j < n; j++) {
	        if (!node.containsKey(s.charAt(j))) {
	          node.put(s.charAt(j), new Node());
	          count++;
	        }
	        node = node.get(s.charAt(j));
	      }
	    }
	    return count + 1;
	  }
	}


