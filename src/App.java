import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Estacionamento estacionamento = new Estacionamento("Seu João Parking Lot", 2);
        Scanner sn = new Scanner(System.in);

        while (true) {
            Integer escolha = null;
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1- Cadastrar Veículo");
            System.out.println("2- Sair Veículo");
            System.out.println("3- Lista Veículos");
            System.out.println("4- Calcular Faturamento");
            System.out.println("5- Sair");
            escolha = sn.nextInt();
            sn.nextLine();

            System.out.println();

            if (escolha == 1) {
                System.out.print("Placa: ");
                String placa = sn.nextLine();

                System.out.print("\nModelo: ");
                String modelo = sn.nextLine();

                System.out.print("\nValor por hora: ");
                float valorHora = sn.nextFloat();
                sn.nextLine();

                Veiculo veiculoNovo = new Veiculo(placa, modelo, valorHora);
                boolean sucesso = estacionamento.entrarVeiculo(veiculoNovo);
                if (sucesso) {
                    System.out.println("\nVeículo cadastrado com sucesso!");
                } else {
                    System.out.println("\nFalha: Estacionamento lotado ou placa já existe.");
                }

            } else if (escolha == 2) {
                System.out.print("Placa: ");
                String placa = sn.nextLine();
                boolean sucesso = estacionamento.sairVeiculo(placa);
                if (sucesso) {
                    System.out.println("\nVeículo removido com sucesso!");
                } else {
                    System.out.println("\nFalha: Veículo não encontrado.");
                }
            } else if (escolha == 3) {
                estacionamento.listarVeiculos();
            } else if (escolha == 4) {
                System.out.print("Quantas horas: ");
                int horas = sn.nextInt();
                float valor = estacionamento.calcularFaturamentoEstimado(horas);
                System.out.println("Valor estimado: " + valor);
            } else {
                System.out.print("\nSaindo");
                System.out.print(".");
                System.out.print(".");
                System.out.print(".");
                break;
            }
        }
        sn.close();
    }
}
