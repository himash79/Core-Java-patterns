package lk.himash.model;

public class Car {

    private int id;
    private String manufacture;
    private String model;
    private double cost;
    private boolean status;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", status=" + status +
                '}';
    }

    public Car(int id, String manufacture, String model, double cost, boolean status) {
        this.id = id;
        this.manufacture = manufacture;
        this.model = model;
        this.cost = cost;
        this.status = status;
    }

    public Car() {
    }

    public Car(int id, String manufacture, String model) {
        this.id = id;
        this.manufacture = manufacture;
        this.model = model;
    }

    public Car(double cost, boolean status) {
        this.cost = cost;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}