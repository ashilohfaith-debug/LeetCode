# 217. Contains Duplicate
## Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

`HashSet<Integer> set = new HashSet<>();`

The above line creates a HashSet called `set` in Java, which stores unique integer values.

Using an `enhanced for loop` (or `for-each loop`), we add the values from array `nums` into the HashSet `set`.

Before adding each value into the HashSet, we check whether the element has already been added. If it has, we return false. Otherwise, we return true.
