#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;

double area (int a, int b, int c) {
    double p = (double) (a + b + c) / 2 * 1.0;
    return pow(p * (p - a) * (p - b) * (p - c), 0.5);
}
void sort_by_area(triangle* tr, int n) {
	/**
	* Sort an array a of the length n
	*/
    int a, b, c;
    int a1, b1, c1;
    triangle t;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            a = (tr + j) -> a;           
            b = (tr + j) -> b;           
            c = (tr + j) -> c;           
            
            a1 = (tr + j + 1) -> a;           
            b1 = (tr + j + 1) -> b;           
            c1 = (tr + j + 1) -> c;           
            
            if (area(a, b, c) > area(a1, b1, c1)) {
                t = *(tr + j);
                *(tr + j) = *(tr + j + 1);
                *(tr + j + 1) = t;
            }
        }
    }
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}