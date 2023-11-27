package trie;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordSearchTest {

	
	@Test
	public  void main() {

	
	 char arr[][] ={{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
	 String[] word= {"oath","pea","eat","rain"};
	 
	  List<String> actual = Arrays.asList("oath","eat");
	 WordSearch obj = new WordSearch();
	 
	 assertThat(actual,is(obj.findWords(arr,word)));
	}
}
