public class PilhaArray {
    private int[] elementos;
    private int topo;
    private int tamanho;    

    public PilhaArray(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new int[tamanho];
        this.topo = -1;
    }

    public boolean estaVazia(){
        return topo == -1;
    }

    public boolean estaCheia(){
        return topo == tamanho - 1;
    }

    public void empilhar(int elemento){
        if (estaCheia()){
            throw new RuntimeException("Pilha cheia");
        }
        topo++;
    }

    public void desempilhar(int elemento){
        if(estaVazia()){
            throw new RuntimeException("Pilha vazia");
        }
        topo--;
    }
    public int topo(){
        if (estaVazia()){
            throw new RuntimeException("Está vazia!");
        }
        return elementos[topo];
    }
}
