package ExamPrepars;

import java.util.*;

/**
 * Created by Niki on 31.3.2016 г..
 */
public class Problem4_ChampionsLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String,Integer> score = new TreeMap<>();
        HashMap<String, TreeSet<String>> opponents = new HashMap<>();

        String[] data = sc.nextLine().split("( \\| )");
        while (!data[0].equals("stop")){
            String team1 = data[0];
            String team2 = data[1];
            if (!score.containsKey(team1)){
                score.put(team1, 0);
                opponents.put(team1, new TreeSet());
            }
            if (!score.containsKey(team2)){
                score.put(team2, 0);
                opponents.put(team2, new TreeSet());
            }
            if (winner(data[2], data[3]) == 1){
                score.put(team1, score.get(team1) + 1);
            }else{
                score.put(team2, score.get(team2) + 1);
            }
            opponents.get(team1).add(team2);
            opponents.get(team2).add(team1);

            data = sc.nextLine().split("( \\| )");
        }

        score.entrySet().stream().sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue())).forEach(el -> {
            System.out.println(el.getKey());
            System.out.println("- Wins: " + el.getValue());
            System.out.printf("- Opponents: ");
            TreeSet<String> opp = opponents.get(el.getKey());
            System.out.println(String.join(", ", opp)); ;
        });
    }

    public static int winner(String result1, String result2){
        String[] firstMatch = result1.split("[:]");
        String[] secondMatch = result2.split("[:]");
        int team1Score = Integer.parseInt(firstMatch[0]) + Integer.parseInt(secondMatch[1]);
        int team2Score = Integer.parseInt(firstMatch[1]) + Integer.parseInt(secondMatch[0]);
        if (team1Score > team2Score){
            return 1;
        }else if (team2Score > team1Score){
            return 2;
        }else  {
            if (Integer.parseInt(firstMatch[1]) > Integer.parseInt(secondMatch[1])){
                return 2;
            }else{
                return 1;
            }
        }
    }
}
