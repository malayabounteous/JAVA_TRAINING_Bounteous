package HashSet;

public class Main {
    
    public static void main(String[] args) {
        MyHashSet<Integer> set=new MyHashSet<>();

        set.add(10);
        set.add(20);
        set.add(23);
        set.add(58);
        set.add(33);
        System.out.println(set.toString());
        System.out.println(set.contains(78));
        
        MyHashSet<String>set2=new MyHashSet<>();
        set2.add("malaya");
        set2.add("sahu");
        set2.add("chandan");
         System.out.println(set2.toString());
        int ans="b".compareTo("A");
       System.out.println(ans);
    }
}
