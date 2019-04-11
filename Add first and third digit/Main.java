#include<stdio.h>
int main()
{
  int num = 786, first, last, sum;
  scanf("%d", &num);
  first = num / 100;
  last = num % 10;
  sum = first + last;
  printf("%d", sum );
  return 0;
}