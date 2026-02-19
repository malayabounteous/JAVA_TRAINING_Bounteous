package HashSet;

public class MyHashSet<E> {
    private int capacity=10;
    private Node<E>[]list;

    public MyHashSet()
    {
        list=new Node[capacity];
    }
    private int getindex(E key)
    {
        int hash=key.hashCode();
        int h=Math.abs(hash)%capacity;
        return h;
    }
    public void add(E key)
    {
        int index=getindex(key );

        Node<E>head=list[index];
    
        Node<E>cur=head;

        while(cur!=null)
        {
            if(cur.key.equals(key))
                return;
            cur=cur.next;
        }

        Node<E>newhead=new Node<>(key);
        newhead.next=head;
        list[index]=newhead;
    }
    public boolean contains(E key)
    {
        int index=getindex(key);
        Node<E>cur=list[index];

        while(cur!=null)
        {
             if(cur.key.equals(key))
                return true;
            cur=cur.next;
        }
        return false;
    }
    public void remove(E key)
    {
        int index=getindex(key);
        Node<E>cur=list[index];

        Node<E>prev=null;
        while(cur!=null)
        {
            if(cur.key.equals(key))
            {
                if(prev==null)
                {
                    list[index]=cur;
                }
                else{
                    prev.next=cur.next;
                }
                return;
            }


            prev=cur;
            cur=cur.next;
        }
    }
   
    @Override
public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append("[ ");

    for(int i=0;i<capacity;i++){
        Node<E> curr = list[i];

        while(curr != null){
            sb.append(curr.key).append(",");
            curr = curr.next;
        }
    }

    sb.append("]");
    return sb.toString();
}

}
