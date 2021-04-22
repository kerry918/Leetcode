class Solution {
public:
  int countPrimes(int n) {
    // base case
    if (n<=2) return 0; 
    // initialize a vector to store either a number is prime or not
    vector<bool> prime (n, true); 
    // intialize the counter to track the prime
    int count = n - 2; // remove 1 (not prime)
    // loop until the number to check
    for (int i = 2; i < n; i++){
      // only if the number is prime
      if (prime[i]){
        // set the number to not prime (for every multiple)
        for(int j = 2*i; j < n; j += i){
          if (prime[j]){
            prime[j] = false; 
            --count; 
          }
        }
      }
    }
    return count; 
  }
};