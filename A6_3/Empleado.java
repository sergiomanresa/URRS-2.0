package A6_3;

public abstract class Empleado extends Persona {
    private double sueldo;
    private int identificador;
    Empleado(String nombre, int edad, double sueldo, int identificador) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.identificador = identificador;
    }

    public abstract double calcularSueldo(int horasTrabajadas);
}
