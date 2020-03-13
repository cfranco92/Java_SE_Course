public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        var PI = Math.PI; // 3.141592653589793
        var E = Math.E; // 2.718281828459045

        var ceil = Math.ceil (2.1); // 3.0 (round up)
        var floar = Math.floor (2.1); // 2.0 (round down)

        Math.pow (2, 3); // 8.0 (number raised to a power)
        Math.sqrt (3); // 1.73 ... (square root)

        Math.max (2, 3); // 3.0 (the largest number)

        // Area of a circle (PI * r ^ 2):
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Area of a sphere (4 * PI * r ^ 2):
        System.out.println(4 * Math.PI * Math.pow (y, 2));

        // Volume of a sphere ((4/3) * PI * r ^ 3):
        System.out.println((4/3) * Math.PI * Math.pow (y, 3));
    }
}
