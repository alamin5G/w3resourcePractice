package StringIO;

import java.io.File;

public class CheckFolderIsExist {
    public static void main(String[] args) {
        File folder = new File("C://Alamin//");

        if (folder.exists()){
            System.out.println("Folder already exists");
        }else {
            folder.mkdir();
            System.out.println("Folder created");

        }
    }
}
