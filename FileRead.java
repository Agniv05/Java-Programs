import java.io.*;

public class FileRead {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("ABC.txt");
        BufferedReader br = new BufferedReader(fr);
        String txt ;
        while((txt= br.readLine()) != null)
            System.out.println(txt);
        br.close();

    }
}
