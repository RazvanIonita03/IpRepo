package ClassFaraIA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClasaFaraIA {
    public static void main(String[] args) {
        ClasaFaraIA outer = new ClasaFaraIA();
        Database db = outer.new Database();
        db.createAccount("Razvan", "parolaSuperSecreta");
        db.connectUser("Razvan",
        "parolaSuperSecreta");
        db.addProduct("Razvan", "mere", 10);
        db.addProduct("Razvan", "pere", 20);
        db.addProduct("Razvan", "banane", 30);
        db.getProducts("Razvan");
    }
    public class Database {
        private HashMap<String, Boolean> connected = new HashMap<String, Boolean>();
        private HashMap<String, String> users = new HashMap<String, String>();
        private HashMap<String, List<Produce>> products = new HashMap<String, List<Produce>>();
        public Database () {
            products.put("default_user", new ArrayList<>() );
        }
        public void createAccount(String username,String password) {
            if(users.containsKey(username)) return;
            users.put(username, password);
            products.put(username, new ArrayList<>());
        }
        public void connectUser(String username, String password) {
            if(users.containsKey(username) && users.get(username).equals(password)){
                connected.put(username, true);
            }
            return;
        }
        public void addProduct(String username, String name, int price) {
            if(connected.get(username) == true){
                List<Produce> userProducts = products.get(username);
                List<Produce> newProducts = new ArrayList<>();
                newProducts.addAll(userProducts);
                newProducts.add(new Produce(name, price));
                products.put(username, newProducts);
            }
            else return;
        }
        public void addMultipleProducts(String username, List<Produce> newProduces) {
            if(connected.get(username) == false) return;
            List<Produce> userProducts = products.get(username);
            userProducts.addAll(newProduces);
            products.put(username, newProduces);
        }
        public void removeProduct(String username, String name) {
            if(connected.get(username) == false) return;
            List<Produce> userProducts = products.get(username);
            List<Produce> newProducts = new ArrayList<>();
            for(Produce p : userProducts) {
                if(p.getName().equals(name)) continue;
                newProducts.add(p);
            }
            products.put(username, newProducts);
        }
        public void removeMultipleProducts(String username, List<Produce> producesToBeRemoved) {
            if(connected.get(username) == false) return;
            List<Produce> userProducts = products.get(username);
            List<Produce> newProducts = new ArrayList<>();
            for(Produce p : userProducts) {
                if(producesToBeRemoved.contains(p)) continue;
                newProducts.add(p);
            }
            products.put(username, newProducts);
        }
        public void getProducts(String name) {
            if(connected.get(name) == false) return;
            List<Produce> userProducts = products.get(name);
            for(Produce p : userProducts) {
                System.out.println(p.getName() + " " + p.getPrice());
            }
        }
    }
    public class Produce {
        private String name;
        private int price;
        public Produce () {}
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
        public void decreasePrice(int amount) {
            price -= amount;
        }

    }
}