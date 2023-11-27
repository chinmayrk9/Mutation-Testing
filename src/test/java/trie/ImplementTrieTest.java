package trie;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImplementTrieTest {

	@Test
	public  void implementTrieTest() {
		  ImplementTrie T=new ImplementTrie();
		  T.insert("apple");
		  T.insert("apple");
		  T.insert("apps");
		  T.insert("apps");
		  String word1 = "apps";
		  assertEquals(2,T.countWordsEqualTo(word1));
		  String word2 = "abc";
		  assertEquals(0,T.countWordsEqualTo(word2));
		  String word3 = "ap";
		  assertEquals(4,T.countWordsStartingWith (word3));
		  String word4 = "appl";
		  assertEquals(2,T.countWordsStartingWith
		  (word4));
		  T.erase(word1);
		  assertEquals(1,T.countWordsEqualTo(word1));
}
}