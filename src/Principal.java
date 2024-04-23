import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        BuscadorMoneda busqueda = new BuscadorMoneda();
        System.out.println("Ingresa el código de la moneda que deseas convertir: ");    
        
        var tipoMoneda = lectura.next();
        Moneda codigoMoneda = busqueda.ingresoUsuario(tipoMoneda);
        System.out.println(codigoMoneda);

        lectura.close();

    }
}