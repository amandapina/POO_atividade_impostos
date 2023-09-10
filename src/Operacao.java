public class Operacao {
    String tipo; //tipo da operacao, pode ser de produto ou de serviço
    double valor;

    public Operacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}



