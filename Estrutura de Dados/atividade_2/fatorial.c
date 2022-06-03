#include <stdio.h>

int fatorialRecursivo(int num) {
    if (num == 0 || num == 1) {
        return 1;
    } else {
        // int fatorial = 1;
        // while (num != 0)
        // {
        //     fatorial = fatorial * num;
        //     num--;
        //     fatorialRecursivo(num);
        // }
        // return fatorial;
        return num * fatorialRecursivo(num - 1);
    }
}

int fatorialNaoRecursivo(int num) {
    int fatorial = 1;
    while(num != 0) {
        fatorial = fatorial * num;
        num--;
    }
    return fatorial;
}

int main(int argc, char const *argv[])
{
    printf("%d \n", fatorialRecursivo(5));
    printf("%d \n", fatorialNaoRecursivo(5));
}
