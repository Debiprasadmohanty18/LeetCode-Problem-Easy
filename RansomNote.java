/* Ransom Note :- 

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote. 

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
*/
public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aaab";		
		System.out.println(canConstruct(ransomNote, magazine));
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) 
	{
				
		int[] count = new int[26];
		for(char ch : magazine.toCharArray())
		{
			count[ch - 'a']++;
		}
		for(char ch : ransomNote.toCharArray())
		{
			count[ch - 'a']--;
			
			if(count[ch - 'a'] < 0)
			{
				return false;
			}
		}
		return true;
	}

}
