## Java String Methods

1. **char charAt(int index):** It returns the character at the specified index. Specified index value should be between 0 to length() -1 both inclusive. It throws IndexOutOfBoundsException if index<0||>= length of String.
1. **boolean equals(Object obj)**: Compares the string with the specified string and returns true if both matches else false.
1. **boolean equalsIgnoreCase(String string)**: It works same as equals method but it doesn’t consider the case while comparing strings. It does a case insensitive comparison.
1. **int compareTo(String string)**: This method compares the two strings based on the Unicode value of each character in the strings.
1. **int compareToIgnoreCase(String string)**: Same as CompareTo method however it ignores the case during comparison.
1. **boolean startsWith(String prefix, int offset)**: It checks whether the substring (starting from the specified offset index) is having the specified prefix or not.
1. **boolean startsWith(String prefix)**: It tests whether the string is having specified prefix, if yes then it returns true else false.
1. **boolean endsWith(String suffix)**: Checks whether the string ends with the specified suffix.
1. **int hashCode()**: It returns the hash code of the string.
1. **int indexOf(int ch)**: Returns the index of first occurrence of the specified character ch in the string.
1. **int indexOf(int ch, int fromIndex)**: Same as indexOf method however it starts searching in the string from the specified fromIndex.
1. **int lastIndexOf(int ch)**: It returns the last occurrence of the character ch in the string.
1. **int lastIndexOf(int ch, int fromIndex)**: Same as lastIndexOf(int ch) method, it starts search from fromIndex.
1. **int indexOf(String str)**: This method returns the index of first occurrence of specified substring str.
1. **int lastindexOf(String str)**: Returns the index of last occurrence of string str.
1. **String substring(int beginIndex)**: It returns the substring of the string. The substring starts with the character at the specified index.
1. **String substring(int beginIndex, int endIndex)**: Returns the substring. The substring starts with character at beginIndex and ends with the character at endIndex.
1. **String concat(String str)**: Concatenates the specified string “str” at the end of the string.
1, **String replace(char oldChar, char newChar)**: It returns the new updated string after changing all the occurrences of oldChar with the newChar.
1. **boolean contains(CharSequence s)**: It checks whether the string contains the specified sequence of char values. If yes then it returns true else false. It throws NullPointerException of ‘s’ is null.
1. **String toUpperCase(Locale locale)**: Converts the string to upper case string using the rules defined by specified locale.
1. **String toUpperCase()**: Equivalent to toUpperCase(Locale.getDefault()).
1. **public String intern()**: This method searches the specified string in the memory pool and if it is found then it returns the reference of it, else it allocates the memory space to the specified string and assign the reference to it.
1. **public boolean isEmpty()**: This method returns true if the given string has 0 length. If the length of the specified Java String is non-zero then it returns false.
1. **public static String join()**: This method joins the given strings using the specified delimiter and returns the concatenated Java String
1. **String replaceFirst(String regex, String replacement)**: It replaces the first occurrence of substring that fits the given regular expression “regex” with the specified replacement string.
1. **String replaceAll(String regex, String replacement)**: It replaces all the occurrences of substrings that fits the regular expression regex with the replacement string.
1. **String[] split(String regex, int limit)**: It splits the string and returns the array of substrings that matches the given regular expression. limit is a result threshold here.
1. **String[] split(String regex)**: Same as split(String regex, int limit) method however it does not have any threshold limit.
1. **String toLowerCase(Locale locale)**: It converts the string to lower case string using the rules defined by given locale.
1. **public static String format()**: This method returns a formatted java String
1. **String toLowerCase()**: Equivalent to toLowerCase(Locale. getDefault()).
1. **String trim()**: Returns the substring after omitting leading and trailing white spaces from the original string.
1. **char[] toCharArray()**: Converts the string to a character array.
1. **static String copyValueOf(char[] data)**: It returns a string that contains the characters of the specified character array.
1. **static String copyValueOf(char[] data, int offset, int count)**: Same as above method with two extra arguments – initial offset of subarray and length of subarray.
1. **void getChars(int srcBegin, int srcEnd, char[] dest, int destBegin)**: It copies the characters of src array to the dest array. Only the specified range is being copied(srcBegin to srcEnd) to the dest subarray(starting fromdestBegin).
1. **static String valueOf()**: This method returns a string representation of passed arguments such as int, long, float, double, char and char array.
1. **boolean contentEquals(StringBuffer sb)**: It compares the string to the specified string buffer.
1. **boolean regionMatches(int srcoffset, String dest, int destoffset, int len)**: It compares the substring of input to the substring of specified string.
1. **boolean regionMatches(boolean ignoreCase, int srcoffset, String dest, int destoffset, int len)**: Another variation of regionMatches method with the extra boolean argument to specify whether the comparison is case sensitive or case insensitive.
1. **byte[] getBytes(String charsetName)**: It converts the String into sequence of bytes using the specified charset encoding and returns the array of resulted bytes.
1. **byte[] getBytes()**: This method is similar to the above method it just uses the default charset encoding for converting the string into sequence of bytes.
1. **int length()**: It returns the length of a String.
1. **boolean matches(String regex)**: It checks whether the String is matching with the specified regular expression regex.
1. **int codePointAt(int index)**: It is similar to the charAt method however it returns the Unicode code point value of specified index rather than the character itself.