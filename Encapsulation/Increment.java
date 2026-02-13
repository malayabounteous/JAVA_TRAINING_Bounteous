package Encapsulation;

public class Increment {
    private int count;
    private void increment()
    {
        count+=1;
    }
    public void setcount(int cnt)
    {
        count=cnt;
    }
    public int getcount()
    {
        increment();
        return count;
    }
}
