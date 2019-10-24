/*
Exercise in java.
Created 2019-10-18
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class EquationSolver {
    public static void main(String[] args) {
        String equationorder;
        double a;
        double x;
        double b;
        double c;
        double amount = 0;
        a = Double.parseDouble(JOptionPane.showInputDialog("a?"));
        b = Double.parseDouble(JOptionPane.showInputDialog("b?"));
        equationorder = "ax^2 + b + c = 0";
        if (equationorder == "ax + b = 0") {
            x = 0 - b;
            x = x / a;
            x = x;
            JOptionPane.showMessageDialog(null, x);
        } else if (equationorder == "ax^2 + b + c = 0") {
            c = Double.parseDouble(JOptionPane.showInputDialog("c?"));

        } else
        {
            JOptionPane.showMessageDialog(null, "not ax + b");
        }
/*/        while(k <= n) {
            amount = amount + k;
            k = k + 1;
        } /*/
    }
}