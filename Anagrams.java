import java.util.*;

class Anagrams
 {
    public static void main(String[] args) 
    {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for (String word : strs)
       {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);                
            String key = new String(chars);   
           
            if (!map.containsKey(key)) 
            {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        
        
        System.out.println(new ArrayList<>(map.values()));
    }
}