#include <stdio.h>
#include <conio.h>

struct Rato{
  char norte;
  char leste;
  char oeste;
  char sul;
};

void main()
{
  FILE *arq;
  char Linha[100];
  char *result;
  int i;

  // Abre um arquivo TEXTO para LEITURA
  arq = fopen("labirinto.txt", "r+");
  if (arq == NULL)  // Se houve erro na abertura
  {
     printf("Problemas na abertura do arquivo\n");
     return;
  }

  i = 1;
  while (!feof(arq))
  {
	// Lê uma linha (inclusive com o '\n')
      result = fgets(Linha, 100, arq);  // o 'fgets' lê até 99 caracteres ou até o '\n'
      if (result)  // Se foi possível ler
	  printf("%s",Linha);
      i++;
  }
  fclose(arq);
}