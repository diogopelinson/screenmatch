package br.com.alura.screenmatch.modelos;

public class ContaBancaria {
    private double saldoEmConta;

    public void depositar(int valordDeDeposito){
        if(valordDeDeposito <= 0){
            System.out.println("Não foi possivel realizar o deposito");
        }else{
            saldoEmConta -= valordDeDeposito;
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    public void sacar(int valorDeSaque){
        if(valorDeSaque > saldoEmConta){
            System.out.println("Não foi possivel");
        }
        else {
            saldoEmConta -= valorDeSaque;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public void consultarSaldo(){
        System.out.println("Valor da conta: "+saldoEmConta);
    }

}
