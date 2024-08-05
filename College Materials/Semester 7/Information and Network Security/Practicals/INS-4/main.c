#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

// Function to generate and print the matrix of alphabets used in the cipher
void print_alphabet_matrix() {
    printf("Alphabet Matrix:\n");
    for (int i = 0; i < 26; i++) {
        printf("%c | ", 'A' + i);
        for (int j = 0; j < 26; j++) {
            printf("%c ", (i + j) % 26 + 'A');
        }
        printf("\n");
    }
    printf("\n");
}

// Function to perform Polyalphabetic encryption and return the keyword shift values
char* polyalphabetic_encrypt(const char* plaintext, const char* keyword, int** shift_values) {
    int plain_len = strlen(plaintext);
    int key_len = strlen(keyword);
    char* ciphertext = (char*)malloc(plain_len + 1);
    *shift_values = (int*)malloc(plain_len * sizeof(int));

    for (int i = 0; i < plain_len; i++) {
        if (!isalpha(plaintext[i])) {
            ciphertext[i] = plaintext[i];
            (*shift_values)[i] = 0;
        } else {
            char base = isupper(plaintext[i]) ? 'A' : 'a';
            int shift = toupper(keyword[i % key_len]) - 'A';
            ciphertext[i] = (plaintext[i] - base + shift) % 26 + base;
            (*shift_values)[i] = shift;
        }
    }
    ciphertext[plain_len] = '\0';
    return ciphertext;
}

// Function to perform Polyalphabetic decryption and return the keyword shift values
char* polyalphabetic_decrypt(const char* ciphertext, const char* keyword, int** shift_values) {
    int cipher_len = strlen(ciphertext);
    int key_len = strlen(keyword);
    char* plaintext = (char*)malloc(cipher_len + 1);
    *shift_values = (int*)malloc(cipher_len * sizeof(int));

    for (int i = 0; i < cipher_len; i++) {
        if (!isalpha(ciphertext[i])) {
            plaintext[i] = ciphertext[i];
            (*shift_values)[i] = 0;
        } else {
            char base = isupper(ciphertext[i]) ? 'A' : 'a';
            int shift = toupper(keyword[i % key_len]) - 'A';
            plaintext[i] = (ciphertext[i] - base - shift + 26) % 26 + base;
            (*shift_values)[i] = shift;
        }
    }
    plaintext[cipher_len] = '\0';
    return plaintext;
}

int main() {
    print_alphabet_matrix();

    char plaintext[1000];
    char keyword[100];

    printf("Enter the keyword: ");
    scanf("%s", keyword);

    printf("Enter the plaintext: ");
    getchar(); // Clear the newline character from the buffer
    fgets(plaintext, sizeof(plaintext), stdin);

    int* encrypt_shift_values;
    int* decrypt_shift_values;

    char* encrypted = polyalphabetic_encrypt(plaintext, keyword, &encrypt_shift_values);
    char* decrypted = polyalphabetic_decrypt(encrypted, keyword, &decrypt_shift_values);

    printf("Encrypted text: %s\n", encrypted);
    printf("Decrypted text: %s\n", decrypted);

    free(encrypted);
    free(decrypted);
    free(encrypt_shift_values);
    free(decrypt_shift_values);

    return 0;
}
