public class Data {
    private int ano;
    private int mes;
    private int dia;

    public Data(int anoInicial, int mesInicial, int diaInicial) {
        if(anoInicial >= 0) {
            this.ano = anoInicial;
        } else {
            this.ano = 1;
        }

        if(mesInicial > 0 && mesInicial <= 12) {
            this.mes = mesInicial;
        } else {
            this.mes = 1;
        }

        if(diaInicial > 0 && diaInicial < 32) {
            if(mesInicial != 2) { // caso não seja fevereiro
                if(mesInicial < 8 && (mesInicial % 2 == 1)) {
                    this.dia = diaInicial;
                } else if(mesInicial >= 8 && (mesInicial % 2 == 0)) {
                    this.dia = diaInicial;
                } else {
                    this.dia = 1;
                }
            } else {
                if ((anoInicial % 4 == 0) && (anoInicial % 100 != 0 || anoInicial % 400 == 0)) { // se ano bissexto
                    if (diaInicial <= 29) {
                        this.dia = diaInicial;
                    } else {
                        this.dia = 1;
                    }
                } else {
                    if(diaInicial <= 28){
                        this.dia = diaInicial;
                    } else {
                        this.dia = 1;
                    }                    
                }
            }
        } else {
            this.dia = 1;
        }           
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    } 
}