package java_basic_1;

public class USAFlag {

    //An USA Flag
   // * * * * * * //================================== 33
    public void flagOfUsa(){
        for (int i = 1; i <=15 ; i++) {
            for (int j = 1; j <=45 ; j++) {
                if(i % 2 != 0 && i<10){

                    if(j>12){
                        System.out.print("=");
                    }else{
                        if(j%2!=0){
                            System.out.print("*");
                        }else {
                            System.out.print(" ");
                        }
                    }
                }else {

                    if (i>9){
                        System.out.print("=");
                    }else{


                        if (j==12) System.out.printf(" ");

                        if(j>11){
                            if (j==44) continue;
                            System.out.print("=");

                        }else{
                            if(j%2!=0){
                                System.out.print(" ");
                            }else {
                                System.out.print("*");
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        USAFlag flag = new USAFlag();
        flag.flagOfUsa();
    }
}
