#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Function to perform Rail Fence cipher encryption
void railFenceEncrypt(char plaintext[], int key) {
    int len = strlen(plaintext);

    // Create the matrix for the rail fence pattern
    char matrix[key][len];
    for (int i = 0; i < key; i++) {
        for (int j = 0; j < len; j++) {
            matrix[i][j] = '\0';
        }
    }

    // Fill the matrix with the plaintext characters
    int row = 0, col = 0;
    int direction = 1; // 1 for down, -1 for up

    for (int i = 0; i < len; i++) {
        matrix[row][col] = plaintext[i];

        // Change direction if we reach the top or bottom rail
        if (row == key - 1) {
            direction = -1;
        } else if (row == 0) {
            direction = 1;
        }

        // Move to the next row in the zigzag pattern
        row += direction;
        col++;
    }

    // Print the rail fence matrix
    printf("Rail Fence Matrix:\n");
    for (int i = 0; i < key; i++) {
        for (int j = 0; j < len; j++) {
            if (matrix[i][j] != '\0') {
                printf("%c ", matrix[i][j]);
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }
    printf("\n");

    // Print the encrypted ciphertext
    printf("Encrypted Ciphertext: ");
    for (int i = 0; i < key; i++) {
        for (int j = 0; j < len; j++) {
            if (matrix[i][j] != '\0') {
                printf("%c", matrix[i][j]);
            }
        }
    }
    printf("\n");

    // Now, perform decryption using the same ciphertext
    printf("Decrypted Plaintext: ");
    row = 0;
    col = 0;
    for (int i = 0; i < len; i++) {
        if (matrix[row][col] != '\0') {
            printf("%c", matrix[row][col]);
        }

        // Change direction if we reach the top or bottom rail
        if (row == key - 1) {
            direction = -1;
        } else if (row == 0) {
            direction = 1;
        }

        // Move to the next row in the zigzag pattern
        row += direction;
        col++;
    }
    printf("\n");
}

int main() {
    char plaintext[100];
    int key;

    printf("Enter plaintext: ");
    fgets(plaintext, sizeof(plaintext), stdin);
    plaintext[strcspn(plaintext, "\n")] = '\0'; // Remove trailing newline

    printf("Enter key (number of rails): ");
    scanf("%d", &key);

    // Convert plaintext to uppercase (optional but simplifies the encryption)
    for (int i = 0; i < strlen(plaintext); i++) {
        plaintext[i] = toupper(plaintext[i]);
    }

    railFenceEncrypt(plaintext, key);

    return 0;
}
