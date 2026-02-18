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

    }
}
