public class PanagramCheck {
    // returns true if sentence is a pangram, or false otherwise.
    private static boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for (char ch: sentence.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(s));
    }
}

/*
Constraints:
------------
1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
 */