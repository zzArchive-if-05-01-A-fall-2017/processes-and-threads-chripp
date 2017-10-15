#include <stdio.h>
#include <sys/types.h>
#include <string.h>
#include <stdlib.h>

#define MAX_LENGTH 256

int main(int argc, char* argv[])
{
  char in[MAX_LENGTH];
  fgets(in, MAX_LENGTH, stdin);
  char* com = strtok(in, "&&");
  while (com != 0)
  {
    system(com);
    com = strtok(0, "&&");
  }
  return 0;
}
