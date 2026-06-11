// Demonstrate PrintWriter
import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, false);

        int i = 10;
        double d = 123.67;

        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);
        pw.println(i + " + " + d + " is " + (i+d));
        pw.print("The end of Semester One");
        pw.flush();
    }
}
