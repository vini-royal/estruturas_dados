public interface Listable<T> {
    void append (T data); //adiciona elemento no final
    void insert (int index, T data); // 
    T select(int index); 
    T[] selectAll(); // seleciona todos os elementos da lista
    void update(int index, T data); // atualiza elemento em posição específica
    void delete(int index); // remove elemento de um índice
    void clear(); // limpa toda a lista

    int size();
    boolean isEmpty();
    boolean isFull();
    String print();


    
}
