
public class Main {
    public static void main(String[] args) {

        //nesse caso, não usaremos uma interface
        //estamos testando com um produto de 1000
        Operacao conta = new Operacao("produto", 50);


        Iss iss = new Iss();
        Ipi ipi = new Ipi();
        Icms icms = new Icms();

        double valorIss = iss.calculaImposto(conta);
        double valorIpi = ipi.calculaImposto(conta);
        double valorIcms = icms.calculaImposto(conta);

        System.out.println("Operação:");
        System.out.println("Valor do item: R$" + conta.getValor());
        System.out.println("Valor do ISS: R$" + valorIss);
        System.out.println("Valor do IPI: R$" + valorIpi);
        System.out.println("Valor do ICMS: R$" + valorIcms);

        double total =  valorIss + valorIpi + valorIcms; //total de impostos e taxas
        System.out.println("Valor total de taxas: R$" + total);

        //agora, vamos testar com um serviço de 500:
        Operacao conta2 = new Operacao("servico", 500);


        Iss iss2 = new Iss();
        Ipi ipi2 = new Ipi();
        Icms icms2 = new Icms();

        double valorIss2 = iss.calculaImposto(conta2);
        double valorIpi2 = ipi.calculaImposto(conta2);
        double valorIcms2 = icms.calculaImposto(conta2);

        System.out.println("Operação:");
        System.out.println("Valor do item: R$" + conta2.getValor());
        System.out.println("Valor do ISS: R$" + valorIss2);
        System.out.println("Valor do IPI: R$" + valorIpi2);
        System.out.println("Valor do ICMS: R$" + valorIcms2);

        double total2 =  valorIss + valorIpi + valorIcms;
        System.out.println("Valor total de taxas: R$" + total2);

    }
}