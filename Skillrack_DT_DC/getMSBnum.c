#include <stdio.h>
int getMSBBitMask(int SIZE, int arr[]) {
    int result = 0;
    for (int i = 0; i < SIZE; i++) {
        int num = arr[i];
        int msb = 0;
        while (num > 1) {
            num >>= 1;
            msb++;
        }
        result |= (1 << msb);
    }
    return result;
}

int main() {
    int SIZE;
    scanf("%d", &SIZE);
    int arr[SIZE];
    for (int i = 0; i < SIZE; i++) {
        scanf("%d", &arr[i]);
    }
    printf("%d\n", getMSBBitMask(SIZE, arr));
    return 0;
}



// 5
// 48 7 12 200 37
// 172
// Explanation:

// 48 (00110000) → MSB at 6th bit → contributes 00100000 (32)

// 7 (00000111) → MSB at 3rd bit → contributes 00000100 (4)

// 12 (00001100) → MSB at 4th bit → contributes 00001000 (8)

// 200 (11001000) → MSB at 8th bit → contributes 10000000 (128)

// 37 (00100101) → MSB at 6th bit → contributes 00100000 (32, already set)

// Final OR result → 10101100 = 172