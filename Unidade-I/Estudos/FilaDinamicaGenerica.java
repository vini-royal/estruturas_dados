
import java.util.NoSuchElementException;


public class FilaDinamicaGenerica implements FilaInterface {
    private int quantidade; //quantidade atual de elementos
    private int tamanho;
    private NoDuplo<T> ponteiroInicio; //ponteiro para o início da fila
    private NoDuplo<T> ponteiroFim;

    public FilaDinamicaGenerica(){
        this(10);
    }

    public FilaDinamicaGenerica(int tamanho){
        ponteiroInicio = null;
        ponteiroFim = null;
        quantidade = 0;
        this.tamanho = tamanho;
        //inicializa a fila vazia
    }
    //adiciona elemento no fim da fila
    public void enfileirarFim(T dado) {
        if (estaCheia()){
        throw new NoSuchElementException("Fila cheia");
    }
    NoDuplo<T> temporario = new NoDuplo<>(dado);
    temporario.setDado(dado);

    if (!estaVazia()){
        ponteiroFim.setProximo(temporario);
    } else {
        ponteiroInicio = temporario;
    }
    temporario.setAnterior(ponteiroFim);
    ponteiroFim = temporario;
    quantidade++;
    }
    // remove e retorna o elemento do início
    public T desenfileirarInicio(){
        if(estaVazia()) {
            throw new NoSuchElementException("Fila vazia");
        }
        T dadoInicio = ponteiroInicio.getDado();
        ponteiroInicio = ponteiroInicio.getProximo();
        quantidade--;

        if(!estaVazia()){
            ponteiroInicio.setAnterior(null);
            
        }
    }
}