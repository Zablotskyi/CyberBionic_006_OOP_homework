public enum Animals {
    Dog(4),
    Cat(4),
    Bird(1);
    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() +
                " - вік - " + age;
    }
}
