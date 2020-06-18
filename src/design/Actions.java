package design;

import design.exceptions.AlreadyFloatException;
import design.exceptions.IllegalButtonUseException;
import logic.Fraction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static design.GUI.*;

public class Actions implements ActionListener {
    private static final int FIRST_FRACTION = 0;
    private static final int SECOND_FRACTION = 1;

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
                actionSelector(e);
        } catch (IllegalButtonUseException exception) {
            JOptionPane.showMessageDialog(null, "There's an empty text box!",
                    "WARNING", JOptionPane.WARNING_MESSAGE);
        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, "Invalid Input!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            emptyTextLabels();
        }
    }

    private static void actionSelector(ActionEvent e) throws IllegalButtonUseException {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "ADDITION" -> actionAddition();
            case "SUBTRACTION" -> actionSubtraction();
            case "PRODUCT" -> actionProduct();
            case "DIVISION" -> actionDivision();
            case "DECIMAL" -> actionDecimal();
            case "CLEAR" -> actionClear();
        }
    }

    private static void actionAddition() throws IllegalButtonUseException {
        if (areTextFieldsEmpty())
            throw new IllegalButtonUseException("There's an empty box!");
        Fraction fraction = getFractions()[FIRST_FRACTION];
        Fraction resultFraction = fraction.addition(getFractions()[SECOND_FRACTION]);
        setResult(resultFraction);
    }

    private static void actionSubtraction() throws IllegalButtonUseException {
        if (areTextFieldsEmpty())
            throw new IllegalButtonUseException("There's an empty box!");
        Fraction fraction = getFractions()[FIRST_FRACTION];
        Fraction resultFraction = fraction.subtraction(getFractions()[SECOND_FRACTION]);
        setResult(resultFraction);

    }

    private static void actionProduct() throws IllegalButtonUseException {
        if (areTextFieldsEmpty())
            throw new IllegalButtonUseException("There's an empty box!");
        Fraction fraction = getFractions()[FIRST_FRACTION];
        Fraction resultFraction = fraction.product(getFractions()[SECOND_FRACTION]);
        setResult(resultFraction);

    }

    private static void actionDivision() throws IllegalButtonUseException {
        if (areTextFieldsEmpty())
            throw new IllegalButtonUseException("There's an empty box!");
        Fraction fraction = getFractions()[FIRST_FRACTION];
        Fraction resultFraction = fraction.division(getFractions()[SECOND_FRACTION]);
        setResult(resultFraction);
    }

    private static void actionDecimal() {
        try {
            getDecimal();
        } catch (AlreadyFloatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void actionClear() {
        emptyTextLabels();
        emptyResultLabel();
    }
}
