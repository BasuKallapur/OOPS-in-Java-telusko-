import java.util.*;

 // Static helper class
class Pair {
    String businessLine;
    String code;

    Pair(String line, String code) {
        this.businessLine = line;
        this.code = code;
    }
}

public class leetcodeEx {
    // Main validation method
    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Set<String> validLines = new HashSet<>(Arrays.asList("grocery", "pharmacy", "electronics", "restaurant"));
        List<Pair> validCoupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (!isActive[i]) continue;
            if (!validLines.contains(businessLine[i])) continue;
            if (code[i].isEmpty()) continue;

            boolean isValid = true;
            for (int j = 0; j < code[i].length(); j++) {
                char ch = code[i].charAt(j);
                if (!Character.isLetterOrDigit(ch) && ch != '_') {
                    isValid = false;
                    break;
                }
            }

            if (!isValid) continue;

            validCoupons.add(new Pair(businessLine[i], code[i]));
        }

        // // Sort by businessLine then code
        // Collections.sort(validCoupons, (a, b) -> {
        //     if (!a.businessLine.equals(b.businessLine)) {
        //         return a.businessLine.compareTo(b.businessLine);
        //     } else {
        //         return a.code.compareTo(b.code);
        //     }
        // });

        Comparator<String> com= new Comparator<String>() {
            public int compare(String )
        };

        Collections.sort(validCoupons, com);

        // Collect only codes
        List<String> result = new ArrayList<>();
        for (Pair p : validCoupons) {
            result.add(p.code);
        }

        return result;
    }

    // Example main method
    public static void main(String[] args) {
        String[] code = {"SAVE20", "", "PHARMA5", "SAVE@20"};
        String[] businessLine = {"restaurant", "grocery", "pharmacy", "restaurant"};
        boolean[] isActive = {true, true, true, true};

        List<String> result = validateCoupons(code, businessLine, isActive);
        System.out.println(result);  // Output: [PHARMA5, SAVE20]
    }
}
