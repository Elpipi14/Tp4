/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author andres.piuzzi
 */
public class Root {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Andres", "Programador", -10);
        Empleado e2 = new Empleado("Martin", "Tester",3000);
        Empleado e3 = new Empleado("Romina", "Coach", 2000);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println();
        
        
        System.out.println("Empleado: " + e1.getNombre());
        System.out.println("Empleado: " + e2.getNombre() + ", Posicion: " + e2.getPuesto());
        System.out.println("Empleado: " + e3.getNombre());
        


        
        // Aumentar salario de e1 en 10% (porcentaje)
        e2.actualizarSalario(10);

        // Aumentar salario de e2 en 500 (monto fijo)
        e3.actualizarSalarioMonto(500);

        // Mostrar despues de aumentos
        System.out.println("\nDespues del aumento:");
        System.out.println(e2);
        System.out.println(e3);    
        System.out.println();
        
        System.out.println("Total empleados creados: " + Empleado.getTotalEmployee());

    }
    
}
