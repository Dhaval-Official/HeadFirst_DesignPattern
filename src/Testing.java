import java.util.HashMap;

public class Testing {

    public static void main(String[] args) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        String s = "aaacbbccaabbcccccccccbbaacb";

        int count = 0;
        int max = 0;

        char ch = s.charAt(0);
        char chMax = ch;
        boolean takeNextChar = false;

        for(int i=0;i<s.length();i++) {

            if(hm.containsKey(s.charAt(i))) {
                count = hm.get(s.charAt(i));
                hm.put(s.charAt(i), ++count);
            }

        }

        System.out.println(chMax+" "+max);



    }

}
