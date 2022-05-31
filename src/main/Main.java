package main;

public class Main {
    public static int totalWords = 2315;

    public static void main(String[] args){


        Dictionary[] obj = new Dictionary[totalWords];
        obj[0] = new Dictionary("Something");
        System.out.println(obj[0].getPosition(3));
    }
}
