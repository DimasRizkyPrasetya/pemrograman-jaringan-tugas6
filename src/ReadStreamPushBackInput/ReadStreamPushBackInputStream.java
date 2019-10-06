
package ReadStreamPushBackInput;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ReadStreamPushBackInputStream {
    public static void main(String[] args) {
        
//            PushbackInputStream stream = new PushbackInputStream(System.in);
//               System.out.println("Masukan Karakter apapun: ");
            try {
                //mengganti untuk bisa membaca file 
                PushbackInputStream stream = new PushbackInputStream(new FileInputStream("coba.txt"));
                int read = stream.read();
                stream.unread(read);
                int read2 = stream.read();
                System.out.println("" + (char) read);
                System.out.println("" + (char) read2);
                
                        }catch (IOException ex){
                            Logger.getLogger(ReadStreamPushBackInputStream.class.getName()).log(Level.SEVERE, null , ex);
                        }
    }
}
    
    
