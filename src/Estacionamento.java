import java.util.ArrayList;

public class Estacionamento {
    private String nome;
    private Integer capacidade;
    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Estacionamento(String n, Integer c) {
        this.nome = n;
        this.capacidade = c;
    }

    public Estacionamento(String n, Integer c, ArrayList<Veiculo> vs) {
        this.nome = n;
        this.capacidade = c;
        this.veiculos = vs;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public Integer getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(Integer c) {
        this.capacidade = c;
    }

    public Boolean entrarVeiculo(Veiculo veiculo) {
        if (capacidade == this.veiculos.size()) return false;
        for (Veiculo v : this.veiculos) {
            if (v.getPlaca().equals(veiculo.getPlaca())) {
                return false;
            }
        }
        this.veiculos.add(veiculo);
        return true;
    }

    public Boolean sairVeiculo(String placa) {
        return this.veiculos.removeIf(veiculo -> veiculo.getPlaca().equals(placa));
    }

    public void listarVeiculos() {
        System.out.println("======================== Lista Veículos ========================");
        for (Veiculo v : this.veiculos) {
            v.exibirDados();
        }
        System.out.println("======================= Fim da Listagem =======================");
    }

    public float calcularFaturamentoEstimado(int horas) {
        float total = 0;
        for (Veiculo veiculo : this.veiculos) {
            total += veiculo.getValorHora();
        }
        return total * horas;
    }
}