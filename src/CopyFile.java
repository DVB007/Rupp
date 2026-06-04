/* Copy a text file.
      To use this program, specify the name of the source file 
      and the destination file. For example, to copy a file called 
      FIRST.TXT to a file called SECOND.TXT, use the following
      command line.
        java CopyFile FIRST.TXT SECOND.TXT
   */
import java.io.*;
class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;

        try {
            // open input file
            try {
                fin = new FileInputStream("/Users/phinsopheacheadavid/Documents/Java2/RUPP");
            } catch(FileNotFoundException exc) {
                System.out.println("Input File Not Found");
                return;
            }
            // open output file

            try {
                fout = new FileOutputStream("d:/year2/a4y2/abc.txt");
            } catch(FileNotFoundException exc) {
                System.out.println("Error Opening Output File");
                return;
            }
        } catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Usage: CopyFile From To");
            return;
        }
        // Copy File
        try {
            do {
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                    System.out.print((char) i);
                }
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("File Error");
        }
        fin.close();
        fout.close();
    }
}