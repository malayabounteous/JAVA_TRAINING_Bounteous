package Generics;


class FindMax {

    public static <T extends Comparable<T>> T Maxi(T a,T b,T c)
    {
        int x=a.compareTo(b);
        if(x>=0)
        {
            return b.compareTo(c)>0?a:c;
        }
        else {
            return b.compareTo(c)>0?b:c;
        }
    }
}

public class Qn2StaticMethod {
    public static void main(String[] args) {


        System.out.println(FindMax.Maxi(23,34,-12));
        System.out.println(FindMax.Maxi("malaya","chandan","prabir"));
    }
}
