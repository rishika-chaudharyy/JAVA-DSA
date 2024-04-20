//Given n friends , each one can remain single or be paired up with some other friend . Each friend can be paired only once . Find out the total number of ways in which friends can remain single or be paired up

public class FriendsPairingProblem {
    public static int friendsPairingProblemWays(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // kaam
        // single
        int fnm1 = friendsPairingProblemWays(n - 1);

        // paired up
        int fnm2 = (n - 1) * friendsPairingProblemWays(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String args[]) {
        System.out.println(friendsPairingProblemWays(4));
    }
}
