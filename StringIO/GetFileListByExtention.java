package StringIO;

import java.io.File;
import java.io.FilenameFilter;

public class GetFileListByExtention {

    public static void main(String[] args) {
        File file = new File("C://TempFileSave//Data//");

        System.out.println(file);
        String[] list = file.list((dir, name) -> {
            if (name.endsWith(".txt")) {
                return true;
            }else return false;
        });

        assert list != null;
        for(String fileName : list) {
            System.out.println(fileName);
        }
    }
}
