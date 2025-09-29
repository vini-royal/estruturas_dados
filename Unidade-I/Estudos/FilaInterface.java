public interface FilaInterface {
    void enfileirar (Object data); //adiciona elemento no final da fila
    // elemento a ser adicionado do tipo Object (data)
    Object desenfileirar(); // remove e retorna o elemento do início da fila
    Object frente(); // retorna o elemento do início (NÃO REMOVE) também conhecido como peek()

    boolean estaVazia(); 
    boolean estaCheia();

/* Exemplo fila:

Fila: [Cliente1] [Cliente2] [Cliente3] [Cliente4]
        ↑                   ↑
      front               back */
}