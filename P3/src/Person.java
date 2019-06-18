public class Person {
    private String name;
    private String address;
    private String phone_number;
    private String mail_address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getMail_address() {
        return mail_address;
    }

    public void setMail_address(String mail_address) {
        this.mail_address = mail_address;
    }

    public Person(String name, String address, String phone_number, String mail_address) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.mail_address = mail_address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "人名='" + name + '\'' +
                " 类别名=Person" +
                '}';
    }
}
