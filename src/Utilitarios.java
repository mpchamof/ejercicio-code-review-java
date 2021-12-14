//TODO Se puede hacer uso de Interfaces para poder calcular el area, en su implentacion se puede calcular para un circulo o triangulo
public class Utilitarios {
    //TODO Se puede simplificar el calculo del promedio con java8 list.stream().average()
    public int average(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }
    //TODO con Java 8 se puede simplificar el calculo del factorial int number = 5; IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y)
    public double factorial(int numero) {
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }
    // TODO Hacer uso de interfaces
    public double areaCirculo(double r) {
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    // TODO Hacer uso de interfaces
    public double areaTriangulo(double b, double h) {
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    //TODO El porcentaje del IVA no debe estar quemado en el codigo, se puede simplificar el código de igual manera
    public double calculoIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
