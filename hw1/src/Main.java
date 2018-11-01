public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    //5
    public static int Search(int[] array, int num, int left, int right) {
        if (left > right)
            return -1;

        int middle = (right + left) / 2;

        if (array[middle] == num)
            return middle;

        if (array[middle] > num)
            return Search(array, num, left, middle - 1);
        return Search(array, num, middle + 1, right);
    }
    //6


    private static int factorial(int n) {

        int ans = 1;

        if (n == 0) {
            ans = 1;
            return ans;
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                ans = ans * i;
            }
            return ans;
        } else return 0;
    }

    //6-2
    private static int fuction(int x, int n) {

        if (n == 0) {
            return 1;
        } else  {
            return x * fuction(x, n - 1);
        }

    }
}




