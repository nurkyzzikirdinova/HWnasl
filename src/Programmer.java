public class Programmer extends Person {
    private String companyName;
    private String name;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.name = name;
        this.companyName = companyName;

    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    @Override
    public String toString() {
        return "Programmer: " +
                "\nCompany name:--> " + companyName +
                super.toString();
    }
}









