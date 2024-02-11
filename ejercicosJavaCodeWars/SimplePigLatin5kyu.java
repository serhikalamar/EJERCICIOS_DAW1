public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (Character.isLetter(words[i].charAt(0))) {
                char firstChar = words[i].charAt(0);
                words[i] = words[i].substring(1) + firstChar + "ay";
            }
        }
        return String.join(" ", words);
    }
}