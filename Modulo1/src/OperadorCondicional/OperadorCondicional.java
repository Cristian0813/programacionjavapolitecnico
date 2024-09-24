package OperadorCondicional;

public class OperadorCondicional {

    public static void main(String[] args) {
        int a = 4;
        int b = a == 4 ? a + 5 : 6 - a;
        System.out.println(b);
        b = a > 4 ? a * 7 : a + 8;
        System.out.println(b);
    }
}
