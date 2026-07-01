class Solution {
    public boolean isAnagram(String s, String t) {
        int count = 0;
        if (s.length() == t.length()) {
            char characters1[] = s.toCharArray();
            char characters2[] = t.toCharArray();
            Arrays.sort(characters1);
            Arrays.sort(characters2);
            for (int i = 0; i < s.length(); i++) {
                if (characters1[i] == characters2[i]) {
                    count++;
                }
            }
            if (count == s.length()) {
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
}
