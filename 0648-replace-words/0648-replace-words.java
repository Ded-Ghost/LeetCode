class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> roots = new HashSet<>(dictionary);
        StringBuilder result = new StringBuilder();

        for (String word : sentence.split(" ")) {
            String root = "";

            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);

                if (roots.contains(prefix)) {
                    root = prefix;
                    break;
                }
            }

            if (result.length() > 0) {
                result.append(" ");
            }

            result.append(root.isEmpty() ? word : root);
        }

        return result.toString();
    }
}