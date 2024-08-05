#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

#define MAX_LENGTH 100

int main() {
    int randomNumbers[26];  // Array to store the random numbers
    int count = 0;          // Counter for unique numbers

    srand(time(0));         // Seed the random number generator with the current time

    while (count < 26) {
        int randomNumber = rand() % 26 + 65;  // Generate a random number between 65 and 90 (inclusive)

        // Check if the number is already generated
        int isDuplicate = 0;
        for (int i = 0; i < count; i++) {
            if (randomNumbers[i] == randomNumber) {
                isDuplicate = 1;
                break;
            }
        }

        if (!isDuplicate) {
            randomNumbers[count] = randomNumber;  // Store the unique number
            count++;
        }
    }

    char plainText[MAX_LENGTH];
    printf("Enter the plain text: ");
    fgets(plainText, sizeof(plainText), stdin);
    plainText[strcspn(plainText, "\n")] = '\0';  // Remove trailing newline character

    int textLength = strlen(plainText);
    char cipherText[MAX_LENGTH];
    char decryptedText[MAX_LENGTH];

    // Generate the cipher text
    for (int i = 0; i < textLength; i++) {
        char currentChar = plainText[i];

        if (currentChar >= 'A' && currentChar <= 'Z') {
            int key = randomNumbers[currentChar - 'A'];
            cipherText[i] = key;
        } else {
            cipherText[i] = currentChar;
        }
    }
    cipherText[textLength] = '\0';

    // Decrypt the cipher text
    for (int i = 0; i < textLength; i++) {
        char currentChar = cipherText[i];

        if (currentChar >= 'A' && currentChar <= 'Z') {
            int index = 0;
            while (randomNumbers[index] != currentChar) {
                index++;
            }
            decryptedText[i] = 'A' + index;
        } else {
            decryptedText[i] = currentChar;
        }
    }
    decryptedText[textLength] = '\0';

    // Print the generated keys
    printf("Generated Keys: \n");
    for (int i = 0; i < 26; i++) {
        printf("%d: %c\n", i+1, (char)randomNumbers[i]);
    }
    printf("\n");

    // Print the cipher text
    printf("Cipher Text: %s\n", cipherText);

    // Print the decrypted text
    printf("Decrypted Text: %s\n", decryptedText);

    return 0;
}
