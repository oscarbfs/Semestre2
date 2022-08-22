#include <stdio.h>
#include <stdlib.h>

void maiorMenor(int vetor[], int* maximo, int* minimo) {
    int min = *minimo;
    int max = *maximo;

    for (int i=0; i<5;i++) {
		if (vetor[i] > max)
        {
            max = vetor[i];
        } else if(vetor[i] < min) 
        {
            min = vetor[i];
        }
	}

    *maximo = max;
    *minimo = min;

}

int main() {

    int vetor[5] = {1,2,3,4,5};
    int minimo = 5;
    int maximo = 1;
    maiorMenor(vetor,  &maximo, &minimo);
    printf("Maximo: %d\nMinimo: %d", maximo, minimo);
	
	return 0;
}