package org.example;

import org.example.composite.Component;
import org.example.composite.File;
import org.example.composite.Folder;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("/");
        folder.addChild(new File("Test.java"));
        folder.addChild(new File("config.xml"));

        Folder entities = (Folder) folder.addChild(new Folder("entities"));
        Folder repo = (Folder) folder.addChild(new Folder("repositories"));

        entities.addChild(new File("Product.java"));
        entities.addChild(new File("Category.java"));
        repo.addChild(new File("ProductRepository.java"));
        repo.addChild(new File("CategoryRepository.java"));
        repo.addChild(new Folder("subRepo"));
        folder.print();
    }
}