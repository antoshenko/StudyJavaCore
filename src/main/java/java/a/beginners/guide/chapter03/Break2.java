package main.java.java.a.beginners.guide.chapter03;

public class Break2 {
    public static void main(String[] args) throws java.io.IOException{

        char ch;

        for( ; ; ){
            ch=(char) System.in.read();

            if(ch=='q') break;
        }
        System.out.println("Вы нажали клавишу q!");
    }
}
