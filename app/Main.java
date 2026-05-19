package app;

/**
 * Clase principal que actúa como punto de entrada.
 * Sigue el principio de responsabilidad única.
 */
public class Main {
    public static void main(String[] args) {
        // Delegamos toda la ejecución al gestor del menú
        MenuHandler menu = new MenuHandler();
        menu.iniciar();
    }
}