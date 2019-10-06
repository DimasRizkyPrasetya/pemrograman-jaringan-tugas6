
package ReadStreamPushBackInput;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadStreamPushBackReader {
    public static void main(String[] args) throws IOException{
        
        
        String filepath = "E:\\KULIAH\\Semester 5\\Pemrograman Jaringan\\Tugas\\Tugas5\\LineNumber\\coba.txt";
        File path = new File (filepath);
        PushbackReader reader = new PushbackReader(new InputStreamReader(new FileInputStream(path)));
                     char[] words = new char [(int)path.length()];
                     try {
                         
                         reader.read(words);
                         reader.unread(words[1]);
                         System.out.println("" + new String(words));
                         reader.read(words);
                         System.out.println("" + new String(words));
//                            reader.unread(words);
                            
                     } catch (IOException ex) {
                         Logger.getLogger(ReadStreamPushBackReader.class.getName()).log(Level.SEVERE, null, ex);
                     }
    }
}
