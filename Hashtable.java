#Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

For example, the note is "Attack at dawn". The magazine contains only "attack at dawn". The magazine has all the right words, but there's a case mismatch. The answer is no.
import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
         magazineMap = new HashMap<String, Integer>();
         noteMap = new HashMap<String, Integer>();
        
            for (String word : magazine.split(" ")) {
            Integer i = magazineMap.get(word);
            
            if (i == null) {
                magazineMap.put(word, 1);
            } else {
                magazineMap.put(word, i + 1);
            }
        }
        for (String word : note.split(" ")){
            Integer i = noteMap.get(word);
            if(i == null) {
                noteMap.put(word,1);
           
            }else{
               noteMap.put(word, i + 1); 
            }
        }
        
             
    }
    
   
       
    
    public boolean solve() {
         for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            Integer i = magazineMap.get(entry.getKey());
            
            if (i == null) {
                return false;
            } else {
                if (entry.getValue() > i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
