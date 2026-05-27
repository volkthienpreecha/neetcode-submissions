class Solution {
    public boolean isAnagram(String s, String t) {
    Map<Character, Integer> freq1 = new HashMap<>();
    Map<Character, Integer> freq2 = new HashMap<>();  

    for (int i = 0; i < s.length(); i++){
        if(!freq1.containsKey(s.charAt(i))) {
            freq1.put(s.charAt(i), 1); 
        } else {
            freq1.put(s.charAt(i), freq1.get(s.charAt(i)) + 1); 
        }
    }

     for (int i = 0; i < t.length(); i++){
         if(!freq2.containsKey(t.charAt(i))) {
            freq2.put(t.charAt(i), 1); 
        } else {
            freq2.put(t.charAt(i), freq2.get(t.charAt(i)) + 1); 
        }

    }

    return (freq1.equals(freq2)); 






    }
}
