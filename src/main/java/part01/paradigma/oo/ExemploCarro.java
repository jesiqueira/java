package part01.paradigma.oo;

public class ExemploCarro {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.setQuantidadePessoa(1);
        System.out.println("Quantidade pessoa dentro do carro: "+carro.getQuantidadePessoa());

        carro.addPessoa();
        carro.addPessoa();
        carro.addPessoa();
        carro.addPessoa();
        carro.removerPessoa();
        carro.removerPessoa();

        if (carro.getQuantidadePessoa() != carro.getMAXPESSOA()){
            System.out.println("Quantidade pessoas: "+carro.getQuantidadePessoa());
        }else {
            System.out.println("Não é possível adicionar mais pessoas capacidade máxima atingida: " +carro.getQuantidadePessoa());
        }

    }
}
