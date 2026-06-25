class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order #" + orderId + " placed on " + orderDate + " — Status: PENDING";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return super.getOrderStatus()
                .replace("PENDING", "SHIPPED")
                + " | Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return super.getOrderStatus()
                .replace("SHIPPED", "DELIVERED")
                + " | Delivered on: " + deliveryDate;
    }
}

public class OrderManagement {
    public static void main(String[] args) {

        Order o = new Order(101, "2024-01-10");
        ShippedOrder so = new ShippedOrder(102, "2024-01-11", "TRK-98765");
        DeliveredOrder deo = new DeliveredOrder(103, "2024-01-12", "TRK-11111", "2024-01-15");

        System.out.println("--- Plain Order ---");
        System.out.println(o.getOrderStatus());

        System.out.println("\n--- Shipped Order ---");
        System.out.println(so.getOrderStatus());

        System.out.println("\n--- Delivered Order ---");
        System.out.println(deo.getOrderStatus());
    }
}