/**
 * DistinctNum100to999
 */
public class DistinctNum100to999 {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                for (int k = 1; k < 9; k++) {
                    if (i!=j && i!=k && j!=k) {
                        System.out.print(i + "" + j + "" + k +"\t");
                        count++;
                    }
                }
            }
            System.out.println();
        }

        System.out.println("There are a total " + count +  " unique (distinct) digit from 111 to 999" );
    }
}