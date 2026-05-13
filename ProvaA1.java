import java.util.Scanner;

public class ProvaA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de paginas lidas:");
        double paginas = sc.nextDouble();

        System.out.println("Digite o tempo gasto na leitura:");
        double tempo = sc.nextDouble();

        double media = tempo / paginas;

            System.out.println("A media é:" + media);


        if ( media >= 4){
            System.out.println("Leitura Profunda");
        }else if (tempo == 0) {
            System.out.println("Dados insuficientes para analise da leitura");
        }  
        
        else{
            System.out.println("Leitura superficial");
        }
        sc.close();
    }
}
