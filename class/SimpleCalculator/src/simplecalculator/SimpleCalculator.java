
package simplecalculator;

import javax.swing.JFrame;

public class SimpleCalculator {

    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        form.setVisible(true);
        form.setTitle("Unique Calcultor");
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
