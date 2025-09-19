// Classe Nó
class No {
    constructor(valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}


// Classe Árvore Binária de Busca
class ArvoreBinaria {
    constructor() {
        this.raiz = null;
    }


    // Inserir novo valor na árvore
    inserir(valor) {
        const novoNo = new No(valor);


        if (this.raiz === null) {
            this.raiz = novoNo;
        } else {
            this.#inserirNo(this.raiz, novoNo);
        }
    }


    #inserirNo(no, novoNo) {
        if (novoNo.valor < no.valor) {
            if (no.esquerda === null) {
                no.esquerda = novoNo;
            } else {
                this.#inserirNo(no.esquerda, novoNo);
            }
        } else {
            if (no.direita === null) {
                no.direita = novoNo;
            } else {
                this.#inserirNo(no.direita, novoNo);
            }
        }
    }


    // Buscar valor
    buscar(valor) {
        return this.#buscarNo(this.raiz, valor);
    }


    #buscarNo(no, valor) {
        if (no === null) return false;
        if (valor === no.valor) return true;
        if (valor < no.valor) return this.#buscarNo(no.esquerda, valor);
        return this.#buscarNo(no.direita, valor);
    }


    // Percurso em ordem (in-order)
    emOrdem(no = this.raiz) {
        if (no !== null) {
            this.emOrdem(no.esquerda);
            console.log(no.valor);
            this.emOrdem(no.direita);
        }
    }


    // Percurso pré-ordem
    preOrdem(no = this.raiz) {
        if (no !== null) {
            console.log(no.valor);
            this.preOrdem(no.esquerda);
            this.preOrdem(no.direita);
        }
    }


    // Percurso pós-ordem
    posOrdem(no = this.raiz) {
        if (no !== null) {
            this.posOrdem(no.esquerda);
            this.posOrdem(no.direita);
            console.log(no.valor);
        }
    }


    // Encontrar valor mínimo
    minimo(no = this.raiz) {
        if (no === null) return null;
        while (no.esquerda !== null) {
            no = no.esquerda;
        }
        return no.valor;
    }


    // Encontrar valor máximo
    maximo(no = this.raiz) {
        if (no === null) return null;
        while (no.direita !== null) {
            no = no.direita;
        }
        return no.valor;
    }


    // Altura da árvore
    altura(no = this.raiz) {
        if (no === null) return 0;
        return 1 + Math.max(this.altura(no.esquerda), this.altura(no.direita));
    }
}


// Exemplo de uso
const arvore = new ArvoreBinaria();
arvore.inserir(10);
arvore.inserir(5);
arvore.inserir(15);
arvore.inserir(3);
arvore.inserir(7);


console.log("Buscar 7:", arvore.buscar(7));
console.log("Mínimo:", arvore.minimo());
console.log("Máximo:", arvore.maximo());
console.log("Altura:", arvore.altura());


console.log("Percurso em ordem:");
arvore.emOrdem();


console.log("Percurso pré-ordem:");
arvore.preOrdem();


console.log("Percurso pós-ordem:");
arvore.posOrdem();

console.log(JSON.stringify(arvore, null, 2));
