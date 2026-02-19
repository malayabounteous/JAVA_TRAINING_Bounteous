package MultiThreadingFileWrite;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MultiFileWrite {
    public static void main(String[] args) {
        MyfileWrite t1=new MyfileWrite("C:\\Users\\MalayaSahu\\Documents\\dsa\\MultiThreadingFileWrite\\out.txt");
        MyfileWrite t2=new MyfileWrite("C:\\Users\\MalayaSahu\\Documents\\dsa\\MultiThreadingFileWrite\\out.txt");

        t1.start();
        t2.start();

    }
}

class MyfileWrite extends Thread{
    Path p;

     MyfileWrite(String p)
    {
        this.p=Path.of(p);
    }
    public void run()
    {
        int i=0;
        while(i<100)
        {
            try{
                Files.writeString(p,Thread.currentThread().getName()+" "+i+ "\n" ,StandardCharsets.UTF_8,StandardOpenOption.APPEND);

            }
            catch(IOException e)
            {

            }
            i++;
        }
    }
}
