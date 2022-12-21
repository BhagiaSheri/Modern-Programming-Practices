package lab8.prob2.partA_and_partB;

import lab8.prob2.domain_usecase.Product;

import java.util.ArrayList;
import java.util.List;

public class PartA_And_PartB_Tester {

    public static void main(String[] args) {
        System.out.println("LAB # 8 ------- Problem # 2");

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Car", 4000.0, 13));
        productList.add(new Product("Bike", 1000.0, 14));
        productList.add(new Product("Aeroplane", 10000.0, 15));

        System.out.println("\n***** PART # A - Comparator for price attribute *****");
        productList.sort(new ProductPriceComparator());
        System.out.println(productList);

        System.out.println("\n***** PART # B - Comparator for title attribute *****");
        productList.sort(new ProductTitleComparator());
        System.out.println(productList);
    }

}
