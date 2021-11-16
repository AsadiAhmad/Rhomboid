#include<stdio.h>

void print (int n) {
    for (int z = n; z > 0; z--){
        printf (" ");
    }
}
void printx (int n) {
    for (int z = n; z > 0; z--){
        printf ("*");
    }
}
int main() {
    int n, i = -1, y = 0;
    scanf("%d",&n);
    y = n;
    while (y > 0) {
        y--;
        i = i + 2;
        print (y);
        printx (i);
        printf ("\n");
    }
    int c = 0, r = (n * 2) - 1;
    while (c < n){
        c++;
        r = r - 2;
        print (c);
        printx (r);
        printf ("\n");
    }
    int f;
    scanf("%d",&f);
}