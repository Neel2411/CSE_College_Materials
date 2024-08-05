#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Function to calculate the greatest common divisor (GCD) of two numbers
long long int gcd(long long int a, long long int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}

// Function to calculate the modular exponentiation (base^exponent % modulus)
long long int mod_pow(long long int base, long long int exponent, long long int modulus) {
    long long int result = 1;
    base = base % modulus;

    while (exponent > 0) {
        if (exponent % 2 == 1) {
            result = (result * base) % modulus;
        }
        base = (base * base) % modulus;
        exponent = exponent / 2;
    }

    return result;
}

int main() {
    long long int p, q, n, phi_n, e, d;
    long long int message, encrypted, decrypted; // Declare message, encrypted, and decrypted as long long int

    // Input prime numbers p and q
    printf("Enter first prime number p: ");
    scanf("%lld", &p);
    printf("Enter second prime numbers q: ");
    scanf("%lld", &q);

    // Calculate n and phi(n)
    n = p * q;
    printf("The value of n: %lld\n", n);
    phi_n = (p - 1) * (q - 1);
    printf("The value of phi_n: %lld\n", phi_n);

    // Choose a public key 'e' such that 1 < e < phi(n) and gcd(e, phi(n)) = 1
    printf("Enter a public key (e): ");
    scanf("%lld", &e);

    if (e < 2 || e >= phi_n || gcd(e, phi_n) != 1) {
        printf("Invalid public key 'e'.\n");
        return 1;
    }


    // Calculate the private key 'd' using the formula d = (1 + k * phi(n)) / e
    long long int k = 1;
    d = (1 + k * phi_n) / e;

    while ((1 + k * phi_n) % e != 0) {
        k++;
        d = (1 + k * phi_n) / e;
    }

    printf("The value of d: %lld\n", d);

    printf("Enter a message to encrypt (numeric form): ");
    scanf("%lld", &message); // Read a long long integer

    // Encrypt the message
    encrypted = mod_pow(message, e, n);

    printf("Encrypted message: %lld\n", encrypted);

    // Decrypt the message
    decrypted = mod_pow(encrypted, d, n);

    printf("Decrypted message: %lld\n", decrypted);

    return 0;
}
