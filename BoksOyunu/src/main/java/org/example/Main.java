package org.example;

public class Main {
    public static void main(String[] args)
    {
        Fighter f1=new Fighter("Ahmet",10,120,93,30);
        Fighter f2 =new Fighter("Ali",20,85,94,40);


        Match match=new Match(f1,f2,90,95);
        match.run();
    }
}
