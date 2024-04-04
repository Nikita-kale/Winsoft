import java.util.HashMap;
import java.util.Map;

class CountNum {

    public static void main(String[] args)

    {
        System.out.println("Count of number of words in string: ");
        String str = "India is my country";
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {
            Integer integer = hashMap.get(word);
            if (integer == null)

                hashMap.put(word, 1);
            else {

                hashMap.put(word, integer + 1);

            }

        }

        System.out.println(hashMap);

    }
}