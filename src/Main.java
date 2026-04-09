import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistema de Registro ---");
        System.out.println("1. Registrar Pasajero");
        System.out.println("2. Registrar Chofer");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        // Datos comunes (Atributos de la clase abstracta Usuario)
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        // Según el diagrama, todo Usuario TIENE una Billetera (Composición)
        Billetera nuevaBilletera = new Billetera(1001, 0.0);

        Usuario usuario = null; // Declaramos la variable de la clase padre

        if (opcion == 1) {
            // Instanciamos como Pasajero
            usuario = new Pasajero(1, nombre, email, pass, nuevaBilletera);
            System.out.println("¡Pasajero creado con éxito!");

        } else if (opcion == 2) {
            // 1. Datos específicos del Chofer
            System.out.print("Número de Licencia: ");
            String licencia = sc.nextLine();

            // Instanciamos como Chofer (Usuario padre y Billetera ya definidos arriba)
            usuario = new Chofer(2, nombre, email, pass, nuevaBilletera, licencia);

            // 2. Ingreso de datos del Vehículo
            System.out.println("\n--- Registro de Vehículo ---");
            System.out.print("Patente: ");
            String patente = sc.nextLine();
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            // Captura de fecha VTV
            System.out.print("Fecha vencimiento VTV (dd/mm/aaaa): ");
            String fechaStr = sc.nextLine();
            java.util.Date fechaVTV = null;

            try {
                fechaVTV = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(fechaStr);
            } catch (java.text.ParseException e) {
                System.out.println("Formato de fecha inválido. Se asignará la fecha actual por defecto.");
                fechaVTV = new java.util.Date();
            }

            // 3. Creación del objeto Vehiculo con los datos ingresados
            // Usamos el constructor que creamos anteriormente
            Vehiculo auto = new Vehiculo(patente, fechaVTV, marca, modelo);

            // 4. Vinculación del vehículo al chofer
            // El método aniadirVehiculo internamente debería validar el auto antes de asignarlo
            ((Chofer) usuario).aniadirVehiculo(auto);

            System.out.println("\n¡Chofer y Vehículo registrados con éxito!");
        }

        // Ejecutamos el método del diagrama
        if (usuario != null) {
            usuario.registrarUsuario();
        }
    }
}
