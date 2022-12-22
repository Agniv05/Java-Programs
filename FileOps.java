import java.io.*;

public class FileOps {
    public static void main(String[] args)throws IOException {
        String f1 = "ABC.txt";
        FileWriter fw = new FileWriter(f1);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("Hello world");
        pw.println("Testing purpose");
        pw.close();

        File f = new File(f1);
        File nf = new File("XYZ.txt");
        f.renameTo(nf);

    }
}