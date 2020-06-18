package design;

import javax.swing.*;

public class Buttons extends GUI {
    private static final String ADDITION = "ADDITION";
    private static final String SUBTRACTION = "SUBTRACTION";
    private static final String PRODUCT = "PRODUCT";
    private static final String DIVISION = "DIVISION";
    private static final String DECIMAL = "DECIMAL";
    private static final String CLEAR = "CLEAR";

    private static final Actions actionListener = new Actions();

    static void setButtons() {
        setAdditionButton();
        setSubtractionButton();
        setProductButton();
        setDivisionButton();
        setDecimalButton();
        setClearButton();
    }

    private static void setAdditionButton() {
        JButton additionButton = new JButton();
        additionButton.setText("+");
        additionButton.setBounds(20, 90, 41, 20);

        additionButton.setActionCommand(ADDITION);
        additionButton.addActionListener(actionListener);

        panel.add(additionButton);
    }

    private static void setSubtractionButton() {
        JButton subtractionButton = new JButton();
        subtractionButton.setText("-");
        subtractionButton.setBounds(90, 90, 40, 20);

        subtractionButton.setActionCommand(SUBTRACTION);
        subtractionButton.addActionListener(actionListener);

        panel.add(subtractionButton);

    }

    private static void setProductButton() {
        JButton productButton = new JButton();
        productButton.setText("*");
        productButton.setBounds(160, 90, 40, 20);

        productButton.setActionCommand(PRODUCT);
        productButton.addActionListener(actionListener);

        panel.add(productButton);
    }

    private static void setDivisionButton() {
        JButton divisionButton = new JButton();
        divisionButton.setText("/");
        divisionButton.setBounds(230, 90, 40, 20);

        divisionButton.setActionCommand(DIVISION);
        divisionButton.addActionListener(actionListener);

        panel.add(divisionButton);
    }

    private static void setDecimalButton() {
        JButton decimalButton = new JButton();
        decimalButton.setText("Decimal");
        decimalButton.setBounds(30, 180, 100, 30);

        decimalButton.setActionCommand(DECIMAL);
        decimalButton.addActionListener(actionListener);

        panel.add(decimalButton);
    }

    private static void setClearButton() {
        JButton decimalButton = new JButton();
        decimalButton.setText("Clear");
        decimalButton.setBounds(170, 180, 100, 30);

        decimalButton.setActionCommand(CLEAR);
        decimalButton.addActionListener(actionListener);

        panel.add(decimalButton);
    }
}
