package JavaFileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextfile {

    public static String linetxt = "";
    public static void main(String[] args) throws IOException {
        String filepath = "C:\\intelli\\seleniumpractice\\New folder\\sample.txt";
        BufferedReader BR =new BufferedReader(new FileReader(filepath));
        while ((linetxt = BR.readLine()) !=null){
            System.out.println(linetxt);
        }
    }
}
