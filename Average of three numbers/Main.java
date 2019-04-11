#include<stdio.h>
int main()
{
  int a = 1, b = 2, c = 3, sum, avg;
  scanf("%d%d%d", &a, &b, &c);
  sum = a + b + c;
  avg = sum / 3;
  printf("%d", avg);
  return 0;
}