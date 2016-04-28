import java.util.*;

/**
 * Created by Niki on 11.4.2016 г..
 */
public class DragonEra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dragonsStart = sc.nextInt();
        sc.nextLine();

        LinkedHashMap<String, List<Integer>> dragons = new LinkedHashMap<>();
        HashMap<String, Integer> dragonsAge = new HashMap<>();
        int currDragon = 1;
        for (int i = 0; i < dragonsStart; i++) {
            int eggs = sc.nextInt();
            sc.nextLine();
            dragons.put(String.format("Dragon_%d", i + 1), new ArrayList<>());
            for (int j = 0; j < eggs; j++) {
                dragons.get(String.format("Dragon_%d", i + 1)).add(0);
            }
            dragonsAge.put(String.format("Dragon_%d", i + 1), 0);
        }

        int years = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < years; i++) {
            String yearType = sc.nextLine();

            if (yearType.equals("Normal")){
                for (Map.Entry<String, List<Integer>> entrys : dragons.entrySet()) {
                    dragonsAge.put(entrys.getKey(), dragonsAge.get(entrys.getKey()) + 1);
                    if (dragonsAge.get(entrys.getKey()) == 3 || dragonsAge.get(entrys.getKey()) == 4) {
                        for (int j = 0; j < entrys.getValue().size(); j++) {
                            if (entrys.getValue().get(j) > 0) {
                                String dragonName = String.format(entrys.getKey() + "/Dragon_" + ParentsCount(entrys.getKey()));
                                dragons.put(dragonName, new ArrayList<>());
                                dragons.get(dragonName).add(0);
                                entrys.getValue().remove(j);
                                dragonsAge.put(dragonName, 0);
                            } else {

                            }
                        }
                    }
                }
            }
        }

        System.out.println(dragons);



        System.out.println(dragons);
    }

    public static int ParentsCount(String str){
        int count = str.length() - str.replace("_", "").length();
        return count + 1;
    }
}
