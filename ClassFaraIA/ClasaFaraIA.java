package ClassFaraIA;

import java.util.HashMap;

public class ClasaFaraIA {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    public class Database {
        private HashMap<String, String> users = new HashMap<String, String>();
        private HashMap<String, Produce[]> products = new HashMap<String, Produce[]>();
        public Database() {
            users.put("admin", "admin");
            products.put("default_user", new Produce[] {new Produce("Apple", 10), new Produce("Banana", 5)});
        }
        public boolean checkUser(String username, String password) {
            return users.containsKey(username) && users.get(username).equals(password);
        }
        public Produce[] getProducts(String username) {
            return products.get(username);
        }
        public void addProduct(String username, String name, int price) {
            Produce[] userProducts = products.get(username);
            Produce[] newProducts = new Produce[userProducts.length + 1];
            for (int i = 0; i < userProducts.length; i++) {
                newProducts[i] = userProducts[i];
            }
            newProducts[userProducts.length] = new Produce(name, price);
            products.put(username, newProducts);
        }
    }
    public class Produce {
        private String name;
        private int price;
        public Produce(String name, int price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public int getPrice() {
            return price;
        }
        public void increasePrice(int amount) {
            price += amount;
        }

    }
}