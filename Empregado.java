public class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private double salarioMensal;

    public Empregado(String primeiroNomeInicial, String ultimoNomeInicial, double salarioMensalInicial) {
        primeiroNome = primeiroNomeInicial;
        ultimoNome = ultimoNomeInicial;
        if(salarioMensalInicial > 0) {
            salarioMensal = salarioMensalInicial;
        } else {
            salarioMensal = 0;
        }
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        }   
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void bonusSalario() {
        this.salarioMensal = salarioMensal + salarioMensal * 0.1;
    }
}
