package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	 static int solve(String str) {

	        if(str.length()==0)
	             return 0;
	        int maxans = Integer.MIN_VALUE;
	        for (int i = 0; i < str.length(); i++) // outer loop for traversing the string
	        {
	            Set < Character > se = new HashSet < > ();
	            for (int j = i; j < str.length(); j++) // nested loop for getting different 
	          //  string starting with str[i]
	            {
	                if (se.contains(str.charAt(j))) // if element if found so mark it as ans 
	           //     and break from the loop
	                {
	                    maxans = Math.max(maxans, j - i);
	                    break;
	                }
	                se.add(str.charAt(j));
	            }
	        }
	        if(maxans==Integer.MIN_VALUE)
	        	return str.length();
	        return maxans;
	    }
	 
	 static int solve2(String str) {

	        if(str.length()==0)
	             return 0;
	        int maxans = Integer.MIN_VALUE;
	        Set < Character > set = new HashSet < > ();
	        int l = 0;
	        for (int r = 0; r < str.length(); r++) // outer loop for traversing the string
	        {
	            if (set.contains(str.charAt(r))) //if duplicate element is found
	            {
	                while (l < r && set.contains(str.charAt(r))) {
	                    set.remove(str.charAt(l));
	                    l++;
	                }
	            }
	            set.add(str.charAt(r));
	            maxans = Math.max(maxans, r - l + 1);
	        }
	        if(maxans==Integer.MIN_VALUE)
	        	return str.length();
	        
	        return maxans;
	    }
	 
	 static int solve3(String s) {
	        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

	        int left = 0, right = 0;
	        int n = s.length();
	        int len = 0;
	        while (right < n) {
	            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

	            mpp.put(s.charAt(right), right);

	            len = Math.max(len, right - left + 1);
	            right++;
	        }
	        return len;
	    }
}
