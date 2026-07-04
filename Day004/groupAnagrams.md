# 49. Group Anagrams 
`Medium`
## Given an array of strings strs, group the anagrams together. You can return the answer in any order.

<br/>

`HashMap<String, ArrayList<String>> map = new HashMap<>();`

The above line creates a HashMap called `map` in Java, which stores a `String` as the key and an `ArrayList of strings` as the corresponding value.

Using an enhanced for loop, we iterate through each string in the array `strs`.

The `toCharArray()` function converts the current string into a character array, and the `Arrays.sort()` function sorts the characters in ascending order. The sorted character array is then converted back into a string using the `String constructor`. This sorted string acts as the key in the HashMap.

Using an if statement, we check whether the sorted string is already present as a key in the HashMap. If it is not present, a new ArrayList is created and associated with that key. Here, the following code:

```
if (!map.containsKey(sortedS)) {
                map.put(sortedS, new ArrayList<>());
            }
```

can be replaced by:

```
map.putIfAbsent(sortedS, new ArrayList<>());
```

Both of the above code snippets produce the same result.

Using the `get()` function, the original string is added to the corresponding ArrayList of its sorted key.

Finally, the `values()` function retrieves all the grouped ArrayLists from the HashMap, and they are returned as a `List<List<String>>`.
