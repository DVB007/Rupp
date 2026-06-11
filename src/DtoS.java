/* A simple disk-to-screen utility that
  demonstrates a FileReader. */

import java.io.*;

class DtoS {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("d:/year2/a4y2/testx2.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;

        while((s = br.readLine()) != null)
            System.out.println(s);

        fr.close();
    }
}