#include <stdio.h>    

int main(int argc, char const *argv[])
{
    int maximos[5] = {100,80,60,40,20};
    int minimos[5] = {20,16,12,8,5};

    int ranges[5];

    for (int index = 0; index < 5; ++index)
    {
        ranges[index] = maximos[index] - minimos[index];
    }

    for (int i = 0; i < 5; i++) 
    {     
        printf("%d ", ranges[i]);     
    }     

    return 0;
}
