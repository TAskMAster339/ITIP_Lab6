import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        String filePath = "./text.txt";
        File file = new File(filePath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Map<String, Integer> map = new HashMap<>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > 0) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            scanner.close();

            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

            list.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())); //e1, e2 - не убывание, e2, e1 - не возрастание

            for (int i = 0; i < 10; i++) {
                var item = list.get(i);
                System.out.println("№" + (i + 1) + " -> " + item.getKey() + ": " + item.getValue());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}