import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 16.4.2016 г..
 */
public class Problem4_Events {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = sc.nextInt();
        sc.nextLine();
        Pattern patt = Pattern.compile("^#([a-zA-Z]+): *@([a-zA-Z]+) *([0-9]:[0-5][0-9]|2[0-3]:[0-5][0-9]|[0-1][0-9]:[0-5][0-9])$");
        TreeMap<String, TreeMap<String, List<String>>> data = new TreeMap<>();

        for (int i = 0; i < attempts; i++) {
            String info = sc.nextLine();
            Matcher matcher = patt.matcher(info);
            if (matcher.find()) {
                String name = matcher.group(1);
                String city = matcher.group(2);
                String time = matcher.group(3);
                if (!data.containsKey(city)) {
                    data.put(city, new TreeMap<>());
                    data.get(city).put(name, new ArrayList<>());
                    data.get(city).get(name).add(time);
                } else {
                    if (!data.get(city).containsKey(name)) {
                        data.get(city).put(name, new ArrayList<>());
                        data.get(city).get(name).add(time);
                    } else {
                        data.get(city).get(name).add(time);
                    }
                }

            }
        }

        List<String> output = Arrays.asList(sc.nextLine().split(","));
        for (Map.Entry<String, TreeMap<String, List<String>>> entrys : data.entrySet()) {
            if (output.contains(entrys.getKey())) {
                System.out.println(entrys.getKey() + ":");
                int count = 1;
                for (Map.Entry<String, List<String>> listEntrys : entrys.getValue().entrySet()) {
                    System.out.printf("%d. %s -> ", count, listEntrys.getKey());
                    List<String> copy = listEntrys.getValue();
                    Collections.sort(copy);
                    System.out.println(String.join(", ", copy));
                    count++;
                }
            }
        }

    }
}
