public class Customer {


    private String name;
    private String DOB;
    private int identity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }
    public Customer(){}

    public Customer(String name, String DOB, int identity) {
        this.name = name;
        this.DOB = DOB;
        this.identity = identity;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", identity=" + identity +
                '}';
    }

}
