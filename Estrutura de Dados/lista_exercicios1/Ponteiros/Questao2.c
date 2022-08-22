#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    float array[10] = {1,2,3,4,5,6,7,8,9,10};
    
    for(int index = 0; index < 10; index++) {
        printf("%d\n", &array[index]);
    }

    return 0;
}
