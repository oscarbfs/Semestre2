#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    float array[5] = {1,2,3,4,5};
    
    for(int index = 0; index < 5; index++) {
        printf("%d\n", &array[index]);
    }

    return 0;
}
