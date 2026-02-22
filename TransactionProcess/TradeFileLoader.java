package TransactionProcess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TradeFileLoader {
    private String filepath;

    public TradeFileLoader(String path)
    {
        filepath=path;
    }
    public List<TradeRequest> load()throws IOException
    {
        List<TradeRequest>requests=new ArrayList<>();

        try(BufferedReader reader=new BufferedReader(new FileReader(filepath)))
        {
            boolean firstline=true;
            String line;
            while((line=reader.readLine())!=null)
            {
                line=line.trim();
                if(line.isEmpty())continue;

                if(firstline)
                {
                    firstline=false;
                    continue;
                }
               TradeRequest tr=parseLine(line);
                requests.add(tr);
            }


        }
        return requests;
    }

    private TradeRequest parseLine(String line)
    {
        String[]parts=line.split(",");

        int tradeId=Integer.parseInt(parts[0]);
        int accId=Integer.parseInt(parts[1]);
        String symbol=parts[2];
        int quantity=Integer.parseInt(parts[3]);
        double price=Double.parseDouble(parts[4]);
        String side=parts[5];

        return new TradeRequest(tradeId,accId,symbol,quantity,price,side);
    }
}
