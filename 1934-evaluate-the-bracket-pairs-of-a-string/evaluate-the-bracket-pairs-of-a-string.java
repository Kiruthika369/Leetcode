class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int i = 0;
        int j = i;
        Map<String, String> mp = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        knowledge.forEach(a -> {
            mp.put(a.get(0), a.get(1));
        });
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                j = i + 1;
                String key = "";
                String value = "?";
                while (s.charAt(j) != ')') {
                    key += s.charAt(j);
                    j++;
                }
                ans.append(mp.getOrDefault(key.toString(), "?"));
                i = j + 1;
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();

    }
}