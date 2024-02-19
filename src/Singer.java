public class Singer extends Person {
    private String bandName;
    private String name;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.name = name;
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(name + " is singing");
    }

    @Override
    public String toString() {
        return "Singer: " +
                "\nBand name:--> " + bandName +
                super.toString();
    }
}

