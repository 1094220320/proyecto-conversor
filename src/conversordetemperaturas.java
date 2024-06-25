import java.util.Scanner;
public class conversordetemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Conversor de Temperaturas");
            System.out.println("ingrese un numero no se admiten letras");
            System.out.println("1. Convertir de Celsius a Fahrenheit");
            System.out.println("2. Convertir de Celsius a kelvin");
            System.out.println("3. Convertir de Fahrenheit a Celsius");
            System.out.println("4. Convertir de Fahrenheit a kelvin");
            System.out.println("5. Convertir de Kelvin a Celsius");
            System.out.println("6. Convertir de Kelvin a Fahrenheit");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.print("Ingrese la temperatura en Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsius * 9/5 + 32;
                System.out.println(celsius + "°C son " + fahrenheit + "°F");
            } else if (opcion == 2) {
                System.out.print("Ingrese la temperatura en Celsius: ");
                double celsius = scanner.nextDouble();
                double kelvin = celsius + 273.15;
                System.out.println(celsius + "°C son " +kelvin + "°K");
            } else if (opcion == 3) {
                System.out.print("Ingrese la temperatura en Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5/9;
                System.out.println(fahrenheit + "°F son " + celsius + "°C");
            } else if (opcion == 4) {
                System.out.print("Ingrese la temperatura en Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double kelvin =  ((fahrenheit - 32) / 1.8) + 273.15;
                System.out.println(fahrenheit + "°F son " + kelvin + "°K");
            } else if (opcion == 5) {
                System.out.print("Ingrese la temperatura en kelvin: ");
                double kelvin = scanner.nextDouble();
                double celsius = kelvin - 273.15;
                System.out.println(kelvin + "°K son " + celsius + "°C");
            } else if (opcion == 6) {
                System.out.print("Ingrese la temperatura en kelvin: ");
                double kelvin = scanner.nextDouble();
                double fahrenheit = ((kelvin - 273.15) * 1.8) + 32;
                System.out.println(kelvin + "°K son " + fahrenheit + "°F");
            } else if (opcion == 7) {
                System.out.println("Gracias por usar el conversor de temperaturasq. ¡Nos vemos!");
                continuar = false;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}