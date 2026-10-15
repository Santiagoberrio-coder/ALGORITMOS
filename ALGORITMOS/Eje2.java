// Solicitar la temperatura en grados Celsius y convertirla a grados Fahrenheit utilizando la fórmula correcta. Utilizar constantes explicativas.

import javax.swing.JOptionPane;

public class Eje2 {
    public static void main(String[] args) {

        final double FACTOR_CONVERSION = 1.8;
        final double OFFSET_CONVERSION = 32;

        double Celcius = Double
                .parseDouble(JOptionPane.showInputDialog(null, "ingrese la temperatura en grados celcius"));

        double Fahrenheit = (Celcius * 1.8) + 32;

        JOptionPane.showMessageDialog(null, "°C equivalen a : " + Fahrenheit + "°F");
    }
}