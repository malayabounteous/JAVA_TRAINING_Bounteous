package IOJAVA;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
public class AccuranceWord {
    public static void main(String[] args) throws IOException {
        
        Path p=Path.of("C:\\Users\\MalayaSahu\\Documents\\dsa\\IOJAVA\\input1.txt");
        BufferedReader bf1=Files.newBufferedReader(p,StandardCharsets.UTF_8);
        String l;
        int cnt=0;

        while((l=bf1.readLine())!=null)
        {
            List<String>list=Arrays.asList(l.split("\\W+"));
            for(int i=0;i<list.size();++i)
            {
                if(list.get(i).equals("java"))
                    cnt++;
            }
        }

        System.out.println("the word JAVA present in files "+cnt+ " times");
    }
}
