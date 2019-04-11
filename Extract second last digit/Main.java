#include<stdio.h>
int main()
{
  int n = 12345, a, b;
  scanf("%d%d", &n);
  a = n % 100;
  b = a / 10;
  printf("%d", b);
  return 0;
}