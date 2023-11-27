package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestValidParanthesesTest {

	  LongestValidParantheses longestValidParentheses = new LongestValidParantheses();

	    @Test
	  public  void shouldReturnZeroWhenSingleOpeningParenthesisIsGiven() {
	        String input = "(";
	        int validLength = longestValidParentheses.getLongestValidParentheses(input);
	        assertEquals(0, validLength);
	    }

	    @Test
	    public void shouldReturnZeroWhenSingleClosingParenthesisIsGiven() {
	        String input = ")";
	        int validLength = longestValidParentheses.getLongestValidParentheses(input);
	        assertEquals(0, validLength);
	    }

	    @Test
	    public void shouldReturnZeroWhenNullStringIsGiven() {
	        String input = "";
	        int validLength = longestValidParentheses.getLongestValidParentheses(input);
	        assertEquals(0, validLength);
	    }

	    @Test
	    public void shouldReturnTwoWhenTwoBalancedParenthesesAreGiven() {
	        String input = "()";
	        int validLength = longestValidParentheses.getLongestValidParentheses(input);
	        assertEquals(2, validLength);
	    }

	    @Test
	    public void shouldReturnLengthWhenInputStringIsValid() {
	        String input = "()((()))";
	        int validLength = longestValidParentheses.getLongestValidParentheses(input);
	        assertEquals(8, validLength);
	    }

	    @Test
	    public void shouldReturnValidLengthWhenInputStringIsGiven() {
	        String input = "((()((())))";
	        int validLength = longestValidParentheses.getLongestValidParentheses(input);
	        assertEquals(10, validLength);
	    }
}
