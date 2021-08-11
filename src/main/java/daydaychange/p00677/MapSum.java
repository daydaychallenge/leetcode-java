package daydaychange.p00677;

/**
 * https://leetcode.com/problems/map-sum-pairs/
 * 677. Map Sum Pairs
 * Implement the MapSum class:
 *
 * MapSum() Initializes the MapSum object.
 * void insert(String key, int val) Inserts the key-val pair into the map. If the key already existed,
 * the original key-value pair will be overridden to the new one.
 * int sum(string prefix) Returns the sum of all the pairs' value whose key starts with the prefix.
 *
 *
 * Example 1:
 *
 * Input
 * ["MapSum", "insert", "sum", "insert", "sum"]
 * [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
 * Output
 * [null, null, 3, null, 5]
 *
 * Explanation
 * MapSum mapSum = new MapSum();
 * mapSum.insert("apple", 3);
 * mapSum.sum("ap");           // return 3 (apple = 3)
 * mapSum.insert("app", 2);
 * mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
 *
 *
 * Constraints:
 *
 * 1 <= key.length, prefix.length <= 50
 * key and prefix consist of only lowercase English letters.
 * 1 <= val <= 1000
 * At most 50 calls will be made to insert and sum.
 */
public class MapSum {

    private final TrieNode trieNode = new TrieNode();

    /** Initialize your data structure here. */
    public MapSum() {}

    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        int sum = mapSum.sum("ap");
        mapSum.insert("app", 3);
        int sum1 = mapSum.sum("ap");
        System.out.println(sum);
        System.out.println(sum1);
    }

    public void insert(String key, int val) {
        trieNode.insert(key, val);
    }

    public int sum(String prefix) {
        return trieNode.search(prefix);
    }

    static class TrieNode {
        private int value;
        private final TrieNode[] children;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.value = 0;
        }

        public void insert(String key, int val) {
            TrieNode node = this;
            for (int i = 0; i < key.length(); i ++) {
                if (node.children[key.charAt(i) - 'a'] == null) {
                    node.children[key.charAt(i) - 'a'] = new TrieNode();
                }
                node = node.children[key.charAt(i) - 'a'];
            }
            node.value = val;
        }

        public int search(String prefix) {
            char[] chars = prefix.toCharArray();
            TrieNode node = this;
            for (char c : chars) {
                node = node.children[c - 'a'];
                if (node == null) return 0;
            }
            return node.calculateSum();
        }

        private int calculateSum() {
            int sum = value;
            for (TrieNode node : children) {
                if (node != null) sum += node.calculateSum();
            }
            return sum;
        }

    }

}
