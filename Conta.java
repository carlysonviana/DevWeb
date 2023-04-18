public class Conta {
    private String nome;
    private double saldo;

    public Conta (String nomeInicial, double saldoInicial) {
        nome = nomeInicial;
        if (saldo > 0){
            saldo = saldoInicial;
        } else {
            saldo = 0;
        }
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo = saldo + valorDeposito;
        }
    }
}