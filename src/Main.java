import java.util.Scanner;

public class Main {
    private static int sharkx = 3;
    private static int sharky = 3;
    private static int x = 0;
    private static int y = 0;
    private static int boatx = (int) Math.floor(Math.random() * (3 - 1 + 1));
    private static int boaty = (int) Math.floor(Math.random() * (3 - 1 + 1));
    private static boolean sharktrue = false;
    private static boolean boattrue = false;
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        opening1();
        opening2();
        opening3();
        opening4();
        opening5();
        opening6();
        for (int i = 0; i < 15; i++){
            input();
            checkshark();
            if (sharktrue == true) sadending();
            checkboat();
            if (boattrue == true) happyending();
            endofturn();
        }
        sadending();
    }
    private static void opening1() {
        System.out.println("Once upon a time, you were sailing in an ocean");
    }
    private static void opening2() {
        System.out.println("Suddenly, you capsized in the ocean...");
    }
    private static void opening3() {
        System.out.println("And you started drifting...");
    }
    private static void opening4() {
        for (int i = 0; i < 4; i++) {
            System.out.println("drifting...");
        }
    }
    private static void opening5() {
        System.out.println("until you cannot see the boat anymore");
    }
    private static void opening6() {
       System.out.println("Quick! Swim back to your boat before it drifts away!");
       System.out.println("Your boat is at (" + boatx + ", " + boaty + ")!");
    }
    private static void input(){
        System.out.println ("Please input a direction:");
        String in = scan.nextLine().toLowerCase();
        if (in.equals("north")&&y<=3) y++;
        if (in.equals("east")&&x<=3) x++;
        if (in.equals("south")&&y>=0) y--;
        if (in.equals("west")&&x>=0) x--;
    }
    private static void checkboat(){
        if (boatx == x && boaty == y) boattrue = true;
    }
    private static void checkshark(){
        if (x == sharkx && y == sharky) {
            sharktrue = true;
            System.out.println("The shark has caught you! Oh no!");
        }
    }
    private static void happyending (){
        System.out.println ("You are back on your boat!");
        System.out.println ("Hooray!");
        System.exit(0);
    }
    private static void sadending(){
        System.out.println ("You did not make it back to your boat!");
        System.out.println ("Try again!");
        System.exit(0);
    }
    private static void endofturn(){
        if (sharkx<4 && sharkx >= 0){
            if ((int) Math.floor(Math.random() * (2))%2 == 0) sharkx++;
            else sharkx--;
        } else if (sharkx<4) sharkx++;
        else sharkx--;
        if (sharky<4 && sharky >= 0){
            if ((int) Math.floor(Math.random() * (2))%2 == 0) sharky++;
            else sharky--;
        } else if (sharky<4) sharky++;
        else sharky--;
    }
}