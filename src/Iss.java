public class Iss {
    double alq_iss = 0.046; //aliquota de 4,6%

    public double calculaImposto(Operacao conta)
    {
        if(conta.getTipo().equals("servico"))  //iss apenas aplica a serviço
        {
            return conta.getValor() * alq_iss;
        }
        else {
            return 0;
        }
    }
}
