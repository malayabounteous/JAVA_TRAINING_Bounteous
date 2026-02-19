package IOJAVA;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
public class Buffered {
    public static void main(String[] args) throws IOException {
        
        Path p=Path.of("C:\\Users\\MalayaSahu\\Documents\\dsa\\IOJAVA\\input1.txt");

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String line;
        Files.writeString(p,"");

        while(true)
        {
            line=bf.readLine();
            if(line.isEmpty())
                break;
            Files.writeString(p, line+"\n",StandardCharsets.UTF_8,StandardOpenOption.APPEND);
        }

        BufferedReader bf1=new BufferedReader(new FileReader("C:\\Users\\MalayaSahu\\Documents\\dsa\\IOJAVA\\input1.txt"));

        String l;
        int cnt=0;

        while((l=bf1.readLine())!=null)
        {
            List<String>list=Arrays.asList(l.split(" "));
            for(int i=0;i<list.size();++i)
            {
                if(list.get(i).equals("java"))
                    cnt++;
            }
        }

        System.out.println("the word JAVA present in files "+cnt+ " times");

    }
}
