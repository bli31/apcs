// Giant Lotus -- Brian Li, Ryan Lau, Weichen Liu
// APCS
// HW08 -- Basic printed greetings!
// 2021-09-30

/*
DISCOVERIES
 0. If you update Greet.java, you have to re-javac Greet.java so that java Greet runs the updated Greet.java.
UNRESOLVED QUESTIONS
 0. Are we supposed to randomly pick 1 of the 3 hardcoded persons to greet?
*/

import BigSib

public class Greet {
    public static void main( String[] args ) {
        BigSib.greet("Flim");
        BigSib.greet("Flam");
        BigSib.greet("Kazaam");
    }
}
