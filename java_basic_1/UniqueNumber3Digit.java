package java_basic_1;

public class UniqueNumber3Digit {


    public static void main(String[] args) {
        int[] A = {1, 2, 3 , 4};
        int[] B = {1, 2, 3 , 4};
        int[] C = {1, 2, 3 , 4};
        int c = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    continue;
                }
                for (int k = 0; k < C.length; k++) {
                    if (A[i] == C[k] || B[j] == C[k]) {
                        continue;
                    }else{
                        System.out.println(A[i] + " " + B[j] + " " + C[k]);
                    }
                }
            }
        }
        int totalUnique = (factorial(A.length)/(factorial(A.length-3)));

        System.out.println("Total Unique Number is : " + totalUnique);
    }

    public static int factorial(int n) {
        if (n <=1 )
            return 1;

        return n * factorial(n-1);
    }
}
