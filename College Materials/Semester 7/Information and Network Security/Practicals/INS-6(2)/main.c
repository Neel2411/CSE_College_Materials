#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define MAX_LEN 1000

void setPermutationOrder(char key[], int keyMap[], int key_len)
{
    // Add the permutation order into array based on alphabetical order
    for (int i = 0; i < key_len; i++)
    {
        keyMap[i] = i;
    }

    // Perform the Bubble Sort to rearrange the order based on the keyword
    for (int i = 0; i < key_len - 1; i++)
    {
        for (int j = 0; j < key_len - i - 1; j++)
        {
            if (key[keyMap[j]] > key[keyMap[j + 1]])
            {
                int temp = keyMap[j];
                keyMap[j] = keyMap[j + 1];
                keyMap[j + 1] = temp;
            }
        }
    }
}

void printMatrix(char msg[], char key[])
{
    int row, col, j;
    int keyMap[256] = {0};

    int key_len = strlen(key);
    setPermutationOrder(key, keyMap, key_len);

    // Calculate column of the matrix
    col = key_len;

    // Calculate Maximum row of the matrix
    row = strlen(msg) / col;
    if (strlen(msg) % col)
        row += 1;

    char matrix[row][col];

    for (int i = 0, k = 0; i < row; i++)
    {
        for (int j = 0; j < col;)
        {
            if (msg[k] == '\0')
            {
                // Adding the padding character '_'
                matrix[i][j] = '_';
                j++;
            }

            if (isalpha(msg[k]) || msg[k] == ' ')
            {
                // Adding only space and alphabet into matrix
                matrix[i][j] = msg[k];
                j++;
            }
            k++;
        }
    }

    printf("Rail Fence Matrix:\n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("%c ", matrix[i][j]);
        }
        printf("\n");
    }
}

// Encryption
void encryptMessage(char msg[], char key[], char cipher[])
{
    int row, col, j;
    int keyMap[256] = {0};

    int key_len = strlen(key);
    setPermutationOrder(key, keyMap, key_len);

    // Calculate column of the matrix
    col = key_len;

    // Calculate Maximum row of the matrix
    row = strlen(msg) / col;
    if (strlen(msg) % col)
        row += 1;

    char matrix[row][col];

    for (int i = 0, k = 0; i < row; i++)
    {
        for (int j = 0; j < col;)
        {
            if (msg[k] == '\0')
            {
                // Adding the padding character '_'
                matrix[i][j] = '_';
                j++;
            }

            if (isalpha(msg[k]) || msg[k] == ' ')
            {
                // Adding only space and alphabet into matrix
                matrix[i][j] = msg[k];
                j++;
            }
            k++;
        }
    }

    int index = 0;
    for (int l = 0, j; l < key_len;)
    {
        j = keyMap[l++];
        for (int i = 0; i < row; i++)
        {
            if (isalpha(matrix[i][j]) || matrix[i][j] == ' ' || matrix[i][j] == '_')
                cipher[index++] = matrix[i][j];
        }
    }
    cipher[index] = '\0';
}

// Driver Program
int main()
{
    // Message
    char msg[MAX_LEN];
    printf("Enter plaintext: ");
    fgets(msg, sizeof(msg), stdin);
    msg[strcspn(msg, "\n")] = '\0'; // Remove trailing newline

    // Keyword
    char key[MAX_LEN];
    printf("Enter keyword: ");
    fgets(key, sizeof(key), stdin);
    key[strcspn(key, "\n")] = '\0'; // Remove trailing newline

    // Print the Rail Fence Matrix
    printMatrix(msg, key);

    // Print the key in number format
    int keyMap[256] = {0};
    int key_len = strlen(key);
    setPermutationOrder(key, keyMap, key_len);
    printf("Key in number format: ");
    for (int i = 0; i < key_len; i++)
    {
        printf("%d ", keyMap[i]);
    }
    printf("\n");

    // Encryption
    char cipher[MAX_LEN];
    encryptMessage(msg, key, cipher);
    printf("Encrypted Message: %s\n", cipher);

    return 0;
}
