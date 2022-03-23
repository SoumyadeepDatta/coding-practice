#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    char *arr;
    arr = malloc(1024 * sizeof(char));
    scanf("%[^\n]", arr);
    arr = realloc(arr, strlen(arr) + 1);
    
    int ans[10] = {0};
    
    for (int i = 0; i < strlen(arr); i++) {
        if (*(arr + i) >= 48 && *(arr + i) <= 57) {
            ans[*(arr + i) % 48] += 1;
        }
    } 
    
    for (int i = 0; i < 10; i++) {
        printf("%d ", ans[i]);
    }
    return 0;
}
