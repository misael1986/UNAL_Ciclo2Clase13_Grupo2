/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2clase13_grupo2;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public double modulo(double num1, double num2) {
        if (num2 != 0) {
            return num1% num2;
        } else {
            return 0;
        }
    }

    public static void main() {

    }
}
