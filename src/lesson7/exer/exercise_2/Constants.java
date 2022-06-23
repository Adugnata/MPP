package lesson7.exer.exercise_2;

public enum Constants {
    COMPANY("Microsoft"),
    SALES_TARGET(20000000);
    private long val;
    private String v;

    Constants(long v) {
        val = v;
    }

    Constants(String v) {
        this.v = v;
    }

    public long longv() {
        return this.val;
    }

    public String Stringv() {
        return this.v;
    }
}
