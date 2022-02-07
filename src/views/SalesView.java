package views;

import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    Product model;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(Product model) {
         this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        Scanner modelName = scanner;
        model.setName(Validator.validateName(modelName));

        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        Scanner quantity = scanner;
        model.setQuantity(Validator.validateQuantityInput(quantity));

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        Scanner price = scanner;
        model.setPrice(Validator.validatePriceInput(price));

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
