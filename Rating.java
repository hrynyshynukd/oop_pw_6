import java.util.*;

public class Rating {
    private List<Integer> ratings = new ArrayList<>();

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        }
    }

    public double getAverage() {
        if (ratings.isEmpty()) return 0;
        return ratings.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}