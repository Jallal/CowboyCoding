/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

*/

package leetCode.dp;

public class ClimbingStairs_70 {

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0]=1; //There is only one way to climb a non-existing stairs which is not to climb
        dp[1]=1; // there is only one way to climb ONE stair which is climb that dumb stair

        for(int i=2; i<=n; i++ ){
            // we could have climbed from the step before or two steps before
            dp[i]= dp[i-1]+dp[i-2];

        }
        

        return dp[n];
        
    }
    
}
