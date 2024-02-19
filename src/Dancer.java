public class Dancer extends Person {
    private String groupName;
    private String name;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.name = name;
        this.groupName = groupName;

    }

    public void dancing() {
        System.out.println(name + " is dancing");
    }

    @Override
    public String toString() {
        return "Dancer: " +
                "\nGroup name:--> " + groupName +
                super.toString();
    }
}

