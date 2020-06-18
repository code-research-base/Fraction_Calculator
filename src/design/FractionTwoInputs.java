package design;

import javax.swing.*;
import java.awt.*;

public class FractionTwoInputs extends GUI {
    static void setFrac() {
        setFracTitle();
        setNumerator();
        setDenominator();
    }

    private static void setFracTitle() {
        JLabel fracTwoTitle = new JLabel("Fraction 2");
        fracTwoTitle.setBounds(180, 10, 70, 20);
        fracTwoTitle.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add( fracTwoTitle);
    }

    private static void setNumerator() {
        setNumeratorLabel();
        setNumeratorTextField();
    }

    private static void setNumeratorLabel() {
        JLabel numeratorLabel = new JLabel("Numerator: ");
        numeratorLabel.setBounds(150, 40, 70, 20);
        panel.add(numeratorLabel);
    }

    private static void setNumeratorTextField() {
        numeratorTextField2.setBounds(240, 40, 40, 20);
        panel.add(numeratorTextField2);
    }

    private static void setDenominator() {
        setDenominatorLabel();
        setDenominatorTextField();
    }

    private static void setDenominatorLabel() {
        JLabel denominatorLabel = new JLabel("Denominator: ");
        denominatorLabel.setBounds(150, 60,80, 20);
        panel.add(denominatorLabel);
    }

    private static void setDenominatorTextField() {
        denominatorTextField2.setBounds(240, 60, 40, 20);
        panel.add(denominatorTextField2);
    }
}
