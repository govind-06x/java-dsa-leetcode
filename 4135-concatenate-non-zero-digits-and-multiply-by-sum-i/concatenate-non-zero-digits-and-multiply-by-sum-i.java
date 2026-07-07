class Solution {
    public long sumAndMultiply(int n) {
         int num = rev(n);
    long val = 0;
    long sum = 0;

    while (num > 0) {
        int dig = num % 10;
        if (dig != 0) {
            val = val * 10 + dig;
            sum += dig;
        }
        num /= 10;
    }

    return val * sum; 
    }
      static int rev(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

}