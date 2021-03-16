package main.java.teste.teste;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("dividir");
    }
   public static int dividir(int a, int b) {
	   return (a/b);
	   
   }
    
    public static int multiplication(int a, int b) {
    	return a * b;
    }
    
    public static int danielLindo(int rei, int delas) {
    	return rei + delas;
    }
    

    public static int somar(int a, int b) {
    	return a+b;
    }
    public static int sum(int a, int b) {
    	return a + b;

    }
    
    public static int power(int a, int b){
    	if( b == 1 ) return a;
    	else return a * power(a, b-1);
    }
}
