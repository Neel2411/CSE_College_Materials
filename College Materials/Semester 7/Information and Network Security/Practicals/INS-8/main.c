#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
    long long int prime, primitive_root, private_key_A, private_key_B;

    printf("Enter a prime number (shared): ");
    scanf("%lld", &prime);

    printf("Enter a primitive root modulo %lld (shared): ", prime);
    scanf("%lld", &primitive_root);

    printf("Enter private key for User A: ");
    scanf("%lld", &private_key_A);

    printf("Enter private key for User B: ");
    scanf("%lld", &private_key_B);

    // Calculate public keys using pow() function
    long long int public_key_A = fmod(pow(primitive_root, private_key_A), prime);
    long long int public_key_B = fmod(pow(primitive_root, private_key_B), prime);

    // Shared secret key calculation
    long long int secret_key_A = fmod(pow(public_key_B, private_key_A), prime);
    long long int secret_key_B = fmod(pow(public_key_A, private_key_B), prime);

    printf("\nPublic Key for User A: %lld\n", public_key_A);
    printf("Public Key for User B: %lld\n", public_key_B);
    printf("Shared Secret Key for User A: %lld\n", secret_key_A);
    printf("Shared Secret Key for User B: %lld\n", secret_key_B);

    if (secret_key_A == secret_key_B) {
        printf("\nShared secret keys match. Secure communication established!\n");
    } else {
        printf("\nShared secret keys do not match. Secure communication failed.\n");
    }

    return 0;
}
