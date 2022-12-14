package basicprac;

//time complexity of hashtable is O(1).
public class HashTable {
    private HashNode[] buckets;
    int noOfBuckets;//capacity
    int size;// number of hashnodes in hashtable

    public HashTable(int capacity) {
        this.noOfBuckets = capacity;
        this.buckets = new HashNode[noOfBuckets];
        this.size = 0;
    }


    private class HashNode {
        private Integer key;
        private String value;
        private HashNode next;//reference to next HashNode

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) {

        if (key == null || value == null) {
            throw new IllegalArgumentException();
        }

        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);//key value nect is null
        node.next = head;
        buckets[bucketIndex] = node;
    }

    //modular hash function as it is using modulos operator
    public int getBucketIndex(int key) {
        return key % noOfBuckets;
    }


    public String get(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];//starting node of the list of hashnodes which willbe head
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }

            head = head.next;
        }


        return null;//if key not present in hashtable
    }

    public String remove(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("Key is null");

        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            previous = head;
            head = head.next;

        }
        if (head == null) {
            return null;
        }
        size--;
        if (previous != null) {
            previous.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }
        return head.value;

    }


    public static void main(String args[]) {
        HashTable table = new HashTable(10);
        System.out.println(table.size());
        table.put(105, "Tom");
        table.put(21, "Sana");
        table.put(21, "Harry");
        table.put(31, "Dinesh");
        System.out.println(table.size());
        System.out.println(table.get(105));
        System.out.println(table.get(21));
        System.out.println(table.get(31));
        System.out.println(table.get(90));
        System.out.println(table.remove(21));
        System.out.println(table.remove(31));
        System.out.println(table.size());

    }

}
