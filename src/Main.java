import data_source.SetDataSource;
import task_01.ProductsSet;
import task_02.ProductsSetExtendedVersion;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//task 1
        System.out.println("\nЗадание 1");
        ProductsSet productsSet = new ProductsSet(new SetDataSource(new HashSet<>()).createSet());

        System.out.println("Перечень создан!\n");
        productsSet.showProductSet();

        System.out.print(productsSet.addProduct());
        System.out.print(productsSet.showProductSet());

//task 2
        System.out.println("\nЗадание 2");
        ProductsSetExtendedVersion productsSetExtendedVersion =
                new ProductsSetExtendedVersion(new SetDataSource(new HashSet<>()).createSet());

        System.out.println("Перечень создан!\n");
        productsSetExtendedVersion.showProductSet();

        System.out.print(productsSetExtendedVersion.deleteProduct());
        System.out.print(productsSetExtendedVersion.showProductSet());

    }
}