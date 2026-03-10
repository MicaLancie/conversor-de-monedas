import java.util.Scanner;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<RegistroHistorial> historial = new ArrayList<>();
        int opcion = 0;

        System.out.println("¡Bienvenido al Conversor de Monedas!");
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = teclado.nextLine();

        String menu = """
                ***************************************************
                Hola %s, elige una opción:
                1) Dolar -> Peso Argentino
                2) Peso Argentino -> Dolar
                3) Real Brasileño -> Dolar
                4) Dolar -> Real Brasileño
                5) Dolar -> Peso Colombiano
                6) Peso Colombiano -> Dolar
                7) Peso Chileno -> Dolar
                8) Dólar -> Peso Chileno
                9) Ver Historial de Conversiones
                10) Salir
                ***********************************************
                """.formatted(nombre);

        while (opcion != 10) {
            System.out.println(menu);

            try {
                opcion = teclado.nextInt();
                if (opcion == 10) break;

                if (opcion == 9) {
                    System.out.println("*** HISTORIAL DE " + nombre.toUpperCase() + "***");
                    if (historial.isEmpty()) {
                        System.out.println("Aún no has realizado conversiones.");
                    } else {
                        historial.forEach(System.out::println);
                    }
                    continue;
                }
                String detalle = "";

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el valor en Dolares:");
                        double valor1 = teclado.nextDouble();
                        ConsultaMoneda consulta1 = new ConsultaMoneda();
                        double resultado1 = consulta1.obtenerValorConvertido("USD", "ARS", valor1);
                        System.out.println("El valor " + valor1 + " [USD] corresponde al de -> " + resultado1 + " [ARS]");

                        //Detalle del historial
                        detalle = "Convirtió " + valor1 + " USD a " + resultado1 + " ARS";
                        historial.add(new RegistroHistorial(nombre, detalle));
                        break;

                    case 2:
                        System.out.println("Ingrese el valor en Pesos Argentinos:");
                        double valor2 = teclado.nextDouble();
                        ConsultaMoneda consulta2 = new ConsultaMoneda();
                        double resultado2 = consulta2.obtenerValorConvertido("ARS", "USD", valor2);
                        System.out.println("El valor " + valor2 + " [ARS] corresponde al de -> " + resultado2 + " [USD]");

                        detalle = "Convirtió " + valor2 + " ARS a " + resultado2 + " USD";
                        historial.add(new RegistroHistorial(nombre, detalle));
                        break;
                    case 3:
                        System.out.println("Ingrese el valor en Real Brasileño:");
                        double valor3 = teclado.nextDouble();
                        ConsultaMoneda consulta3 = new ConsultaMoneda();
                        double resultado3 = consulta3.obtenerValorConvertido("BRL", "USD", valor3);
                        System.out.println("El valor " + valor3 + " [BRL] corresponde al de -> " + resultado3 + " [USD]");

                        detalle = "Convirtió " + valor3 + " BRL a " + resultado3 + " USD";
                        historial.add(new RegistroHistorial(nombre, detalle));
                        break;
                    case 4:
                        System.out.println("Ingrese el valor en Dolar:");
                        double valor4 = teclado.nextDouble();
                        ConsultaMoneda consulta4 = new ConsultaMoneda();
                        double resultado4 = consulta4.obtenerValorConvertido("USD", "BRL", valor4);
                        System.out.println("El valor " + valor4 + " [USD] corresponde al de -> " + resultado4 + " [BRL]");

                        detalle = "Convirtió " + valor4 + " BRL a " + resultado4 + " USD";
                        historial.add(new RegistroHistorial(nombre, detalle));
                        break;
                    case 5:
                        System.out.println("Ingrese el valor en Dolares :");
                        double valor5 = teclado.nextDouble();
                        ConsultaMoneda consulta5 = new ConsultaMoneda();
                        double resultado5 = consulta5.obtenerValorConvertido("USD", "COP", valor5);
                        System.out.println("El valor " + valor5 + " [USD] corresponde al de -> " + resultado5 + " [COP]");

                        detalle = "Convirtió " + valor5 + " USD a " + resultado5 + "COP ";
                        historial.add(new RegistroHistorial(nombre, detalle));
                        break;
                    case 6:
                        System.out.println("Ingrese el valor en Pesos Colombianos:");
                        double valor6 = teclado.nextDouble();
                        ConsultaMoneda consulta6 = new ConsultaMoneda();
                        double resultado6 = consulta6.obtenerValorConvertido("COP", "USD", valor6);
                        System.out.println("El valor " + valor6 + " [COP] corresponde al de -> " + resultado6 + " [USD]");

                        detalle = "Convirtió " + valor6 + " COP  a " + resultado6 + "USD ";
                        historial.add(new RegistroHistorial(nombre, detalle));
                        break;

                    case 7:
                        System.out.println("Ingrese el valor en Pesos Chilenos:");
                        double valor7 = teclado.nextDouble();
                        ConsultaMoneda consulta7 = new ConsultaMoneda();
                        double resultado7 = consulta7.obtenerValorConvertido("CLP", "USD", valor7);
                        System.out.println("El valor " + valor7 + " [CLP] corresponde al de >>> " + resultado7 + " [USD]");

                        detalle = "Convirtió " + valor7 + " CLP a " + resultado7 + " USD";
                        historial.add(new RegistroHistorial(nombre, detalle));
                        break;

                    case 8:
                        System.out.println("Ingrese el valor en Dólares:");
                        double valor8 = teclado.nextDouble();
                        ConsultaMoneda consulta8 = new ConsultaMoneda();
                        double resultado8 = consulta8.obtenerValorConvertido("USD", "CLP", valor8);
                        System.out.println("El valor " + valor8 + " [USD] corresponde al de >>> " + resultado8 + " [CLP]");

                        detalle = "Convirtió " + valor8 + " USD a " + resultado8 + " CLP";
                        historial.add(new RegistroHistorial(nombre, detalle));
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } catch (Exception e) {
                System.out.println("Error: ¡Ingresa un dato válido!");
                teclado.nextLine(); // Para que no se trabe el bucle
            }
        }
        System.out.println("¡Chau " + nombre + "!");
    }
}
