package A6_3;

public class Secretario extends Empleado{
    public Secretario(String nombre, int edad, double sueldo, int identificador) {
        super(nombre, edad, sueldo, identificador);
    }

    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return horasTrabajadas * 7;
    }

}
