// Leer números mayores o iguales a cero acumulando su suma y contando la cantidad delecturas. El ciclo finaliza cuando se ingresa un valor negativo. Al terminar, calcular y mostrar lasuma total y el promedio.

import javax.swing.JOptionPane;

public class Eje6 {
    public static void main(String[] args) {

        double sumaTotal = 0;
        int cantidadLecturas = 0;

        while (true) {
            double numero = Double.parseDouble(JOptionPane
                    .showInputDialog("Ingrese un número mayor o igual a cero (o un número negativo para finalizar):"));

            if (numero < 0) {
                break;
            }

            sumaTotal += numero;
            cantidadLecturas++;
        }

        if (cantidadLecturas > 0) {
            double promedio = sumaTotal / cantidadLecturas;
            JOptionPane.showMessageDialog(null, "La suma total es: " + sumaTotal + "\nEl promedio es: " + promedio);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números válidos.");
        }
    }
}