#include <stdio.h>
#include <stdlib.h>

struct Nodo
{
    int info;
    struct Nodo *esq;
    struct Nodo *dir;
};
typedef struct Nodo* ArvBin;

ArvBin* criaArvBin() {
    ArvBin* raiz = (ArvBin*) malloc(sizeof(ArvBin));
    if(raiz != NULL) *raiz = NULL;
    return raiz;
}

void liberaNodo(struct Nodo* nodo) {
    if(nodo == NULL) return;
    liberaNodo(nodo->esq);
    liberaNodo(nodo->dir);
    free(nodo);
    nodo = NULL;
}

void liberaArvBin(ArvBin* raiz) {
    if(raiz == NULL) return;
    liberaNodo(*raiz);
    free(raiz);
}

void estaVaziaArvBin(ArvBin *raiz) {
    if(raiz == NULL) printf("\nArvore Vazia\n");
    else if(*raiz == NULL) printf("\nArvore Vazia\n");
    else printf("\nArvore Não Vazia\n");
}

int alturaArvBin(ArvBin *raiz) {
    if(raiz == NULL) return 0;
    if(*raiz == NULL) return 0;

    int altEsq = alturaArvBin(&((*raiz) ->esq));
    int altDir = alturaArvBin(&((*raiz) ->dir));

    if (altEsq > altDir) return (altEsq+1);
    else return (altDir + 1);
}

int totalNodoArvBin(ArvBin *raiz) {
    if(raiz == NULL) return 0;
    if(*raiz == NULL) return 0;
    int altEsq = totalNodoArvBin(&((*raiz) ->esq));
    int altDir = totalNodoArvBin(&((*raiz) ->dir));
    return (altDir + altEsq + 1);
}

void listagemNivel(ArvBin *raiz, int index) {
    // if (*raiz != NULL)
    // {
    //     printf("\nNivel 0 (Raiz): %d\n", (*raiz)->info);
    //     for(int i=1;i<alturaArvBin(raiz);i++) {
    //         printf("Nivel %d: ", i);
    //         printf("\n");
    //     }
    // }
    if (*raiz != NULL)
    {
        printf("\nNivel %d: ", index);
        printf("%d ", (*raiz)->info);
        index++;
        listagemNivel(&((*raiz)->esq), index);
        listagemNivel(&((*raiz)->dir), index);
    }
}

int infoNodo(ArvBin *raiz) {
    return (*raiz)->info;
}

void listagemPreOrdem(ArvBin *raiz)
{
    if (*raiz != NULL)
    {
        printf("%d ", (*raiz)->info);
        listagemPreOrdem(&((*raiz)->esq));
        listagemPreOrdem(&((*raiz)->dir));
    }
}


void listagemOrdem(ArvBin *raiz)
{
    if (*raiz != NULL)
    {
        listagemOrdem(&((*raiz)->esq));
        printf("%d ", (*raiz)->info);
        listagemOrdem(&((*raiz)->dir));
    }
}


void listagemPosOrdem(ArvBin *raiz)
{
    if (*raiz != NULL)
    {
        listagemPosOrdem(&((*raiz)->esq));
        listagemPosOrdem(&((*raiz)->dir));
        printf("%d ", (*raiz)->info);
    }
}

int inserirArvBin(ArvBin* raiz, int valor) {
    if(raiz == NULL) {
        printf("Arvore Vazia\n");
        return 0;
    }
    struct Nodo* novo;
    novo = (struct Nodo*) malloc(sizeof(struct Nodo));
    if(novo == NULL) return 0;
    novo->info = valor;
    novo->dir = NULL;
    novo->esq = NULL;

    if(*raiz == NULL) *raiz = novo;
    else{
        struct Nodo* atual = *raiz;
        struct Nodo* ant = NULL;
        while(atual != NULL) {
            ant = atual;
            if(valor == atual->info) {
                free(novo);
                return 0;
            }
            if(valor > atual->info) atual = atual->dir;
            else atual = atual->esq;
        }
        if(valor > ant->info) ant->dir = novo;
        else ant->esq = novo;
    }
    return 1;
}

