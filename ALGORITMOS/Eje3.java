// Leer un número entero y determinar mediante estructuras condicionales anidadas si el número es par o impar, y simultáneamente si es positivo, negativo o cero.

import javax.swing.JOptionPane;

public class Eje3 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));

        if (numero > 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El  número es positivo y par.");
            } else {
                JOptionPane.showMessageDialog(null, "El número es positivo e impar.");
            }
        } else {
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El  número es negativo.");
            } else {
                JOptionPane.showMessageDialog(null, "El número es cero.");
            }
        }

    }
}
