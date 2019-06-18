public class Staff extends Employee {
    private String position_title;

    public String getPosition_title() {
        return position_title;
    }

    public void setPosition_title(String position_title) {
        this.position_title = position_title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + this.getName() + '\'' +
                "类别名：Staff"+
                '}';
    }

    public Staff(String name, String address, String phone_number, String mail_address, String room, long salary, MyDate sday, String position_title) {
        super(name, address, phone_number, mail_address, room, salary, sday);
        this.position_title = position_title;
    }
}
