package com.multidinamika.javastandard.model;

import java.util.List;

public class Model {
    private static Model model;

    public static Model instance(){
        if (model == null) model = new Model();
        return model;
    }

    public static class CustomerModel {
        public int id;
        public String name;

        public CustomerModel(int id, String name) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "{" + "\"id\":" + id + ", \"name\":\"" + name + '\"' + '}';
        }
    }

    public static class ItemModel {
        public int id, qty, price;
        public String name;

        public ItemModel(int id, String name, int qty, int price) {
            this.price = price;
            this.qty = qty;
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "{" + "\"id\":" + id + ", \"qty\":" + qty + ", \"price\":" + price + ", \"name\":\"" + name + "\"}";
        }
    }

    public static class PurchaseModel {
        public String orderId, createdAt;
        public CustomerModel customer;
        public List<ItemModel> items;

        public PurchaseModel(String orderId, String createdAt, CustomerModel customer, List<ItemModel> items) {
            this.createdAt = createdAt;
            this.orderId = orderId;
            this.customer = customer;
            this.items = items;
        }

        @Override
        public String toString() {
            return "{" + "\"orderId\":\"" + orderId + '\"' + ", \"createdAt\":\"" + createdAt + '\"' + ", \"customer\":" + customer +
                    ", \"items\":" + items + '}';
        }
    }

    public static class ShopModel{
        String name, category;
        String price;

        public ShopModel(String name, String category, String price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }
        @Override
        public String toString() {
            return "{"+
                    "\"name\":\"" + name + '\"' +
                    ",\"category\":\"" + category + '\"' +
                    ",\"price\":" + price +
                    '}';
        }
    }
}
