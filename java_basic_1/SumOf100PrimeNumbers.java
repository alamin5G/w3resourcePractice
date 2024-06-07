package java_basic_1;

import java.util.ArrayList;
import java.util.List;

public class SumOf100PrimeNumbers {

    List<Integer> primeNumbers = new ArrayList<>();
    public int sumOfPrime(int n) {


        int pn = 2;
        while(primeNumbers.size() < n) {

           if (isPrime(pn)){
               primeNumbers.add(pn);
           }
            pn++;
        }


        return primeNumbers.stream().reduce(0, Integer::sum);
    }

    private boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    private int countSum(List<Integer> primeNumbers, int length){
//        int sum = 0;
//        for (int i = 0; i < length; i++) {
//            sum += primeNumbers.get(i);
//        }
//
//        return sum;
//    }

    public static void main(String[] args) {
        SumOf100PrimeNumbers sum = new SumOf100PrimeNumbers();

        System.out.println("Sum of first 100 prime numbers: " );
        System.out.println(sum.sumOfPrime(100));
    }
}
