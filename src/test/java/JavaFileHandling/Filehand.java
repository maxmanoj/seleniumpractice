package JavaFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Filehand {
    public static void main(String[] args) throws IOException {

        String filepath = "C:\\intelli\\seleniumpractice\\New folder\\sample"+timeformatter()+".txt";
                File txtfile = new File(filepath);
        BufferedWriter bw = new BufferedWriter(new FileWriter(txtfile));
        bw.write(" Infinity chapter");
        bw.newLine();
        bw.write("hi how are you ");
        bw.close();
        System.out.println(timeformatter());

    }

    public static String timeformatter (){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYYMMDDHHmmss");
        LocalDateTime timer = LocalDateTime.now();
        return dtf.format(timer);

    }
}
