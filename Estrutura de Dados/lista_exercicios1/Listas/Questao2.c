#include <stdio.h>
#include <stdlib.h>

struct ArvBin
{
    int info;
    struct ArvBin *esq;
    struct ArvBin *dir;
};
struct ArvBin *raiz = NULL;


struct Pilha {
    char data;
    struct Pilha *prox;
};

struct Pilha *topo = NULL;

struct Pilha* proxDaPilha(struct Pilha* topo) {
    return topo->prox;
}

void conversao_pilha_para_arvore(struct Pilha* pilha) {

    if(topo == NULL) {
        printf("Pilha Vazia");
    } else {
        struct Piha* temp = topo;
        while(temp->prox == NULL) {
            temp = proxDaPilha(topo);
            inserirArvBin(raiz, temp->data);
        }
    }
}

int main(int argc, char const *argv[])
{
    
    return 0;
}
