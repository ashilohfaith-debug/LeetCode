# 347. Top K Frequent Elements
`Medium`
## Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

<br/>

`HashMap<Integer, Integer> map = new HashMap<>();`

The above line creates a HashMap called `map` in Java, which stores each unique integer as the key and its frequency of occurrence as the corresponding value.

Using an enhanced for loop, we iterate through each element in the array `nums`.

The `getOrDefault()` function retrieves the current frequency of an element from the HashMap. If the element is not present, it returns 0. The frequency is then incremented by 1 and updated in the HashMap using the `put()` function.

`List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());`

The above line creates an ArrayList called `list` containing all the `key-value pairs` from the HashMap. Each element of the list is a `Map.Entry`, where the key represents the integer and the value represents its frequency.

Using the `sort()` function, the list is sorted in descending order based on the frequency of each element.

`int[] ans = new int[k];`

The above line creates an integer array called `ans` of size `k`, which stores the k most frequent elements.

Using a for loop, the first k elements from the sorted list are accessed. The `getKey()` function retrieves the integer from each Map.Entry, and it is stored in the array ans. Finally, the array ans is returned.
