class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();

        for(char c : s.toCharArray()){
            firstMap.put(c,firstMap.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            secondMap.put(c,secondMap.getOrDefault(c,0)+1);
        }

        return firstMap.equals(secondMap);
    }
}
