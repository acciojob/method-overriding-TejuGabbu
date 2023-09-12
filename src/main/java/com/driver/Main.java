package com.driver;

class A
{
    public String meth()
    {
        return "Invoking method from class A";
    }

}
class B extends A
{
    public String meth()
    {
        return "Method is overridden in Extendend class B";
    }
}
public class Main
{
    public static void main(String[] args)
    {
           B b = new B();
           String first = b.meth();
           String second = b.meth();
           System.out.println(first);
            System.out.println(second);
    }
}