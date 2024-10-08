/*  Single Number :- 

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*/

package com.tanmay.LeetCodeEasyProblems;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {2,6,2,3,4,3,4};
		System.out.println(singleNumber(nums));
		
	}

	public static int singleNumber(int[] nums) {
		
		int val = 0;
        for(int i=0;i<nums.length;i++)
        {
        	val = val^nums[i];
        }        
        return val;
    }
}
