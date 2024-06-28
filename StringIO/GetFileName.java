package StringIO;

import java.io.File;

public class GetFileName {

    //Java: Get a list of all file/directory names
    public static void main(String[] args) {
        File file = new File("C://");
        String[] list = file.list();
        for(String filename : list){
            System.out.println(filename);
        }
    }
}
