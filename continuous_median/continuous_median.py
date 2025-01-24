import heapq


class ContinuousMedian:
    def __init__(self):
        self.max_heap = []  # for the smaller half
        self.min_heap = []  # for the larger half
        self.median = None

    def get_median(self):
        return self.median

    def insert(self, number):
        if not self.max_heap or number < self.max():
            self.insert_max_heap(number)
        else:
            self.insert_min_heap(number)

        self.rebalance_heaps()
        self.update_median()

    def rebalance_heaps(self):
        if self.rebalancing_is_needed():
            if self.max_heap_size() > self.min_heap_size():
                self.insert_min_heap(self.remove_number_from_max_heap())
            else:
                self.insert_max_heap(self.remove_number_from_min_heap())

    def update_median(self):
        if self.max_heap_size() == self.min_heap_size():
            self.median = (self.max() + self.min()) / 2
        elif self.max_heap_size() > self.min_heap_size():
            self.median = self.max()
        else:
            self.median = self.min()

    def insert_max_heap(self, number):
        heapq.heappush(self.max_heap, -number)

    def insert_min_heap(self, number):
        heapq.heappush(self.min_heap, number)

    def rebalancing_is_needed(self):
        return abs(self.max_heap_size() - self.min_heap_size()) > 1

    def remove_number_from_max_heap(self):
        return -heapq.heappop(self.max_heap)

    def remove_number_from_min_heap(self):
        return heapq.heappop(self.min_heap)

    def max_heap_size(self):
        return len(self.max_heap)

    def min_heap_size(self):
        return len(self.min_heap)

    def max(self):
        return -self.max_heap[0]

    def min(self):
        return self.min_heap[0]
