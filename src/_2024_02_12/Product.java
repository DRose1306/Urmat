package _2024_02_12;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public void saveToDatabase() { // saveProduct  методы не static
        // Сохранение товара в базу данных
    }

    public void generateInvoice() {
        // Генерация счета для товара
    }


    public void sendEmailConfirmation() { //sendConfirmation
        // Отправка электронного письма с подтверждением
    }
}

//В общем, важно придерживаться соглашений о структуре кода, таких как соблюдение принципов SOLID и разделение ответственностей.
// Если возможно, разместите методы saveToDatabase, generateInvoice и sendEmailConfirmation в соответствующих классах для
// лучшего соблюдения принципа единственной ответственности.
class DatabaseHandler {
    public void saveToDatabase(Product product) {
        // Логика сохранения товара в базу данных
    }
}

class InvoiceGenerator {
    public void generateInvoice(Product product) {
        // Логика генерации счета для товара
    }
}

class EmailSender {
    public void sendConfirmation(Product product) {
        // Логика отправки электронного письма с подтверждением
    }
}


