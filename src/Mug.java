public class Mug {
    private String dedication;

    public Mug(String dedication) {
        this.dedication = dedication;
    }

    @Override
    public String toString() {
        return "Mug{" +
                "dedication='" + dedication + '\'' +
                '}';
    }
}
