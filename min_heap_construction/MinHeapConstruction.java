import java.util.List;

class MinHeapConstruction {

    List<Integer> heap;

    public MinHeapConstruction(List<Integer> heap) {
        this.heap = buildHeap(heap);
    }

    public int peek() {
        return heap.get(0);
    }

    public void insert(int value) {
        heap.add(value);
        siftUp(heap.size() - 1, heap);
    }

    public int remove() {
        int root = heap.get(0);

        heap.set(0, heap.remove(heap.size() - 1));
        siftDown(0, heap);

        return root;
    }

    private List<Integer> buildHeap(List<Integer> heap) {
        int lastParentIndex = (heap.size() - 2) / 2;

        for (int i = lastParentIndex; i >= 0; i--)
            siftDown(i, heap);

        return heap;
    }

    private void siftDown(int parentIndex, List<Integer> heap) {
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        // no children
        if (leftChildIndex >= heap.size())
            return;

        int smallerChildIndex;

        // right child exists and is smaller than left child
        if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(leftChildIndex))
            smallerChildIndex = rightChildIndex;
        else
            smallerChildIndex = leftChildIndex;

        if (heap.get(smallerChildIndex) < heap.get(parentIndex)) {
            swap(parentIndex, smallerChildIndex, heap);
            siftDown(smallerChildIndex, heap);
        }
    }

    private void siftUp(int childIndex, List<Integer> heap) {
        int parentIndex = (childIndex - 1) / 2;

        // haven't reached the root yet and child is smaller than parent
        if (childIndex > 0 && heap.get(childIndex) < heap.get(parentIndex)) {
            swap(childIndex, parentIndex, heap);
            siftUp(parentIndex, heap);
        }
    }

    private void swap(int i, int j, List<Integer> heap) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

}