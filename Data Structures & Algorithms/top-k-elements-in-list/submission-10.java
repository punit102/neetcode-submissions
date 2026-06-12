class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // 7:2

        PriorityQueue<Integer> minHeap =
            new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

        for (int key : freqMap.keySet()) {
            minHeap.offer(key);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
