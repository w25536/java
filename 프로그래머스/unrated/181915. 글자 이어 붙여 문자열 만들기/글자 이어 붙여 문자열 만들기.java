class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        char[] my_stringToCharArr = my_string.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<index_list.length; i++){
            sb.append(my_stringToCharArr[index_list[i]]);    
        }
        
        return sb.toString();
    }
}