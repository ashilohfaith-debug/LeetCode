# 128. Longest Consecutive Sequence
`Medium`
## Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence. You must write an algorithm that runs in O(n) time.

<br/>

`if (nums.length == 0) return 0;`

The above if statement checks whether the input array is empty. If the array contains no elements, the function returns 0 since there is no consecutive sequence.

The `Arrays.sort()` function sorts the elements of the array in ascending order. This allows consecutive elements to appear next to each other, making them easier to compare.

A variable `streak` is initialised to 1. It stores the length of the current consecutive sequence. A variable `maxStreak` is also initialised to 1. It stores the length of the longest consecutive sequence found so far.

Using a for loop, we iterate through the array and compare each element with its next element using an if statement. If they are equal, the continue statement skips the current iteration to avoid counting duplicate elements. Using another if statement, we check whether the next element is exactly one greater than the current element. 

If the condition is satisfied, the variable `streak` is incremented by 1, indicating that the consecutive sequence has continued. Otherwise, the variable `streak` is reinitialised to 1, indicating the start of a new consecutive sequence.

The `Math.max()` function is then used to compare the values of `streak` and `streak`. The larger value is stored in `streak`, ensuring that the length of the longest consecutive sequence is maintained throughout the traversal. Finally, the value stored in maxStreak is returned.
