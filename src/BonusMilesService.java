public class BonusMilesService {
    public int calculate(int cost) {
        int milePrice = 20;
        int totalMiles = cost / milePrice;
        return totalMiles;
    }
}