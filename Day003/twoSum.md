# Two Sum
## Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

`HashMap<Integer, Integer> map = new HashMap<>();`

The above line creates a HashMap called `map` in Java, which stores unique integer keys and non-unique integer values.

Within a for loop, we use the `put()` function to add the values along with their unique keys into the HashMap.

Within another for loop, we compute the difference between each element of the HashMap and the target and store it in a variable called `diff`.

Using an if statement, we check whether the value stored in `diff` is present in the HashMap and whether it has a different index than the element stored in `nums[i]` by using the functions `containsKey()` and `get()`. If the condition is satisfied, it returns the two index numbers in the form of an array.
