public class Empleado {

    public int salarioMensual; //dolares
    public double gastoArriendo;
    public double gastoComida;

    public int calcularArriendo(int salarioMensual, double gastoArriendo){
        this.salarioMensual = salarioMensual;
        this.gastoArriendo = gastoArriendo;
        return (int) (salarioMensual * gastoArriendo);
    }

    public int calcularComida(int salarioMensual, double gastoComida){
        this.salarioMensual = salarioMensual;
        this.gastoComida = gastoComida;
        return (int) (salarioMensual * gastoComida);
    }

}