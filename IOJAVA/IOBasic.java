package IOJAVA;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOBasic {
    public static void main(String[] args) throws IOException {
        Path inputPath = Path.of("C:\\Users\\MalayaSahu\\Documents\\dsa\\IOJAVA\\input.txt");
        // 1- write a file
        //  if(Files.exists(inputPath))
        //     throw new IOException();

        //WRITING INTO FILE
        // Files.writeString(inputPath, "Hello java \n this is 2nd line \n this is third line. \n", StandardCharsets.UTF_8);
         Files.writeString(inputPath,"");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        while(true)
        {
            line=bf.readLine();
            if(line.isEmpty())break;
             Files.writeString(inputPath, line+"\n",StandardCharsets.UTF_8,StandardOpenOption.APPEND);
        }

       
        // FileInputStream fis= new FileInputStream("input.txt");
       // Files.writeString(inputPath, "Writeing new lines \n", StandardCharsets.UTF_8,StandardOpenOption.APPEND);

      //READING FROM FILE

      String data=Files.readString(inputPath);
      System.out.println(data);


      //READING LINE AND STORE IN LIST
      List<String>lines=Files.readAllLines(inputPath);
      System.out.println(lines);

    }
}
