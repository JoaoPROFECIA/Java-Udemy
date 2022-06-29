/* 
    The %d is for integers, 
    The %f is for floating point numbers, 
    The %s is for strings,
    The %n is for newline.
    The %c is for characters.
    The %b is for booleans.
    The %e is for exponential notation.
    The %x is for hexadecimal notation.
    The %o is for octal notation.
    The %t is for a tab.
    The %%% is for a percent sign.
*/

import java.util.Locale;

public class Main {
    public static void main(String[] args) {      
        String nome = "João";
        int idade = 22;
        double renda = 4000.00;
        System.out.print("Olá, mundo!");
        System.out.println("Bom dia!");
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);  
        int y;
        double z;
        y = 5;
        z = 2 * y;
        System.out.println(y);
        System.out.println(z);

        double a;
        int b;
        a = 5.0;
        b = (int)a;
        System.out.println(b);
    }
}