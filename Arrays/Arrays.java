package Arrays;
public class Arrays {

    public static void printPairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(arr[i] + "," + arr[j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSubArrays(int arr[]) {

        for (int st = 0; st < arr.length; st++) {

            for (int end = st; end < arr.length; end++) {

                for (int i = st; i <= end; i++) {
                    System.out.print(arr[i] + ",");
                }
                System.out.print("  ");
            }
            System.out.println();
        }

    }

    public static void printSumOfSubArrays(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int st = 0; st < arr.length; st++) {

            for (int end = st; end < arr.length; end++) {
                int sum = 0;
                for (int i = st; i <= end; i++) {
                    sum += arr[i];
                    maxSum = (maxSum < sum) ? sum : maxSum;
                    minSum = (minSum > sum) ? sum : minSum;
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        System.out.println("Max Sum is : " + maxSum);
        System.out.println("Min Sum is : " + minSum);

    }

    public static void prefixSum(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        int sum = 0;

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int st = 0; st < arr.length; st++) {

            for (int end = st; end < arr.length; end++) {

                sum = st == 0 ? prefix[end] : prefix[end] - prefix[st - 1];
                maxSum = (maxSum < sum) ? sum : maxSum;

            }

        }
        System.out.println("Max Sum is : " + maxSum);
    }

    public static void usingKadanesAlgo(int arr[]){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<arr.length;i++){

            currSum += arr[i];

            if(currSum < 0){
                currSum = 0;
            }
            maxSum = (maxSum < currSum) ? currSum : maxSum;

        }

        System.out.println("Max Sum is : " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // printPairs(arr);
        // printSubArrays(arr);
        // printSumOfSubArrays(arr);
        //prefixSum(arr);
        usingKadanesAlgo(arr);

    }
}
