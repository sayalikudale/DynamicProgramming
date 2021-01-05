public class UnboundedKnapsack
{

    private static int max(int i, int j)
    {
        return (i > j) ? i : j;
    }

    // Returns the maximum value with knapsack
    // of W capacity
    private static int unboundedKnapsack(int W, int n,
                                         int[] val, int[] wt)
    {

        // dp[i] is going to store maximum value
        // with knapsack capacity i.
        int dp[] = new int[W + 1];

        // Fill dp[] using above recursive formula
        for(int i = 0; i <= W; i++){
            for(int j = 0; j < n; j++){
                if(wt[j] <= i){
                    dp[i] = max(dp[i], dp[i - wt[j]] +
                            val[j]);
                }
            }
        }
        return dp[W];
    }


    // Driver program
    public static void main(String[] args)
    {
            int W = 10;
//        int val[]   = {1,3,4,6,9,8,10,7,9,11};
//        int wt[]    = {1,2,3,4,5,6,7,8,9,10};

//        int val[]   = {0,9,14,18,23,30,32,39,44,48};
//        int wt[]    = {1,2,3,4,5,6,7,8,9,10};

        int val[]   = {30,14,16,9};
        int wt[]    = {6,3,4,2};
        int n = val.length;
        System.out.println(unboundedKnapsack(W, n, val, wt));
    }


}