import java.io.*;

class listFilesDM {
    public static void main(String[] args) {
        String dirname = "d:/year2/a4y2/";
        File f1 = new File(dirname);

        OnlyExt only = new OnlyExt("java");
        File[] f = f1.listFiles(only);

        for (int i=0; i < f.length; i++) {
            // if (only.accept(f[i]))
            System.out.println( f[i].getName());
        }
    }
}
class OnlyExt implements FileFilter {
    String ext;
    OnlyExt(String ext) {
        this.ext = "." + ext;
    }
    public boolean accept(File file) {
        return file.getAbsolutePath().endsWith(ext);
    }
}
