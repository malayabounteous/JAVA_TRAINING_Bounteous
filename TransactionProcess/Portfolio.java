package TransactionProcess;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Portfolio {
    private Map<Integer,Account> accountMap=new ConcurrentHashMap<>();
    private Map<String,Position>positionMap=new ConcurrentHashMap<>();

    public void load(List<Account> accounts)
    {
        accounts.forEach(a->accountMap.put(a.getAccountId(),a));
        System.out.println("portfolio loaded size="+accounts.size());
    }
    public boolean accountExists(int id)
    {
        return accountMap.containsKey(id);
    }
    public Account getAccount(int id)
    {
        return accountMap.get(id);
    }
    public Collection<Account> getAllAccounts()
    {
        return Collections.unmodifiableCollection(accountMap.values());
    }
    private String posKey(int accountId,String symbol)
    {
        String key=Integer.toString(accountId)+symbol;
        return key;
    }
    private Position getOrCreate(int accountId,String symbol)
    {
        String key=posKey(accountId,symbol);
        Position p=positionMap.get(key);
        if(p==null)
        {
            p=new Position(accountId,symbol);
            positionMap.put(key,p);
            Account a=accountMap.get(accountId);
            if(a!=null)
            {
                a.addPosition(p);
            }
        }
        return p;
    }
    public void applyTrade(Trade trade)
    {
        Position p=getOrCreate(trade.getAccountId(),trade.getSymbol());

        if(trade.getSide().equals("BUY"))
        {
            p.applyBuy(trade.getQuantity(),trade.getPrice());
        }
        else {
            p.applySell(trade.getQuantity());
        }
        Account act=accountMap.get(trade.getAccountId());
        if(act!=null)
        {
            act.addTrade(trade);
        }
    }
    public Position getPosition(int accountId,String symbol)
    {
        return positionMap.get(posKey(accountId,symbol));
    }

    public List<Position>getPositionById(int accountId)
    {
        List<Position>ans=positionMap.values().stream().filter(p->p.getAccountId()==accountId).toList();
        return ans;
    }

    public List<Position> getAllPosition()
    {
        List<Position>ans=positionMap.values().stream().filter(p->p.getNetQuantity()>0).toList();
        return ans;
    }
}
