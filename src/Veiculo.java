public class Veiculo {
    private String placa;
    private String modelo;
    private float valorHora;

    public Veiculo() {}

    public Veiculo (String p, String m, float vh) {
        this.setPlaca(p);
        this.setModelo(m);
        this.setValorHora(vh);
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(float vh) {
        this.valorHora = vh;
    }

    @Override
    public String toString() {
        return "Placa: " + this.placa + " | " + "Modelo: " + this.modelo + " | " + "Valor Hora: "  + this.valorHora;
    }

    public void exibirDados() {
        System.out.println(this.toString());
    }
}