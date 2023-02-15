import task_01.ProductsSet;
import task_02.ProductsSetExtendedVersion;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//task 1
        ProductsSet productsSet = new ProductsSet(new HashSet<>());

        System.out.print(productsSet.createSet());
        productsSet.showProductSet();

        System.out.print(productsSet.addProduct());
        System.out.print(productsSet.showProductSet());

//task 2
        ProductsSetExtendedVersion productsSetExtendedVersion = new ProductsSetExtendedVersion(new HashSet<>());

        System.out.print(productsSetExtendedVersion.createSet());
        productsSetExtendedVersion.showProductSet();

        System.out.print(productsSetExtendedVersion.deleteProduct());
        System.out.print(productsSetExtendedVersion.showProductSet());

    }
}