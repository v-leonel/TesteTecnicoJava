import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor total: ");
        double valorTotal = scan.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        int quantParcelas = scan.nextInt();

        double valorDesconto = descontoCompra(valorTotal, quantParcelas);

        if(quantParcelas <= 5){
            System.out.printf("Valor com desconto: %.2f", valorDesconto);
        }else {
            System.out.println("Sem desconto aplicável!");
        }
    }
    public static double descontoCompra(double valorTotal, int quantParcelas) {
        double porcentDesconto;

        switch (quantParcelas) {
            case 1:
                porcentDesconto = 0.10;
                break;
            case 2: porcentDesconto = 0.08;
                break;
            case 3: porcentDesconto = 0.06;
                break;
            case 4: porcentDesconto = 0.04;
                break;
            case 5: porcentDesconto = 0.02;
                break;
            default:
                porcentDesconto = 0.0;
                break;
        }

        double valorDesconto = valorTotal * porcentDesconto;
        double valorcomDesconto = valorTotal - valorDesconto;

        return valorcomDesconto;
    }

}
