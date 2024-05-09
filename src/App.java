import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
        Scanner introducir = new Scanner (System.in);
        System.out.println("bienvenido a su lista de compra que tan grande va hacer su lista?");
        int numProducto = introducir.nextInt();
        introducir.nextLine(); 
        String[] Producto = new String[numProducto];
        for (int i = 0; i < numProducto; i++){
            System.out.println("Ingrese el nombre del producto "+(i+1)+": ");
            Producto[i] = introducir.nextLine();
        }
        System.out.println("esta es su lista");
        imprimirInventario(Producto, 0);

        System.out.println("que producto quiere encontrar?");
        String Encontrar = introducir.nextLine();

        int indice = linearSearch(Producto, Encontrar); // Realizar la búsqueda del producto
        if (indice != -1) {
            System.out.println("El producto '" + Encontrar + "' se encuentra en la posición " + indice);
        } else {
            System.out.println("El producto '" + Encontrar + "' no se encuentra en la lista");
        }
        introducir.close();

    }
    public static void imprimirInventario (String[] Productos, int productoIndex) {
        if (productoIndex >= Productos.length) {
            return;
        }

        System.out.println(Productos[productoIndex]);
        imprimirInventario(Productos, productoIndex + 1);    
    }

    public static int linearSearch(String[] Producto, String Encontrar) {
       
        for (int i = 0; i < Producto.length; i++) {
            
            if (Producto[i].equals(Encontrar)) {
                
                return i;
            }
        }
        
        return -1;
    }

}

