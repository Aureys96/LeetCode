package helpers;

class MinHeap {

    private int[] pq; // heap-ordered complete binary tree
    private int N = 0; // in pq[1..N] with pq[0] unused

    public MinHeap(int maxN) {
        pq = new int[maxN];
    }

    public static void main(String[] args) {

    }

    public void insert(int v) {
        pq[++N] = v;
        swim(N);
    }

    public int delMin() {
        int min = pq[0]; // Retrieve max key from top.
        exch(0, N--); // Exchange with last item.
        sink(0); // Restore heap property.
        return min;
    }

    // See pages 145-147 for implementations of these helper methods.
    private void exch(int i, int j) {
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    private boolean less(int i, int j) {
        return pq[i] < pq[j];
    }
}
