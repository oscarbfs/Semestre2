int main(int argc, char const *argv[])
{
    int x, *ptx, **pp;
    float a, *pta, **pf;

    // a
    x = 100;

    // b
    // *pta = &a; errado

    // c
    // ptx = &a; errado

    // d
    // *pf = &a; errado

    // e
    // pp = &pta; errado

    // f
    // **pf = 7.9; errado

    // g
    // *ptx = 20; errado

    // h
    ptx = &x;

    // i
    // pp = &x; errado

    // j
    pf = &pta;

    int o = 2;
    int *po = &o;
    int **ppo = &po;
    printf("o:\n");
    printf("%d\n", o);
    printf("%d\n", &o);
    // printf("%d\n", *o);
    // printf("%d\n", **o);

    printf("po:\n");
    printf("%d\n", po);
    printf("%d\n", &po);
    printf("%d\n", *po);
    // printf("%d\n", **po);

    printf("ppo:\n");
    printf("%d\n", ppo);
    printf("%d\n", &ppo);
    printf("%d\n", *ppo);
    printf("%d\n", **ppo);

    return 0;
}
