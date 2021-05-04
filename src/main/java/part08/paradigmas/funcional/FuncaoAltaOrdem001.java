package part08.paradigmas.funcional;

public class FuncaoAltaOrdem001 {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a + b;
        System.out.println(executarOperacao(soma, 2, 4));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }

}

interface Calculo{
    public int calcular(int a, int b);
}
