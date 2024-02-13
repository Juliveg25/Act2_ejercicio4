public class Main {
    public static void main(String[] args) {
        //main
        Empleado pedro = new Empleado();
        int totalArriendo = pedro.calcularArriendo(3000, 0.40);
        int totalComida = pedro.calcularComida(3000, 0.15);

        System.out.println("Total salario: $" + pedro.salarioMensual);
        System.out.println("Gasto mensual en arriendo: $" + totalArriendo);
        System.out.println("Gasto mensual en comida: $" + totalComida);
        System.out.println(pedro.salarioMensual - (totalArriendo + totalComida));
    }
}