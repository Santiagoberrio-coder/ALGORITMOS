//   presentar un menu con 4 operaciones aritmeticas Leer dos números y
// suma , resta , multiplicacion, divicion 
//   ejecutar la opción seleccionada validando la división por cero.

import javax.swing.JOptionPane;

public class Eje4 {
    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        String menu = "Seleccione una operación:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

        double resultado;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }
}