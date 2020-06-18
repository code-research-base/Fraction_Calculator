package design;

import javax.swing.*;
import java.awt.*;

public class FractionOneInputs extends GUI {
    static void setFrac() {
        setFracTitle();
        setNumerator();
        setDenominator();
    }

    private static void setFracTitle() {
        JLabel fracOneTitle = new JLabel("Fraction 1");
        fracOneTitle.setBounds(40, 10, 70, 20);
        fracOneTitle.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(fracOneTitle);
    }

    private static void setNumerator() {
        setNumeratorLabel();
        setNumeratorTextField();
    }

    private static void setNumeratorLabel() {
        JLabel numeratorLabel = new JLabel("Numerator: ");
        numeratorLabel.setBounds(10, 40, 70, 20);
        panel.add(numeratorLabel);
    }

    private static void setNumeratorTextField() {
        numeratorTextField1.setBounds(100, 40, 40, 20);
        panel.add(numeratorTextField1);
    }

    private static void setDenominator() {
        setDenominatorLabel();
        setDenominatorTextField();
    }

    private static void setDenominatorLabel() {
        JLabel denominatorLabel = new JLabel("Denominator: ");
        denominatorLabel.setBounds(10, 60,80, 20);
        panel.add(denominatorLabel);
    }

    private static void setDenominatorTextField() {
        denominatorTextField1.setBounds(100, 60, 40, 20);
        panel.add(denominatorTextField1);
    }
}
