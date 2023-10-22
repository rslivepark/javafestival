public class Ex14 {
    public static void main(String[] args) {
        String word1 = "power";
        String word2 = "test";

        String middle1 = getMiddle(word1);
        String middle2 = getMiddle(word2);

        System.out.println("가운데 글자(들) (word1): " + middle1);
        System.out.println("가운데 글자(들) (word2): " + middle2);
    }

    public static String getMiddle(String word) {
        int length = word.length();

        if (length % 2 == 0) {
            // 단어의 길이가 짝수인 경우
            int mid1 = length / 2 - 1;
            int mid2 = length / 2;
            return word.substring(mid1, mid2 + 1);
        } else {
            // 단어의 길이가 홀수인 경우
            int mid = length / 2;
            return word.substring(mid, mid + 1);
        }
    }
}
