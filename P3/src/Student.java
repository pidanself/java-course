public class Student extends Person {
    final private String status;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.getName() + '\'' +
                "类别名：Staff"+
                '}';
    }

    public String getStatus() {
        return status;
    }

    public Student(String name, String address, String phone_number, String mail_address, String status) {
        super(name, address, phone_number, mail_address);
        this.status = status;
    }
}
