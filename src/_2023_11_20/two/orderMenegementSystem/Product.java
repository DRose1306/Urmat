package _2023_11_20.two.orderMenegementSystem;

public class Product {
    //Товар (Product)
    //        Поля: название, цена, количество на складе.
    //        Методы: проверка наличия, обновление количества на складе.
    private String nameOfProduct;
    private double price;
    private int quantity;

    public static boolean availabilityCheck(String nameOfProduct, String[] avaiableGoods) {
        boolean availability = false; // есть сомнения насчет того что нужен ли тут булеан, ведь можно и без. Но для разнообразия взял булеан
        System.out.println("Идет проверка наличия товара");

        for (String avaiableGood : avaiableGoods) {
            if ((nameOfProduct.equals(avaiableGood))) {
                availability = true;
            } else availability = false;
        }
        return availability;
    }

    public static int quantityUpdate(int quantity, String[] listOfOrders, String nameOfProduct){
        int count = 0;
        System.out.println("Проверяем наличие заказов на данный товар");
        for (String order :listOfOrders){
            if (nameOfProduct.equals(order)){
                count++;
            }
        }
        quantity-=count;

        return quantity;
    }
}