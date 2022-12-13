package it.develhope.otherOperators;

public class Main {
    public static void main(String[] args) {

        int a = 15;
        a +=5;
        a-=4;
        int b = a + 1;

        System.out.println("is b an odd number? " + (b %2 !=0));
        System.out.println("is this result a multiple of 3? " + ((b * (b + 1)) % 3 == 0));
    }
}
