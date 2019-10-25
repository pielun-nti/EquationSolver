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
        double x1;
        double x2;
        double b;
        double c;
        double amount = 0;
        equationorder = JOptionPane.showInputDialog("equationorder?");
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
            x1 = -b/-2 - java.lang.Math.sqrt(b*b/2*2 - c);
            x2 = -b/-2 + java.lang.Math.sqrt(b*b/2*2 - c);
            x = -b + java.lang.Math.sqrt(b*b -4*a*c / 2*a);
            JOptionPane.showMessageDialog(null, "x: " + x + "\nx: " + -x);
            /*if (x1 > 0) {
                JOptionPane.showMessageDialog(null, "x1: " + x1 + "\nx2: " + x2);
            } else if (x1 < 0) {
                JOptionPane.showMessageDialog(null, "x: " + x1 + "i");
            }*/
        } else
        {
            JOptionPane.showMessageDialog(null, "not ax + b");
        }
    }
}