/*
Exercise in java.
Created 2019-10-18
Programmer Pierre Lundström
*/
import java.util.*;
import javax.swing.*;

public class FourthGradePolynom {
      public static void main(String[] args) {
        int polynom = a*x*x*x*x + b*x*x*x + c*x*x + d*x + e;
        int deriveradpolynom = 4* a*x*x*x + 3*b*x*x + 2*c*x + d;
        double equation;
        double x0 = 15;
        double y0 = 10;
        double x1;
        double x2;
        double x3;
        double x4;
        double a;
        double b;
        double c;
        double d;
        double e;
        a = Double.parseDouble(JOptionPane.showInputDialog("a?"));
        b = Double.parseDouble(JOptionPane.showInputDialog("b?"));
        c = Double.parseDouble(JOptionPane.showInputDialog("c?"));
        d = Double.parseDouble(JOptionPane.showInputDialog("d?"));
        e = Double.parseDouble(JOptionPane.showInputDialog("e?"));
        y0 = 15;
        x1 = y0 / x0;
        x2 = x1 - x1 / deriveradpolynom;
    }
}