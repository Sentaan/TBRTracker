package sentaan;

import java.io.File;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File myFile = new File("TBR.csv");
        CsvDecoder myCsvDecoder;

        if(myFile.exists())
        {
            String[] filename = myFile.getName().split("[.]");
            if (filename[1].equals("csv"))
            {
                myCsvDecoder = new CsvDecoder(myFile);
            }
        }
        else
        {
            System.out.println("Does not Exist");
        }
    }
}