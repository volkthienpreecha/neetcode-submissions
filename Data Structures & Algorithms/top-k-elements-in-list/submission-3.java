class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>(); 

        for (int i : nums) {
            if (!freq.containsKey(i)) {
                freq.put(i, 1);
            } else {
                freq.put(i, freq.get(i)+1);
            }
        }

            int[] result = new int[k]; 
            for (int j = 0; j < k; j++) {
                int maxKey = 0;
                int maxValue = 0; 

                for (int key : freq.keySet()) {
                    int count = freq.get(key); 
                    if (count > maxValue) {
                        maxKey = key;
                        maxValue = count; 
                    }
                }

                result[j] = maxKey; 
                freq.remove(maxKey);
            }
            return result; 
        }
    }
