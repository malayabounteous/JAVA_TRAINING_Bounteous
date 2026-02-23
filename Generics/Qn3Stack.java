package Generics;

import java.util.ArrayList;
import java.util.List;

class MyStack<T>
{
    List<T> stack=new ArrayList<>();

    public void push(T value)
    {
        stack.addFirst(value);
    }
    public T pop()
    {
        if(stack.isEmpty())
            return null;
        T temp=stack.getFirst();
        stack.removeFirst();
        return temp;
    }
    public boolean  checkEmpty()
    {
        return stack.isEmpty();
    }
    public T peek()
    {
        return stack.getFirst();
    }
    public int size()
    {
        return stack.size();
    }
}
public class Qn3Stack {

    public static void main(String[]args) {

        MyStack<Integer>stack=new MyStack<>();
        stack.push(12);
        stack.push(30);
        stack.push(54);
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }

}
