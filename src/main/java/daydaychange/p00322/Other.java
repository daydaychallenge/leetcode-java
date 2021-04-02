package daydaychange.p00322;

public class Other {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int k = arr.length / 2;
        int start = 0;
        while (k > 0) {
            for (int i = start; i < arr.length / 2; i ++) {
                int tmp = arr[i];
                int index = (i + k) % arr.length;
                arr[i] = arr[index];
                arr[index] = tmp;
            }
            k --;
            start ++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
