package TemplateMethod;

public class Bitrem extends Caminhao{

    public String verificacao() {
        if (this.calcularPesoTotal() <= 60) {
            return "Peso permitido para viagem";
        }
        else {
            return "Peso acima do permitido!";
        }
    }

    @Override
    public String getTipo() {
        return "Caminhão Bitrem ";
    }
}
