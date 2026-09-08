class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            int idx = c - 'a';
            arr[idx]++;
        }

        for(char c : t.toCharArray()){
            int idx = c - 'a';
            arr[idx]--;
        }

        for(int i : arr){
            if(i != 0){
                return false;
            }
        }

        return true;


    }
}
