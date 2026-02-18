package ASSIGNMENT;

public class Custom {
    
    int[]array=new int[10];
    int index;
    void add(int x)
    {
        if(index>=array.length)
        {
            increseCapacity();
           
        }
         array[index]=x;
         index++;
        
    }
    private void increseCapacity()
    {
        int n=array.length*2;
        int[] newarray=new int[n];
        for(int i=0;i<n/2;++i){
             newarray[i]=array[i];
        }
        this.array=newarray;
        
    }
    void remove(int ind)
    {
        int n=array.length;

        for(int i=ind;i<n-1;++i){
            array[i]=array[i+1];
        }
        array[n]=0;
        index--;
    }
    boolean isEmpty()
    {
        if(index==0)
            return true;
        return false;
    }

}
