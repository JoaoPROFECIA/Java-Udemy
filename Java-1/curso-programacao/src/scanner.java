import java.util.Locale;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite sua renda: ");
        double renda = sc.nextDouble();
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
        sc.close();
    }
}

public class scanner2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Você digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }
}
