public class Casting {
    public static void main(String[] args) {
        var dogsQuantity = 2;
        double monthlyDogs = dogsQuantity / 12.0;
        System.out.println(monthlyDogs);
        // monthlyDogs: 2.5 (but not possible, we don't rescue half a puppy!)

        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(monthlyDogs);
        // estimatedMonthlyDogs: 2

        // Remember that casting doesn't round, just remove decimals:
        Math.sqrt (3);// 1.7320508075688772
        var sqrt = (int) Math.sqrt(3); // 1
        System.out.println(sqrt);

        int a = 30;
        int b = 12;

        System.out.println(a / b); // 2
        System.out.println((double) a/b);// 2.5

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
