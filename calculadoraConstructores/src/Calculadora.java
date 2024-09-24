import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese primer numero: ");
        int num1 = scanner.nextInt();
        System.out.printf("Ingrese segundo numero: ");
        int num2 = scanner.nextInt();
        Calculadora calculadora = new Calculadora(num1, num2);
        calculadora.sumar();
        calculadora.restar();
        calculadora.multiplicar();
        calculadora.dividir();

    }
    private int num1;
    private int num2;
    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }
    public int sumar(){
        int resultadoSuma = num1 + num2;
        System.out.println("La suma es: " + resultadoSuma);
        return resultadoSuma;
    }
    public int restar(){
        int resultadoResta = num1 - num2;
        System.out.println("La resta es: " + resultadoResta);
        return resultadoResta;
    }
    public int multiplicar(){
        int resultadoMultiplicacion = num1 * num2;
        System.out.println("La multiplicacion es: " + resultadoMultiplicacion);
        return resultadoMultiplicacion;
    }
    public int dividir(){
        int resultadoDivision = num1 / num2;
        System.out.println("La division es: " + resultadoDivision);
        return resultadoDivision;
    }

}

