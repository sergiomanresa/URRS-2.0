package A6_3;

public class Comercial extends Empleado{

    private int kilometrosRecorridos;
    Comercial(String nombre, int edad, double sueldo, int identificador) {
        super(nombre, edad, sueldo, identificador);
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return (horasTrabajadas * 6) + (kilometrosRecorridos * 0.3);
    }
}
