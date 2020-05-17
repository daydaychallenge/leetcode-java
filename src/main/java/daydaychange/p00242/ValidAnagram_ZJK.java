package daydaychange.p00242;

public class ValidAnagram_ZJK {

    private int[] primes = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67,
            71, 73, 79, 83, 89, 97, 101
    };

    /**
     * 如果超出了long的取值范围， 就会出现问题
     * @return
     */
    public boolean isAnagram1(String s, String t) {
        long hash1 = hash(s);
        long hash2 = hash(t);
        return hash1 == hash2;
    }

    public boolean isAnagram(String s, String t) {

        int[] c1 = new int[256];
        int[] c2 = new int[256];

        for (char c: s.toCharArray()) {
            c1[c]++;
        }
        for (char c: t.toCharArray()) {
            c2[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }

    private long hash(String s) {
        if (s == null || s.length() == 0) return 0;
        char[] data = s.toCharArray();
        long sum = 1;
        for (char c: data) {
            int index = c - 'a';
            sum *= primes[index];
        }
        return sum;
    }

}
