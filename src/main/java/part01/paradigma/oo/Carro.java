package part01.paradigma.oo;

public class Carro {
    private int quantidadePessoa = 0;
    private int MAXPESSOA = 5;

    public int getMAXPESSOA() {
        return MAXPESSOA;
    }

    public int getQuantidadePessoa() {
        return quantidadePessoa;
    }

    public void setQuantidadePessoa(int quantidadePessoa) {
        this.quantidadePessoa = quantidadePessoa;
    }

    public int addPessoa(){
        if (getQuantidadePessoa() < this.MAXPESSOA) {
            this.quantidadePessoa++;
            return getQuantidadePessoa();
        }else {
            return 0;
        }
    }
    public int removerPessoa(){
        if (getQuantidadePessoa() > 0){
            this.quantidadePessoa--;
            return getQuantidadePessoa();
        }
        else {
            return 0;
        }
    }
}
