#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

#define MAX(a,b) (((a)>(b))?(a):(b))

int main() 
{

    int n;
    scanf("%d", &n);
  	// Complete the code to print the pattern.
    for (int i = -n + 1; i < n ; ++i) {
        for (int j = -n + 1; j < n; ++j) {
            // Chess board distance formula (N8P) -- Image Processing
            printf("%d ", MAX(abs(i), abs(j)) + 1);
        }
        printf("\n");
    }
    return 0;
}
