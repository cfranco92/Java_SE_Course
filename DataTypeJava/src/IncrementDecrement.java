public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--; //Decrement
        System.out.println(lives); //3

        lives++; //Increment
        System.out.println(lives); //4

        //Prefix
        //Win a gift to earn a living
        int gift = 100 + lives++; //postfix
        System.out.println(gift);
        System.out.println(lives); //5
    }
}
