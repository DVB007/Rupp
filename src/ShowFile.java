/* Display a text file.

To use this program, specify the name of the file that
you want to see. For example, to see a file called TEST.TXT,
use the following command line.

      > java ShowFile TEST.TXT <-!

*/

import java.io.*;

class ShowFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        try {
            fin = new FileInputStream("/Users/phinsopheacheadavid/Documents/Java2/RUPP");
        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }
        // read bytes until EOF is encountered
        do {
            i = fin.read();
            if(i != -1)
                System.out.print((char) i);
        } while(i != -1);
        fin.close();
    }
}