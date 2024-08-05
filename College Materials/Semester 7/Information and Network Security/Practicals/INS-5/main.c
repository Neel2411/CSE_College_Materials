#include <stdio.h>
#include <stdlib.h>

// Function to calculate the modulo multiplicative inverse of a number
int modInverse(int a, int m) {
    a = a % m;
    for (int x = 1; x < m; x++) {
        if ((a * x) % m == 1) {
            return x;
        }
    }
    return 0;
}

// Function to encrypt the message using Hill cipher
void hillEncrypt(int **key, int *message, int *encrypted, int matrixSize, int messageSize) {
    for (int i = 0; i < messageSize; i += matrixSize) {
        for (int j = 0; j < matrixSize; j++) {
            encrypted[i + j] = 0;
            for (int k = 0; k < matrixSize; k++) {
                encrypted[i + j] += key[j][k] * message[i + k];
            }
            encrypted[i + j] %= 26; // Modulo 26 to handle alphabetic characters (assuming a-z = 0-25)
        }
    }
}

// Function to decrypt the message using Hill cipher
void hillDecrypt(int **key, int *encrypted, int *decrypted, int matrixSize, int messageSize) {
    int determinant = 0;

    // Calculate the determinant of the key matrix
    if (matrixSize == 2) {
        determinant = (key[0][0] * key[1][1] - key[0][1] * key[1][0]);
    } else if (matrixSize == 3) {
        determinant = (key[0][0] * (key[1][1] * key[2][2] - key[1][2] * key[2][1]) -
                       key[0][1] * (key[1][0] * key[2][2] - key[1][2] * key[2][0]) +
                       key[0][2] * (key[1][0] * key[2][1] - key[1][1] * key[2][0]));
    } else {
        printf("Matrix size %d is not supported for decryption.\n", matrixSize);
        return;
    }

    // Ensure the determinant is non-zero (i.e., matrix is invertible)
    while (determinant < 0) {
        determinant += 26;
    }

    int inv_det = modInverse(determinant, 26);

    // Calculate the adjugate of the key matrix
    int **adj = (int **)malloc(matrixSize * sizeof(int *));
    for (int i = 0; i < matrixSize; i++) {
        adj[i] = (int *)malloc(matrixSize * sizeof(int));
    }

    if (matrixSize == 2) {
        adj[0][0] = key[1][1];
        adj[0][1] = -key[0][1];
        adj[1][0] = -key[1][0];
        adj[1][1] = key[0][0];
    } else if (matrixSize == 3) {
        adj[0][0] = key[1][1] * key[2][2] - key[1][2] * key[2][1];
        adj[0][1] = key[0][2] * key[2][1] - key[0][1] * key[2][2];
        adj[0][2] = key[0][1] * key[1][2] - key[0][2] * key[1][1];
        adj[1][0] = key[1][2] * key[2][0] - key[1][0] * key[2][2];
        adj[1][1] = key[0][0] * key[2][2] - key[0][2] * key[2][0];
        adj[1][2] = key[0][2] * key[1][0] - key[0][0] * key[1][2];
        adj[2][0] = key[1][0] * key[2][1] - key[1][1] * key[2][0];
        adj[2][1] = key[0][1] * key[2][0] - key[0][0] * key[2][1];
        adj[2][2] = key[0][0] * key[1][1] - key[0][1] * key[1][0];
    }

    // Calculate the inverse of the key matrix
    for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
            while (adj[i][j] < 0) {
                adj[i][j] += 26;
            }
            adj[i][j] = adj[i][j] * inv_det % 26;
        }
    }

    // Decrypt the message using the inverse of the key matrix
    for (int i = 0; i < messageSize; i += matrixSize) {
        for (int j = 0; j < matrixSize; j++) {
            decrypted[i + j] = 0;
            for (int k = 0; k < matrixSize; k++) {
                decrypted[i + j] += adj[j][k] * encrypted[i + k];
            }
            decrypted[i + j] %= 26; // Modulo 26 to handle alphabetic characters (assuming a-z = 0-25)
        }
    }

    // Free the dynamically allocated memory for the adjugate matrix
    for (int i = 0; i < matrixSize; i++) {
        free(adj[i]);
    }
    free(adj);
}

int main() {
    int matrixSize;

    // Get the matrix size from the user
    printf("Enter the size of the key matrix (e.g., 2, 3, 4, etc.): ");
    scanf("%d", &matrixSize);

    // Allocate memory for the key matrix dynamically
    int **key = (int **)malloc(matrixSize * sizeof(int *));
    for (int i = 0; i < matrixSize; i++) {
        key[i] = (int *)malloc(matrixSize * sizeof(int));
    }

    // Get the key matrix elements from the user
    printf("Enter the key matrix elements (row by row):\n");
    for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
            scanf("%d", &key[i][j]);
        }
    }

    // Input message (replace this with your actual message)
    int messageSize;
    printf("Enter the size of the message (must be a multiple of %d): ", matrixSize);
    scanf("%d", &messageSize);

    int *message = (int *)malloc(messageSize * sizeof(int));
    int *encrypted = (int *)malloc(messageSize * sizeof(int));
    int *decrypted = (int *)malloc(messageSize * sizeof(int));

    printf("Enter the message elements (numeric representation, e.g., 0-25):\n");
    for (int i = 0; i < messageSize; i++) {
        scanf("%d", &message[i]);
    }

    // Encrypt the message
    hillEncrypt(key, message, encrypted, matrixSize, messageSize);

    // Print the encrypted message
    printf("Encrypted message: ");
    for (int i = 0; i < messageSize; i++) {
        printf("%c", 'A' + encrypted[i]); // Convert numeric representation back to alphabetic characters
    }
    printf("\n");

    // Decrypt the message
    hillDecrypt(key, encrypted, decrypted, matrixSize, messageSize);

    // Print the decrypted message
    printf("Decrypted message: ");
    for (int i = 0; i < messageSize; i++) {
        printf("%c", 'A' + decrypted[i]); // Convert numeric representation back to alphabetic characters
    }
    printf("\n");

    // Free dynamically allocated memory
    for (int i = 0; i < matrixSize; i++) {
        free(key[i]);
    }
    free(key);
    free(message);
    free(encrypted);
    free(decrypted);

    return 0;
}
