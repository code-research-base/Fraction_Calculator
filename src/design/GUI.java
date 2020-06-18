package design;

import design.exceptions.AlreadyFloatException;
import logic.Fraction;

import javax.swing.*;
import java.awt.*;

import static design.Buttons.setButtons;

public class GUI {
    private static final JFrame frame = new JFrame();
    protected static final JPanel panel = new JPanel();
    static final JLabel result = new JLabel("Result: ");

    protected static final JTextField numeratorTextField1 = new JTextField();
    protected static final JTextField denominatorTextField1 = new JTextField();
    protected static final JTextField numeratorTextField2 = new JTextField();
    protected static final JTextField denominatorTextField2 = new JTextField();

    public static void setGUI() {
        frame.add(panel);
        panel.setLayout(null);

        setFractionsInputs();
        setButtons();
        setResultLabel();

        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void setFractionsInputs() {
        FractionOneInputs.setFrac();
        FractionTwoInputs.setFrac();
    }

    private static void setResultLabel() {
        result.setFont(new Font("Arial", Font.BOLD, 20));
        result.setBounds(50, 130, 200, 50);
        panel.add(result);
    }

    static Fraction[] getFractions() {
        double numerator1 = Integer.parseInt(numeratorTextField1.getText());
        double denominator1 = Integer.parseInt(denominatorTextField1.getText());
        double numerator2 = Integer.parseInt(numeratorTextField2.getText());
        double denominator2 = Integer.parseInt(denominatorTextField2.getText());

        return new Fraction[]{ new Fraction(numerator1, denominator1), new Fraction(numerator2, denominator2)};
    }

    static boolean areTextFieldsEmpty() {
        return numeratorTextField1.getText().equals("") || denominatorTextField1.getText().equals("")
                || numeratorTextField2.getText().equals("") || denominatorTextField2.getText().equals("");
    }

    static void emptyTextLabels() {
        numeratorTextField1.setText("");
        denominatorTextField1.setText("");
        numeratorTextField2.setText("");
        denominatorTextField2.setText("");
    }

    static void emptyResultLabel() {
        result.setText("Result: ");
    }

    static void setResult(Fraction resultFraction) {
        result.setText("Result: " + resultFraction.getNumerator() +
                (resultFraction.getDenominator() == 1 ? "": "/" + resultFraction.getDenominator()));

    }

    static void getDecimal() throws AlreadyFloatException {
        final int NUMERATOR = 0;
        final int DENOMINATOR = 1;
        double[] resultFraction = getResultFraction();
        result.setText("Result: " + new Fraction(resultFraction[NUMERATOR], resultFraction[DENOMINATOR]).getDecimal());
    }

    private static double[] getResultFraction() throws AlreadyFloatException {
        final int NUMERATOR = 0;
        final int DENOMINATOR = 1;
        String[] fractionString;

        if (result.getText().contains("/"))
            fractionString = result.getText().substring(7).split("/");
        else
            throw new AlreadyFloatException("Cannot convert because it's already a decimal number!");

        return new double[] {
               Double.parseDouble(fractionString[NUMERATOR]),
               Double.parseDouble(fractionString[DENOMINATOR])
        };
    }
}
