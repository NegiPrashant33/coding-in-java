package array_and_hashing;
/*
    Design HashSet      https://leetcode.com/problems/design-hashset/description/
    Key constraint      0 <= key <= 10^6
*/
public class MyHashSet {
}


// Brute Force Approach

/*
class MyHashSet {
    boolean[] arr;
    public MyHashSet() {
        arr = new boolean[1000001];
    }

    public void add(int key) {
        arr[key] = true;
    }

    public void remove(int key) {
        arr[key] = false;
    }

    public boolean contains(int key) {
        return arr[key];
    }
}
*/