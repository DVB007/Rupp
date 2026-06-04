// Demonstrate System.out.write().
import java.io.*;
class WriteDemo {
    public static void main(String[] args) throws IOException {
        int b;
        b = 'C';
        System.out.write(b);
        System.out.write(99);
        // System.out.write('\n');
        System.out.flush();
    }
}