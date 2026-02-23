package Generics;

 class Box <T> {
    T var;
    public T getVar()
    {
        return var;
    }
    public void setVar(T x)
    {
        this.var=x;
    }

    public String toString()
    {

        String ans="Value of vatriable is="+var;
        return ans;
    }
}
public class BoxMain
{
    public static void main(String[] args) {

        Box<Integer> b1=new Box<>();
        Box<String>b2=new Box<>();
        b1.setVar(123);
        b2.setVar("Malaya Sahu");
        System.out.println( b1.toString());
        System.out.println(b2.toString());
    }
}
