// Diseñar e implementar una clase CuentaBancaria que aplique encapsulamiento (atributosprivados titular y saldo), constructor para inicializar valores, y métodos públicos depositar, retirar(validando fondos suficientes) y consultarSaldo. Crear una clase ejecutable con el método main queinstancie un objeto y pruebe las operaciones.    

import javax.swing.JOptionPane;

public class Eje7 {
    public static void main(String[] args) {
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular de la cuenta:");
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial de la cuenta:"));

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);

        while (true) {
            String menu = "Seleccione una operación:\n" +
                    "1. Consultar saldo\n" +
                    "2. Depositar dinero\n" +
                    "3. Retirar dinero\n" +
                    "4. Salir";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "El saldo actual es: " + cuenta.consultarSaldo());
                    break;
                case 2:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                    cuenta.depositar(deposito);
                    JOptionPane.showMessageDialog(null, "Depósito realizado. Nuevo saldo: " + cuenta.consultarSaldo());
                    break;
                case 3:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                    if (cuenta.retirar(retiro)) {
                        JOptionPane.showMessageDialog(null,
                                "Retiro realizado. Nuevo saldo: " + cuenta.consultarSaldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "Fondos insuficientes para realizar el retiro.");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema bancario.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}