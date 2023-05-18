package paquete04;

import java.util.Locale;
import java.util.Scanner;
import paquete02.Vendedor;
public class Principal {
    
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        double sMinino;
        int autos;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal;
        cadenaFinal = "";
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Ingrese el nombre del vendedor [%d]\n", i +1);
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();
            entrada.nextLine();
            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino, 
                    autos);
            v.calcularPagoMensual();
            cadenaFinal = String.format("%sDatos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n\n",
                    cadenaFinal,
                    v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());
        }
        
        System.out.printf("%s\n", cadenaFinal);
        
    }
}
