public class UpdatingVariables {
    public static void main (String [] args) {
        // Update numeric data:
        int salary = 1000;
        salary = salary + 200;
        System.out.println (salary); // 1200

        salary += 300;
        System.out.println (salary); // 1500

        // Update variables of type String:
        String employeeName = "Cristian";
        employeeName = employeeName + " Franco";
        System.out.println (salary); // Cristian Franco

        employeeName += " Bedoya";
        System.out.println (employeeName); // Cristian Franco Bedoya

        employeeName = "Super " + employeeName;
        System.out.println (employeeName); // Super Cristian Franco Bedoya
    }
}