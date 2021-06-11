package daydaychange.p00697;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, IndexStore> counts = new HashMap<>();
        int count = 0;
        int skips = 0;
        for (int i = 0; i < nums.length; i ++) {
            int ele = nums[i];
            int finalI = i;
            IndexStore store = counts.compute(ele, (k, v) -> {
                if (v == null) {
                    return new IndexStore(finalI, finalI,1);
                }
                v.end = finalI;
                v.count = v.count + 1;
                return v;
            });
            if (store.count > count) {
                skips = store.end - store.start + 1;
                count = store.count;
            } else if (store.count == count) {
                if (skips > store.end - store.start + 1) {
                    skips = store.end - store.start + 1;
                }
            }

        }


//        for (Map.Entry<Integer, IndexStore> entry : counts.entrySet()) {
//            IndexStore store = entry.getValue();
//            if (store.count > count) {
//                 skips = store.end - store.start + 1;
//                 count = store.count;
//            } else if (store.count == count) {
//                if (skips > store.end - store.start + 1) {
//                    skips = store.end - store.start + 1;
//                }
//            }
//        }
        return skips;
    }

    public static void main(String[] args) {
        DegreeOfAnArray d = new DegreeOfAnArray();
        d.findShortestSubArray(new int[]{1,2});
    }

    public static class IndexStore {
        public int start;
        public int end;
        public int count;

        public IndexStore(int start, int end, int count) {
            this.start = start;
            this.end = end;
            this.count = count;
        }
    }

}
