package ud2ejercicioscondicionales;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 *Escribe un programa que pida el precio de 3 artículos (sin IVA) y el % de IVA a
aplicar. Luego mostrará por pantalla el precio total (sin IVA), el valor del IVA y el
precio con IVA. Téngase en cuenta que si el total (sin IVA) es superior a 50€ se
aplicará un descuento del 5% (en tal caso, mostrarlo también por pantalla).
 */
public class Ejer22 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);    
        double a;
        System.out.println("Escriba el precio de un artículo sin IVA ");  
        a = lector.nextInt();
        
        double b;
        System.out.println("Escriba el precio de otro artículo sin IVA ");  
        b = lector.nextDouble();
        
        double c;
        System.out.println("Escriba el precio de otro artículo sin IVA ");  
        c = lector.nextDouble();
        
        double iv;
        System.out.println("Escriba el IVA a aplicar ");  
        iv = lector.nextDouble();
        
        double pre = a + b + c;
        double total; 
        double i;
        double iva = iv / 100.0;
        if (pre > 50){
            
            double des = pre -(0.05 * pre);
            total = pre + iva * pre;
            i = iva * des;
            System.out.println("Se le aplicara un descuento del 5% por tener una factura mayor a 50€");
            System.out.println("El valor sin IVA y con descuento aplicado es de " + des);
                    }
        else {
           i = iva * pre;
           total = pre + iva * pre;
            System.out.println("El valor de la suma es igual a " + pre);
           
        }
        System.out.println("El IVA es " + i);
        System.out.println("El precio total con IVA es de " + total);
    }
}
