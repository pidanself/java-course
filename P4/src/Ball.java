public class Ball {
    private int id;
    private String Type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Ball() {
        id=1;
        Type="M54";
    }

    public Ball(int id, String type) {
        this.id = id;
        Type = type;
    }

    @Override
    public String toString() {
        return id+"-"+Type;
    }
}
