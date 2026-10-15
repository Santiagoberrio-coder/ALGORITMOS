// Solicitar un número entero N y generar su tabla de multiplicar del 1 al 10 utilizando un ciclo fijo Al finalizar, mostrar cuántos de los resultados obtenidos son números pares.

import javax.swing.JOptionPane;

public class Eje5 {
    public static void main(String[] args) {

        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));
        int contadorPares = 0;

        StringBuilder tablaMultiplicar = new StringBuilder("Tabla de multiplicar del " + N + ":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = N * i;
            tablaMultiplicar.append(N).append(" x ").append(i).append(" = ").append(resultado).append("\n");

            if (resultado % 2 == 0) {
                contadorPares++;
            }
        }

        tablaMultiplicar.append("\nCantidad de resultados pares: ").append(contadorPares);

        JOptionPane.showMessageDialog(null, tablaMultiplicar.toString());
    }
}