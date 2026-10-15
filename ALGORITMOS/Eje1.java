// Diseñar un algoritmo que solicite al usuario la base y la altura de un rectángulo calcule su área y su perímetro, e imprima los resultados.

import javax.swing.JOptionPane;

public class Eje1 {
    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo:"));

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        JOptionPane.showMessageDialog(null,
                "El área del rectángulo es: " + area + "\nEl perímetro del rectángulo es: " + perimetro);

    }
}
