import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MugProduction {
    private Deque<Mug> mugs = new ArrayDeque<>();

    public void addMug(Mug mug) {
        mugs.offerFirst(mug);
    }

    public void getMug() {
        System.out.println(mugs.pollLast());
    }

    public void displayAllMugs() {
        for (Mug mug : mugs) {
            System.out.println(mug);
        }
    }
}
