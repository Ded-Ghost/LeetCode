class Solution {
    public char processStr(String s, long k) {

        long len = 0;

        // Forward Pass:
        // Calculate the final length without actually building the string.
        for (char ch : s.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                len++;
            }
            else if (ch == '*') {
                if (len > 0) {
                    len--;
                }
            }
            // Duplicate the current string.
            else if (ch == '#') {
                len *= 2;
            }
            // '%' only reverses the string, length remains unchanged.
        }

        // k is outside the final string.
        if (k >= len) {
            return '.';
        }

        // Backward Pass:
        // Trace the k-th character back through the operations.
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            // Undo deletion.
            if (ch == '*') {
                len++;
            }

            // Undo duplication.
            else if (ch == '#') {

                len /= 2;

                // If k lies in the duplicated half,
                // map it back to the corresponding index
                // in the original half.
                if (k >= len) {
                    k -= len;
                }
            }

            // Undo reverse.
            else if (ch == '%') {

                // Index mapping after reverse:
                // k -> len - 1 - k
                k = len - k - 1;
            }

            else {

                // Current character was appended
                // at index (len - 1).
                len--;

                if (len == k) {
                    return ch;
                }
            }
        }

        return '.';
    }
}