// Read an array of bytes from the keyboard.
import java.io.*;

class ReadBytes {
    public static void main(String[] args) throws IOException {

        byte[] data = new byte[10];
        System.out.print("Enter some characters : ");

        try {
            System.in.read(data);
        }catch(IOException ignored){ }

        System.out.print("You entered: ");
        for (byte datum : data) System.out.print((char) datum);
    }
}