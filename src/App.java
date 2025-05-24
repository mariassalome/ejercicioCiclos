import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de notas: CESDE");
        String usuario = "admin";
        String contrasena = "123";
        String tipo = ""; /* Estudiante o Profe */
        int intentos = 3;
        while (intentos > 0) {
            System.out.println("Ingrese su usuario: ");
            usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            contrasena = sc.nextLine();
            if (usuario.equals("admin") && contrasena.equals("123")) {
                System.out.println("Bienvenido al Sistema de notas CESDE");
                intentos = 0;
                System.out.println("Seleccione: \n1 - Profe\n2 - Estudiante");
                String opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                            System.out.println("Hola profe");
                        break;
                    case "2":
                            System.out.println("Hola estudiante");
                        break;
    
                }
            } else {
                System.out.println("Error de credenciales, intente nuevamente");
                intentos--;
                System.out.println("Tiene " + intentos + " mas");
            }
        }

    }
}
