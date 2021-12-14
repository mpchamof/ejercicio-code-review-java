/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {
    
    public int suma(int num1, int num2) {
        //metodo para crear una suma
        //TODO: Se puede resolver la operacion en una sola linea, en el return num1 + num2
        int resul = 0;
        resul = num1 + num2;
        return resul;
    }

    public int resta(int num1, int num2) {
        //metodo para crear la resta
        //TODO: Se puede resolver la operacion en una sola linea, en el return num1 - num2
        int resul = 0;
        resul = num1 - num2;
        return resul;
    }

    public int multipli(int num1, int num2) {
        //metodo para crear la multiplicacion
        //TODO: Se puede resolver la operacion en una sola linea, en el return num1 * num2
        int resul = 0;
        resul = num1 * num2;
        return resul;
    }

    public double divi(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        //TODO: Se puede resolver la operacion en una sola linea, en el return num1 / num2
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
