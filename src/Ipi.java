public class Ipi {
    double alq_ipi = 0.25; //aliquota de 25%

    public double calculaImposto(Operacao conta)
    {
        if(conta.getTipo().equals("produto"))  //ipi apenas aplica a produto
        {
            return conta.getValor() * alq_ipi;
        }
        else {
            return 0;
        }
    }
}
