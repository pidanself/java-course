public class Employee extends Person {
    private String room;
    private long salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.getName() + '\'' +
                "类别名：Staff"+
                '}';
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public MyDate getSday() {
        return sday;
    }

    public void setSday(MyDate sday) {
        this.sday = sday;
    }

    MyDate sday;

    public Employee(String name, String address, String phone_number, String mail_address, String room, long salary, MyDate sday) {
        super(name, address, phone_number, mail_address);
        this.room = room;
        this.salary = salary;
        this.sday = sday;
    }
}
