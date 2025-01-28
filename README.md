


# Arrays.java
 
 1. printPairs (To print all the pairs in the Array)
 2. printSubArrays (To print all the sub arrays in the Array)
 3. printSumOfSubArrays (To calculate the sum of each sub array and print min & max sum)

 4. prefixSum (To calculate the sum of each sub array and print max sum) O(n^2)

   > Uses a prefix sum array and formulae to calculate current sum.
   > Formulae : CurrSum = (start == 0) ? prefix[end] : prefix[end]-prefix[start-1]

 5. usingKadanesAlgo O(n)

   > Whenever the currSum goes to Negative, Make The currSum to zero, so, that it doesn't affect maxSum 
 
 * Number of sub-arrays in an array : n(n+1)/2 
 * Number of pairs in an array : n(n-1)/2
 