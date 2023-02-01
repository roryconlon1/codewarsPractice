import java.util.Collections;
import java.util.List;

public class HackerRank {

    public HackerRank() {
    }

    public static int groupDivision(List<Integer> levels, int maxSpread) {
        Collections.sort(levels);
        int count = 0;
        int storedVal = levels.get(0);
        System.out.println(levels);

        for (int i = 0; i < levels.size(); i++) {
            if (storedVal == levels.get(i)) {
                storedVal = levels.get(i);
            } else if (levels.get(i) >= (storedVal + maxSpread) || levels.get(i) <= (storedVal - maxSpread)) {
                count += 1;
                storedVal = levels.get(i);
            }
        }
        return count;
    }
}
