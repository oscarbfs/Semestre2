#include <stdio.h>
#include <stdlib.h>

void somar(int *A, int B) {
    *A += B;
}

int main(int argc, char const *argv[])
{
    int A = 1; 
    int B = 2; 
    somar(&A, B);
    printf("A = %d\n", A);
    printf("B = %d", B);
    return 0;
}
