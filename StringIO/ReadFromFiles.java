package StringIO;

import java.io.*;

public class ReadFromFiles {
    public static void main(String a[]) throws IOException {
        File file = new File("amartestfile.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        InputStream fins = null;
        try {
            fins = new FileInputStream(file);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fins != null) fins.close();
            } catch(Exception ex){

            }
        }
    }
}
