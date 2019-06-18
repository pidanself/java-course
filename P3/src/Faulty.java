public class Faulty extends Employee {
    private String workTime;

    @Override
    public String toString() {
        return "Faulty{" +
                "name='" + this.getName() + '\'' +
                "类别名：Faulty"+
                '}';
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    private int rank;

    public Faulty(String name, String address, String phone_number, String mail_address, String room, long salary, MyDate sday, String workTime, int rank) {
        super(name, address, phone_number, mail_address, room, salary, sday);
        this.workTime = workTime;
        this.rank = rank;
    }
}
