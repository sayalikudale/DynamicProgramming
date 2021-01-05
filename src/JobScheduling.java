/**
 * Created by sayali on 11/18/20.
 */
public class JobScheduling {


    private static int JobScheduling(int[] s, int[] l, int n)
    {
        int [] opt= new int[n+1];

        opt[1]=s[0];


        for (int i = 1; i < n; i++)
            opt[i+1] = Math.max(s[i] + opt[i],
                    l[i - 1] + opt[i - 1]);

        return  opt[n];
    }

    // Driver program
    public static void main(String[] args)
    {
        int s[]   = {5,11,8,29,4};
        int l[]    = {15,20,40,30,0};
//        int s[]   = {10,12,10,15,8};
//        int l[]    = {15,20,18,30,15};

//        int s[]   = {5,11,8,29,25};
//        int l[]    = {25,30,40,30,0};
        int n = s.length;
        System.out.println(JobScheduling(s,l, n));
    }


}
