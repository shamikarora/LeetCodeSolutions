package test.leetcode.solutions;

/**
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s){
		if(s == null || s.length() == 0)
            return 0;
        
        int[] last = new int[256];
        for(int i=0; i<last.length; i++)
            last[i] = -1;
            
        int currLength = 0;
        int maxLength = 0;
        int i=0;
        while(i <s.length()){
            char ch = s.charAt(i);
            if(last[ch] == -1 || (i>last[ch]+currLength)){
                currLength++;
            }
            else{
                if(currLength > maxLength)
                    maxLength = currLength;
                currLength = i - last[ch];
            }
            last[ch] = i;
            i++;
        }
        
        return currLength>maxLength?currLength : maxLength;
	}
}