struct Nodo* removerAtual(struct Nodo* atual) {
    struct Nodo *nodo1, *nodo2;
    if(atual->esq == NULL) {
        nodo2 = atual->dir;
        free(atual);
        return nodo2;
    }
    nodo1 = atual;
    nodo2 = atual->esq;
    while(nodo2->dir != NULL) {
        nodo1 = nodo2;
        nodo2 = nodo2->dir;
    }
    if(nodo1 != atual) {
        nodo1->dir = nodo2->esq;
        nodo2->esq = atual->esq;
    }
    nodo2->dir = atual->dir;
    free(atual);
    return nodo2;
}

int removerArvBin(ArvBin* raiz, int valor) {
    if(raiz == NULL) return 0;
    struct Nodo* ant = NULL;
    struct Nodo* atual = *raiz;
    while(atual != NULL) {
        if(valor == atual->info) {
            if(atual == *raiz) * raiz = removerAtual(atual);
            else {
                if(ant->dir == atual) ant->dir - removerAtual(atual);
                else ant->esq = removerAtual(atual);
            }
            return 1;
        }
        ant = atual;
        if(valor > atual ->info) atual = atual->dir;
        else atual = atual->esq;
    }
}


int consultaArvBin(ArvBin *raiz, int valor) {
    if(raiz == NULL) return 0;
    struct Nodo* atual = *raiz;
    while(atual != NULL) {
        if(valor == atual->info) return 1;
        if(valor > atual->info) atual = atual->dir;
        else atual = atual->esq;
    }
    return 0;
}

int main(int argc, char const *argv[])
{
    int N = 8, dados[8] = {50,100,30,20,40,45,35,105};

    ArvBin* raiz = criaArvBin();

    int i;
    for(i=0; i < N; i++){
        estaVaziaArvBin(raiz);
        printf("Inserindo dado...\n");
        inserirArvBin(raiz,dados[i]);
        printf("Total de nodos: %d\n", totalNodoArvBin(raiz));
        printf("Altura da arvore: %d\n", alturaArvBin(raiz)-1);
        printf("Nodos (Por nivel): ");
        listagemNivel(raiz, 0);
        printf("\nNodos (Pre-ordem): ");
        listagemPreOrdem(raiz);
        printf("\nNodos (Ordem): ");
        listagemOrdem(raiz);
        printf("\nNodos (Pos-ordem): ");
        listagemPosOrdem(raiz);
        estaVaziaArvBin(raiz);
    }

    liberaArvBin(raiz);

    return 0;
}


// struct Arvbin
// {
//     int info;
//     struct Arvbin *esq;
//     struct Arvbin *dir;
// };
// struct Arvbin *raiz = NULL;

// void inserir(struct Arvbin **arvore, int info)
// {
//     if (*arvore == NULL)
//     {
//         (*arvore) = (struct Arvbin *)malloc(sizeof(struct Arvbin));
//         (*arvore)->info = info;
//         (*arvore)->esq = NULL;
//         (*arvore)->dir = NULL;
//     }
//     else
//     {
//         if (info < (*arvore)->info)
//         {
//             inserir(&(*arvore)->esq, info);
//         }
//         else
//         {
//             inserir(&(*arvore)->dir, info);
//         }
//     }
// }

// int buscar(struct Arvbin *arvore, int info)
// {
//     if (arvore != NULL)
//     {
//         if (info == arvore->info)
//         {
//             return 1;
//         }
//         else if (info < arvore->info)
//         {
//             return buscar(arvore->esq, info);
//         }
//         else
//         {
//             return buscar(arvore->dir, info);
//         }
//     }
//     else
//     {
//         return 0;
//     }
// }

// void listagem_ordem(struct Arvbin *arvore)
// {
//     if (arvore != NULL)
//     {
//         listagem_ordem(arvore->esq);
//         printf("%d ", arvore->info);
//         listagem_ordem(arvore->dir);
//     }
// }

// void listagem_preordem(struct Arvbin *arvore)
// {
//     if (arvore != NULL)
//     {
//         printf("%d ", arvore->info);
//         listagem_preordem(arvore->esq);
//         listagem_preordem(arvore->dir);
//     }
// }

// void listagem_posordem(struct Arvbin *arvore)
// {
//     if (arvore != NULL)
//     {
//         listagem_posordem(arvore->esq);
//         listagem_posordem(arvore->dir);
//         printf("%d ", arvore->info);
//     }
// }

// int main(int argc, char const *argv[])
// {
//     inserir(raiz, 1);
//     return 0;
// }
