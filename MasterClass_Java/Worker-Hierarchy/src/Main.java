//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SalariedEmployee juan = new SalariedEmployee("Juan", "1980", 101, "2020", 120000);

        System.out.println("--- JUAN (Asalariado) ---");
        System.out.println("Edad: " + juan.getAge());
        System.out.println("Pago Quincenal: " + juan.collectPay());
        System.out.println();
        System.out.println("_______________________________");

        juan.retired();
        System.out.println("Pago Pensión: " + juan.collectPay());
        System.out.println();
        System.out.println("_______________________________");
        for (int i = 1; i < 6; i++) {
            HourlyEmployee s = new HourlyEmployee(
                    switch (i) {
                        case 1 -> "Maria";
                        case 2 -> "Juan";
                        case 3 -> "Pedro";
                        case 4 -> "Antonio";
                        case 5 -> "Carlos";
                        default -> "Anonymous";
                    }, "1995", 102, "2021", 20.0);

            System.out.println("--- " +s +" (Por Hora) ---");
            System.out.println("Edad: " + s.getAge());
            System.out.println("Pago Semanal (40h): " + s.collectPay()); // 20 * 40 = 800
            System.out.println("Pago Doble (Hora extra): " + s.getDoublePay());

        }
    }

}