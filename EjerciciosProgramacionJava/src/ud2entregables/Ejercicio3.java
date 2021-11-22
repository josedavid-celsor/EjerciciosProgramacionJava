package ud2entregables;
import java.util.Scanner;
import java.lang.Math;
/**
 *En una tienda online tienen una oferta en la que al comprar 5 productos
se obtiene un descuento del 21%. Los precios están indicados sin IVA por
lo   que   tras   el   descuento   hay   que   aplicar   el   IVA   (21%).   Escribe   un
programa que pida al usuario el precio de 5 productos y luego muestre:
1. La suma total de los productos introducidos.
2. El valor en € del descuento a aplicar.
3. La suma total de los productos tras el descuento.
4. El valor en € del IVA a aplicar.
5. El precio total final tras aplicar el IVA.
 * @author a027356383e
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        double a; double b; double c; double d; double e;
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba el precio del producto ");
          a= lector.nextInt();
        System.out.print("Escriba el precio del segundo producto ");
          b= lector.nextInt();  
        System.out.print("Escriba el precio del tercer producto ");
          c= lector.nextInt(); 
        System.out.print("Escriba el precio del cuarto producto ");
          d= lector.nextInt();   
        System.out.print("Escriba el precio del quinto producto ");
          e= lector.nextInt();  
            double total= a + b + c + d + e;
        System.out.println("El precio total de los productos es de " + total);
            double des = total * 0.21;
        System.out.println("El descuento a aplicar es igual a "+ des + "€");
            double sum = total - des;
        System.out.println("El precio con el descuento es igual a "+ sum + "€");
            double iva = sum * 0.21;
        System.out.println("El IVA a aplicar sera de "+ iva + "€");
            double todo= sum - iva;
        System.out.println("El precio final es igual a " + todo + "€");  
        
    }
    
}
