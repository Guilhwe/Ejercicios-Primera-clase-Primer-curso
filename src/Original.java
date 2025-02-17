public class Original {
    public static void main() {
        double precioOriginal = 100;
        double porcentajeDescuento = 10;
        System.out.println("El precio original es de "+ precioOriginal + "€");
        System.out.println("El precio descontado es de "+ (precioOriginal -((porcentajeDescuento /100) * precioOriginal))+ "€");
        
    }

}
