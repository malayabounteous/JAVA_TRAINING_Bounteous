package TransactionProcess;

import java.util.List;

public class Main {
    public static void main(String[]args) {

      String csvPath="C:/Users/MalayaSahu/Documents/dsa/TransactionProcess/trades.csv";
      try{
          System.out.println("Loading Trade request from file");
          TradeFileLoader loader=new TradeFileLoader(csvPath);
          List<TradeRequest> requests=loader.load();

          if(requests.size()==0)
              System.out.println("no request reading from file");

          System.out.println("Retriving accounts from DB");
          AccountDataAccess accountDAO=new AccountDataAccess();
          List<Account>accounts=accountDAO.findall();
          Portfolio portfolio=new Portfolio();
          portfolio.load(accounts);

          System.out.println("Trade processing");
          TradeProcessor processor=new TradeProcessor(portfolio);
          List<Trade> allTrades=processor.processAll(requests);
          //SAVE IN DB

          processor.saveTrade();
          processor.savePosition();

          System.out.println("Generate Report");
          ReportGenerator report=new ReportGenerator(allTrades,portfolio.getAllPosition(),portfolio.getAllAccounts(),processor);

          report.printTradeSummary();



      }catch(Exception e)
      {
          System.out.println("Erro in Main program");
      }
    }
}
