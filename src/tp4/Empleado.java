/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author andres.piuzzi 
 */
public class Empleado {
     // Atributos (encapsulados)
    private int id;
    private String nombre;
    private String posicion;
    private double salario;
    
    // Contador global para IDs y total creados
    private static int totalEmpleado = 0;
    
   // Constructor sin salario (por defecto 0.0)
    public Empleado(String nombre, String posicion) {
       this.id = ++totalEmpleado;     // se incrementa UNA vez y se usa como id
       this.nombre = nombre;
       this.posicion = posicion;
       this.salario = 0.0;
    }
    
    // Constructor con salario
    public Empleado(String nombre, String posicion, double salario) {
        this.id = ++totalEmpleado;
        this.nombre = nombre;
        this.posicion = posicion;
        setSalario(salario); // si es negativo, lo dejará en 0 y avisará
    }
    
    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return posicion; }
    public double getSalario() { return salario; }
    

    public void setSalario(double salario) {
        if(salario < 0){
           System.out.println("El salario tiene que ser mayot a cero para el empleado: " + this.nombre + " Por defecto va ser 0");
        } else {
        this.salario = salario;      
        }
    }
    
    
    // Aumentar por porcentaje
    public boolean actualizarSalario(double porcentaje) {
        if (porcentaje < 0) {
            System.out.println("El porcentaje no puede ser negativo");
            return false;
        }
        this.salario += this.salario * (porcentaje / 100);
        return true;
    }

    // Aumentar por monto fijo
    public boolean actualizarSalarioMonto(double monto) {
        if (monto < 0) {
            System.out.println("El monto no puede ser negativo");
            return false;
        }
        this.salario += monto;
        return true;
    }
    

    public static int getTotalEmployee() {
        return totalEmpleado;
    }

    @Override
    public String toString() {
        return "employee{" + "id=" + id + ", name=" + nombre + ", position=" + posicion + ", salary=" + salario + '}';
    }
    
    
       
}
