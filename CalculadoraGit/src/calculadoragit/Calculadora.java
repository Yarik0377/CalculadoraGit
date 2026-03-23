package calculadoragit;

// Version 1.0.0
public class Calculadora {
	//Metodo para sumar dos numeros
    public int sumar(int a, int b) {
        return a + b;
    }
  //Metodo para restar dos numeros
    public int restar(int a, int b) {
        return a - b;
    }
    //Metodo para multiplicar dos numeros
    public int multiplicar(int a, int b) {
        return a * b; 
    }
  //Metodo para dividir dos numeros
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return (double) a / b;
    }
}
