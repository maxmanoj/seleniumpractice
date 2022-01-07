package JavaFileHandling;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelfile {

    public static void main(String[] args) throws IOException {

        String filepath = "C:\\intelli\\seleniumpractice\\New folder\\sample.xlsx";

        FileInputStream fis = new FileInputStream(new File(filepath));
        XSSFWorkbook wbk = new XSSFWorkbook(fis);
        XSSFSheet sheet = wbk.getSheet("STAB BAR");

        int rowcount = sheet.getPhysicalNumberOfRows();
        int colcount = sheet.getRow(0).getPhysicalNumberOfCells();

        System.out.println("rows=" +rowcount);
        System.out.println("Columns=" +colcount);

        for (int i=0; i<rowcount; i++){
            for (int j=0; j<colcount; j++){
                String str = sheet.getRow(i).getCell(j).toString();
                System.out.print(str +" ");

            }
            System.out.println();
        }

    }
}
