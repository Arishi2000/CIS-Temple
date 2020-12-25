package stringPractice1068;

import static org.junit.Assert.assertArrayEquals;

public class SomePracticeStringMethods {
    /* returns true if c is a punctuation mark or false otherwise
     * 
     * Punctuation mark is defined as:
     * apostrophe '
     * comma ,
     * period .
     * semicolon ;
     * colon :
     * exclamation point !
     * question mark ? 
     * 
     * (You don't have to worry about any others)
     */
    public static boolean isPunct(char c) {
	/* placeholder just so that the function
	 * compiles. fill in your implementation here.
	 *
	 * there is a similar placeholder
	 * for each of the remaining functions */
    	
    	char apostrophe = '\'';
    	char comma = ',';
    	char period = '.';
    	char semicolon = ';';
    	char colon = ':';
    	char exclamation = '!';
    	char question = '?';

        	if (c == apostrophe || c == comma || c == period || c == semicolon ||
    	c == colon || c == exclamation || c == question) {

    		return true;
    	} else {
    		return false;
    	}
    }	
    
    /*
     * returns the index of the first punctuation mark in s or
     * -1 if s contains no punctuation marks
     */
    public static int indexOfFirstPunct(String s) {
    	
    	char[] chars = s.toCharArray();

    	for(int i = 0; i < chars.length; i++) {

		if(isPunct(chars[i])) {
			return i;
		}
	} 	
	return -1;
    }

    /*
     * returns the index of the first occurrence of a punctuation mark in s starting
     * from index startPosition or -1 if there are none at index
     * startPosition or later. Notice that this method has the same name as the
     * previous one, but that it takes a different number of arguments. This is
     * perfectly legal in Java. It's called "method overloading"
     */
    public static int indexOfFirstPunct(String s, int startPosition) {
    	
    	if(startPosition < s.length()) {
    		
    		return indexOfFirstPunct(s.substring(startPosition)) + (startPosition);
    	}
	return -1;
    }

    /*
     * returns the index of the last occurrence of a punctuation mark in s or -1 if s
     * contains none
     */
    public static int indexOfLastPunct(String s) {
    	
    	char[] chars = s.toCharArray();
    	
    	for(int i = chars.length - 1; i > 0 ;i--) {
    		
    		if(isPunct(chars[i])) {
    			
    			return i;
    		}
    	}
	return -1;
    }

    /*
     * returns s in reverse. For example, if s is "Apple", the method returns the
     * String "elppA"
     */
    public static String reversed(String s) {
    	
    	char[] chars = s.toCharArray();
    	
    	String reversed = "";
    	
    	for(int i = chars.length - 1; i >= 0 ;i--) {
    		
    		reversed = reversed + chars[i];
    	}
	return reversed;
    }

    /*
     * returns the number of times that n occurs in h. For example, if h is
     * "Mississippi" and n is "ss" the method returns 2.
     */
    public static int numOccurrences(String h, String n) {
    	
    		if (n.indexOf(n.charAt(0)) == h.indexOf(h.charAt(0)) ) {
        		
        		return n.length();
    		}
	return 0;
	}

    /*
     * returns true if s is the same backwards and forwards and false otherwise
     */
    public static boolean sameInReverse(String s) {
    	
    	char[] chars = s.toCharArray();
    	
    	String reversed = "";
    	
    	for(int i = chars.length - 1; i >= 0 ;i--) {
    		
    		reversed = reversed + chars[i];
    	}
	return true;
    } 

    /*
     * returns a new String which is the same as s, but with all of the punctuation
     * marks removed.
     */
    public static String withoutPunct(String s) {
    	
    	char[] chars = s.toCharArray();
    	
    	String withoutPunct = "";
    	
    	for(int i = 0; i < chars.length; i++) {
    		
    		if(!isPunct(chars[i])) {
    			
    			withoutPunct = withoutPunct + chars[i];
    		}
    	}
	return withoutPunct;
    }

    /*
     * Returns a new String that looks like base appended with suffix. If base
     * already ends with suffix, it returns base.
     * 
     * For example, if base is "lightning" and suffix is "bug", returns
     * "lightningbug".
     * 
     * If base is "lightningbug" and suffix is "bug", it also returns
     * "lightningbug".
     */
    public static String appendIfMissing(String base, String suffix) {
    	
		if(suffix.length() <= base.length()) {
    		
    		char basearr[] = base.toCharArray();
    		
    		char suffixarr[] = suffix.toCharArray(); 
    		
    		int sameCount = 0;
    		
    		for(int i = suffixarr.length - 1, j = basearr.length - 1; i >= 0; i--, j--) {
    			
    			if(basearr[j] == suffixarr[i]) {
    				
    				sameCount++;
    			}
    		}
    		
    		if(sameCount == suffixarr.length) {
    			return base;
    		} else {
    			return base + suffix;
    		}
    	} 
		else {
    		return base + suffix;
		}
    }



    /* Returns true of s contains none of the characters
     * found in chars or false otherwise.
     * 
     * For example, if s is "
     */
    public static boolean containsNone(String s, String chars) {
    	
    	//char[] chars = s.toCharArray();
    	
    	//if (!s.equals)
    	
	return true;
    }
	
    public static boolean allUpperCase(String s) {
    	
    	char charsArr[] = s.toCharArray();
    	
    	for(char c : charsArr) {
    		
    		if(!Character.isUpperCase(c)) {
    			
    			return false;
    		}
    	}
	return true;
    }
	
    public static boolean allLowerCase(String s) {
    	
    	char charsArr[] = s.toCharArray();
    	
    	for(char c : charsArr) {
    		
    		if(!Character.isLowerCase(c)) {
    			
    			return false;
    		}
    	}
	return true;
    }
}
