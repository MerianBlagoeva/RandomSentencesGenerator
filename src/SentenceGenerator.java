import java.util.Random;
import java.util.Scanner;

public class SentenceGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Merry", "Peter", "Jane", "Steve", "George" };
        String[] places = {"Sofia", "London", "Montana", "Paris" };
        String[] verbs = {"eats", "holds", "looks for", "gets", "makes" };
        String[] nouns = {"ice cream", "something", "drugs", "money", "croissants" };
        String[] adverbs = {"slowly", "happily", "calmly", "sadly", "rapidly" };
        String[] details = {"at work", "at home", "in the park", "in the lobby", "in the bus", "at the beach", "in the morning",
                "at lunch", "on Friday night", "at the gym", "on Christmas", "on his birthday", "at McDonald's", "in the cinema", "in the church" };

        System.out.println("Hello, this is your first random-generated sentence: ");
        while (true) {
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetail = getRandomWord(details);
            System.out.printf("%s from %s %s %s %s %s %n", randomName, randomPlace, randomAdverb, randomVerb, randomNoun, randomDetail);
            System.out.println("Click [Enter] to generate a new one.");
            String input = sc.nextLine();
            if (!input.equals("")) {
                break;
            }

        }


    }

    public static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}
