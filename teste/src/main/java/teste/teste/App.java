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
    }
    
    public static int subtraction(int a, int b) {
    	return a - b;
    }
    
    public static int power(int a, int b){
    	if( b == 1 ) return a;
    	else return a * power(a, b-1);
    }
}
