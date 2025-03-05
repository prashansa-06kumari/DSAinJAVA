public class SquareRoot {
    public static void main(String[] args) {
        Roooot solution = new SquareRoot().new Roooot(); // Create an instance of Solution
        System.out.println(solution.mySqrt(4));  // Output: 2
        System.out.println(solution.mySqrt(8));  // Output: 2
    }

    public class Roooot {
        public int mySqrt(int x) {
            if (x == 0) return 0; // If x is 0, the square root is 0.

            int left = 1, right = x;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                long square = (long) mid * mid; // To prevent overflow

                if (square == x) {
                    return mid; // If we find the exact square root, return mid.
                } else if (square < x) {
                    left = mid + 1; // If mid^2 is smaller than x, we need to check the larger half.
                } else {
                    right = mid - 1; // If mid^2 is larger than x, we need to check the smaller half.
                }
            }

            return right; // The integer square root of x is the largest integer where mid^2 <= x.
        }
    }
}
