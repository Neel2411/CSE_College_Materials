#include <stdio.h>

// Function to encrypt the message
void encrypt(char message[], int key) {
    int i = 0;
    char ch;

    while (message[i] != '\0') {
        ch = message[i];

        // Encrypt uppercase letters
        if (ch >= 'A' && ch <= 'Z') {
            ch = ((ch - 'A') + key) % 26 + 'A';
        }

        // Encrypt lowercase letters
        else if (ch >= 'a' && ch <= 'z') {
            ch = ((ch - 'a') + key) % 26 + 'a';
        }

        message[i] = ch;
        i++;
    }
}

// Function to decrypt the message
void decrypt(char message[], int key) {
    // To decrypt a message, we use the negative value of the key
    key = -key;
    encrypt(message, key);
}

int main() {
    char message[100];
    int key;

    printf("Enter a message: ");
    fgets(message, sizeof(message), stdin);

    printf("Enter the key (0-25): ");
    scanf("%d", &key);

    encrypt(message, key);
    printf("Encrypted message: %s\n", message);

    decrypt(message, key);
    printf("Decrypted message: %s\n", message);

    return 0;
}
