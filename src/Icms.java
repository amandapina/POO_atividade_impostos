public class Icms {
    double alq_icms = 0.17; //aliquota de 17%

    public double calculaImposto(Operacao conta)
    {
        if(conta.getTipo().equals("servico") || conta.getTipo().equals("produto") )  //icms se aplica a produto ou serviço
        {
            return conta.getValor() * alq_icms;
        }
        else {
            return 0;
        }
    }
}
