# Java String Methods

## char charAt(int index)

It returns the character at the specified index. Specified index value should be between 0 to length() -1 both inclusive. It throws IndexOutOfBoundsException if index<0||>= length of String.

## boolean equals(Object obj)

Compares the string with the specified string and returns true if both matches else false.

## boolean equalsIgnoreCase(String string)

It works same as equals method but it doesn\'t consider the case while comparing strings. It does a case insensitive comparison.

## int compareTo(String string)

This method compares the two strings based on the Unicode value of each character in the strings.

## int compareToIgnoreCase(String string)

Same as CompareTo method however it ignores the case during comparison.

## boolean startsWith(String prefix, int offset)

It checks whether the substring (starting from the specified offset index) is having the specified prefix or not.

## boolean startsWith(String prefix)

It tests whether the string is having specified prefix, if yes then it returns true else false.

## boolean endsWith(String suffix)

Checks whether the string ends with the specified suffix.

## int hashCode()

It returns the hash code of the string.

## int indexOf(int ch)

Returns the index of first occurrence of the specified character ch in the string.

## int indexOf(int ch, int fromIndex)

Same as indexOf method however it starts searching in the string from the specified fromIndex.

## int lastIndexOf(int ch)

It returns the last occurrence of the character ch in the string.

## int lastIndexOf(int ch, int fromIndex)

Same as lastIndexOf(int ch) method, it starts search from fromIndex.

## int indexOf(String str)

This method returns the index of first occurrence of specified substring str.

## int lastindexOf(String str)

Returns the index of last occurrence of string str.

## String substring(int beginIndex)

It returns the substring of the string. The substring starts with the 
character at the specified index.

## String substring(int beginIndex, int endIndex)

Returns the substring. The substring starts with character at beginIndex and ends with the character at endIndex.

## String concat(String str)

Concatenates the specified string “str” at the end of the string.

## String replace(char oldChar, char newChar)

It returns the new updated string after changing all the occurrences of oldChar with the newChar.

## boolean contains(CharSequence s)

It checks whether the string contains the specified sequence of char values. If yes then it returns true else false. It throws NullPointerException of ‘s’ is null.

## String toUpperCase(Locale locale) 

Converts the string to upper case string using the rules defined by specified locale.

## String toUpperCase() 

Equivalent to toUpperCase(Locale.getDefault()).

## public String intern() 

This method searches the specified string in the memory pool and if it is found then it returns the reference of it, else it allocates the memory space to the specified string and assign the reference to it.

## public boolean isEmpty() 

This method returns true if the given string has 0 length. If the length of the specified Java String is non-zero then it returns false.

## public static String join()

This method joins the given strings using the specified delimiter and returns the concatenated Java String

## String replaceFirst(String regex, String replacement)

It replaces the first occurrence of substring that fits the given regular expression “regex” with the specified replacement string.

## String replaceAll(String regex, String replacement)

It replaces all the occurrences of substrings that fits the regular expression regex with the replacement string.

## String[] split(String regex, int limit)

It splits the string and returns the array of substrings that matches the given regular expression. limit is a result threshold here.

## String[] split(String regex)

Same as split(String regex, int limit) method however it does not have any threshold limit.

## String toLowerCase(Locale locale)

It converts the string to lower case string using the rules defined by given locale.

## public static String format()

This method returns a formatted java String

## String toLowerCase()

Equivalent to toLowerCase(Locale. getDefault()).

## String trim()

Returns the substring after omitting leading and trailing white spaces from the original 
string.

## char[] toCharArray()

Converts the string to a character array.

## static String copyValueOf(char[] data)

It returns a string that contains the characters of the specified character array.

## static String copyValueOf(char[] data, int offset, int count)

Same as above method with two extra arguments – initial offset of subarray and length of subarray.

## void getChars(int srcBegin, int srcEnd, char[] dest, int destBegin)

It copies the characters of src array to the dest array. Only the specified range is being copied(srcBegin to srcEnd) to the dest subarray(starting fromdestBegin).

## static String valueOf()

This method returns a string representation of passed arguments such as int, long, float, double, char and char array.

## boolean contentEquals(StringBuffer sb)

It compares the string to the specified string buffer.

## boolean regionMatches(int srcoffset, String dest, int destoffset, int len)  

It compares the substring of input to the substring of specified string.

## boolean regionMatches(boolean ignoreCase, int srcoffset, String dest, int destoffset, int len)

Another variation of regionMatches method with the extra boolean argument to specify whether the comparison is case sensitive or case insensitive.

## byte[] getBytes(String charsetName)

It converts the String into sequence of bytes using the specified charset encoding and returns the array of resulted bytes.

## byte[] getBytes()

This method is similar to the above method it just uses the default charset encoding for converting the string into sequence of bytes.

## int length()

It returns the length of a String.

## boolean matches(String regex)

It checks whether the String is matching with the specified regular expression regex.

## int codePointAt(int index)

It is similar to the charAt method however it returns the Unicode code point value of specified index rather than the character itself.

<div align="right">
    <b><a href="#">↥ back to top</a></b>
</div>
