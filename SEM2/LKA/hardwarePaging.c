#include<stdio.h>

struct MM{
  struct Level1 table1[10];
  struct Level2 tabel2[10];
};
struct Level1
{
    int PageDir, PageNo, PageOffset;
};
struct Level2
{
    int PageNo, PageOffset;
};
void main()
{
    struct MM *block1 = (struct MM*) malloc(sizeof(struct MM));
}
