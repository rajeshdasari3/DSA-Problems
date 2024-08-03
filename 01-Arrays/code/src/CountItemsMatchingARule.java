import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {

    // returns the number of items that match the given rule.
    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            default -> 2;
        };

        int count = 0;
        for(List<String> item: items) {
            if (item.get(idx).equals(ruleValue)) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));
        System.out.println(items);
    }
}

/*
Constraints:
---------
1 <= items.length <= 104
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters.
 */