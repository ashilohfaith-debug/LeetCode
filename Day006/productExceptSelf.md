# 238. Product of Array Except Self
`Medium`
## Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]. The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer. You must write an algorithm that runs in O(n) time and without using the division operation.

<br/>

Before writing the code, the following must be kept in mind:
- If there are 2 or more zeros, then every position's product except self will be 0.
- If there is 1 zero, only the position containing that zero gets the product of all the non-zero values; all other positions become 0.
- If there are no zeros, we can safely use division.

<br/>

`int[] nums1 = new int[nums.length];`

The above line creates an integer array called `nums1`, which stores the final result. The size of the array is the same as that of the input array `nums`.

A variable `prod` is initialized to 1. It stores the product of all non-zero elements in the array. A variable `countZero` is initialized to 0. It keeps track of the number of zeros present in the array.

Using a for loop, we iterate through each element in the array `nums`. Using an if statement, we check whether the current element is 0. If it is not 0, it is multiplied with `prod`. Otherwise, the variable `countZero` is incremented by 1.

Using another if statement, we check whether `countZero` is greater than 1. If it is, a new integer array of the same length as nums is returned. Since the array is initialized with default values of 0, every element in the returned array is 0.

Using another for loop, we compute the required values for each position in the result array. If `countZero` is 0, the product except self is calculated by dividing prod by the current element, and the result is stored in nums1.

If `countZero` is 1, a ternary operator is used to check whether the current element is 0. If it is 0, the corresponding position in `nums1` is assigned the value of `prod`. Otherwise, it is assigned 0. Finally, the array `nums1` is returned.
