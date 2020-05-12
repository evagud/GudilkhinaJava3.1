public class Main {
    public static void main(String[] args) {
        int TicketPrice = 700_000;
        short BehindEveryRub = 20;
        int BonusMiles = (TicketPrice / BehindEveryRub);
        short limit = 32_000;
        if (BonusMiles > limit) {
            BonusMiles = limit;
        }
        System.out.println(BonusMiles);
    }
}
