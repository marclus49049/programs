#include <stdio.h>
#include <stdlib.h>

struct Block
{
	int num1;
	int num2;
	int num3;
};
 // struct Block2{
	// int num1;
 // 	int num2;
 // }
void main(){
	// struct Block b1 = {11,12,13};
	// struct Block *p1 = &b1;
	// struct Block b2 = {.num1=21,.num3=23};
	// struct Block *p2 = &b2;
	// struct Block b3 = {};
	// struct Block *p3 = &b3;
	// printf("n1= %d, n2= %d, n3= %d\n", p1->num1,p1->num2,p1->num3);
	// printf("n1= %d, n2= %d, n3= %d\n", p2->num1,p2->num2,p2->num3); // internal fragmentation is when a proceess is given a larger block of memory than required thus cause it to create holes that cant be used
	// printf("n1= %d, n2= %d, n3= %d\n", p3->num1,p3->num2,p3->num3);

	struct Block *p1 = (struct Block*) malloc(sizeof(struct Block));
	struct Block *p2 = (struct Block*) malloc(sizeof(struct Block));
	p1->num1 = 1;
	p1->num2 = 2;
	p1->num3 = 3;

	p2->num1=1;
	printf("%d, %d, %d\n", p1->num1, p1->num2, p1->num3);
	printf("%d, %d, %d\n", p2->num1, p2->num2, p2->num3);
}
