package edu.illinois;

public class Main {
    private static final int LO = 1;
    private static final int HI = 100;

    public static void main(String[] args) {
        // Version 1.
        NumberGuesser1 game1 = new NumberGuesser1(LO, HI);
        int attempts1 = game1.play();
        System.out.println("It took you " + attempts1 + " attempts.");

        // Version 2.
        NumberGuesser2 game2 = new NumberGuesser2(LO, HI);
        int attempts2 = game2.play(); // or `game2.play(System.in)` using overloaded method.
        System.out.println("It took you " + attempts2 + " attempts.");

        // Version 3.
        NumberGuesser3 game3 = new NumberGuesser3(LO, HI);
        int attempts3 = game3.play(); // or `game2.play(System.in)` using overloaded method.
        System.out.println("It took you " + attempts3 + " attempts.");

        // Version 4.
        NumberGuesser4 game4 = new NumberGuesser4(LO, HI);
        int attempts4 = game4.play(); // or `game4.play(System.in)` using overloaded method.
        System.out.println("It took you " + attempts4 + " attempts.");
    }
}
