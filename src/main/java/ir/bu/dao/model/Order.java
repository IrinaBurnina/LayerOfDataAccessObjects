package ir.bu.dao.model;

public class Order {
   private final int id;
   private final String data;
    private final int customerId;
    private final  String productName;

    public Order(int id, String data, int customerId, String productName) {
        this.id = id;
        this.data = data;
        this.customerId = customerId;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", customerId=" + customerId +
                ", productName='" + productName + '\'' +
                '}';
    }
}
