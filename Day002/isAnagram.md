# 242. Valid Anagram
`Easy`
## Given two strings s and t, return true if t is an anagram of s, and false otherwise.

<br/>

`char characters1[] = s.toCharArray();`

The above line converts the string `s` into a character array called `characters1` in Java, which stores each character of the string as an individual element in the array.

Using the `Arrays.sort()` function, the characters in the character array are sorted in ascending order.

Using the `==` operator, the characters of both character arrays are compared consecutively.

A counter variable `count` is used to count the number of matching characters during the comparison. The counter increments every time the compared characters are the same, and its value is compared with the length of the string. If they are equal, it returns true. Otherwise, it returns false.
