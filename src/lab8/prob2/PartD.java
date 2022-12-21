package lab8.prob2;

import lab8.prob2.domain_usecase.Product;
import lab8.prob2.domain_usecase.SortByMethod;

import java.util.ArrayList;
import java.util.List;

import static lab8.prob2.domain_usecase.SortByMethod.BY_PRICE;
import static lab8.prob2.domain_usecase.SortByMethod.BY_TITLE;

public class PartD {

    public void sort(List<Product> products, final SortByMethod sortBy) {
        products.sort((p1, p2) -> {
            if (sortBy.equals(BY_PRICE))
                return Double.compare(p1.getPrice(), p2.getPrice());
            else {
                int result = p1.getTitle().compareTo(p2.getTitle());
                if (result == 0) {
                    return Integer.compare(p1.getModel(), p2.getModel());
                }
                return result;
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("LAB # 8 ------- Problem # 2");

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Car", 4000.0, 13));
        productList.add(new Product("Bike", 1000.0, 14));
        productList.add(new Product("Truck", 7000.0, 15));
        productList.add(new Product("Aeroplane", 10000.0, 15));
        productList.add(new Product("Aeroplane", 10000.0, 10));

        System.out.println("\n***** PART # D - One Comparator Using Lambda *****");
        PartD obj = new PartD();

        System.out.println("\n***** BY_PRICE *****");
        obj.sort(productList, BY_PRICE);
        System.out.println(productList);

        System.out.println("\n***** BY_TITLE *****");
        obj.sort(productList, BY_TITLE);
        System.out.println(productList);
    }
}
