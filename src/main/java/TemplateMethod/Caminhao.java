package TemplateMethod;

public abstract class Caminhao {
    private String marca;
    private float pesoCaminhao;
    private float pesoCarga;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPesoCaminhao() {
        return pesoCaminhao;
    }

    public void setPesoCaminhao(float pesoCaminhao) {
        this.pesoCaminhao = pesoCaminhao;
    }

    public float getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public float calcularPesoTotal() {
        return (this.pesoCarga + this.pesoCaminhao);
    }

    public abstract String verificacao();

    public String getTipo() {
        return "Caminhao";
    }

    public String getInformacoes() {
        return getTipo() +
                "{" + "marca='" + this.marca + '\'' + ", " +
                "resultado=" + this.verificacao() + "}";
    }

}
