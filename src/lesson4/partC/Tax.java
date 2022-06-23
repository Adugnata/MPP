package lesson4.partC;

public enum Tax {
    FICA(.23), State(.05), Local(.01), Medicare(.03),
    SocialSecurity(.075);

    private final double v;

    private Tax(double v) {
        this.v = v;
    }

    public double getValue() {
        return v;
    }

}
