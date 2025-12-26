package org.skypro.skyshop.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.article.Article;
import org.springframework.stereotype.Service;

@Service
public class StorageService {
    private final Map<UUID, Product> products = new HashMap<>();
    private final Map<UUID, Article> articles = new HashMap<>();

    public StorageService() {
        addTestData();
    }

    private void addTestData() {
        products.put(UUID.randomUUID(), new Product("Молоко") {
            @Override
            public int getPrice() {
                return 60;
            }
        });
        products.put(UUID.randomUUID(), new Product("Яблоко") {
            @Override
            public int getPrice() {
                return 50;
            }
        });


        articles.put(UUID.randomUUID(), new Article("Польза яблок", "Яблоки полезны для здоровья"));
        articles.put(UUID.randomUUID(), new Article("Как выбрать молоко", "Советы по выбору молока в магазине"));
    }

    public Collection<Product> getAllProducts() {
        return products.values();
    }

    public Collection<Article> getAllArticles() {
        return articles.values();
    }
}
