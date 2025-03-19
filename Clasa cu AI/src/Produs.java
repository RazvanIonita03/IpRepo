/**
 * Clasa Produs reprezintă un produs din sistemul eMAG
 * Implementează principiile de bază OOP: încapsulare, abstractizare
 */
public class Produs {
    // Atribute private pentru a asigura încapsularea
    private String cod;
    private String nume;
    private String descriere;
    private double pret;
    private int stoc;
    private String categorie;
    private boolean inOferta;
    private double procentReducere;

    /**
     * Constructor pentru inițializarea unui produs nou
     * @param cod Codul unic al produsului
     * @param nume Numele produsului
     * @param descriere Descrierea detaliată a produsului
     * @param pret Prețul inițial al produsului
     * @param stoc Cantitatea disponibilă în stoc
     * @param categorie Categoria din care face parte produsul
     */
    public Produs(String cod, String nume, String descriere, double pret, int stoc, String categorie) {
        this.cod = cod;
        this.nume = nume;
        this.descriere = descriere;
        this.pret = pret;
        this.stoc = stoc;
        this.categorie = categorie;
        this.inOferta = false;
        this.procentReducere = 0.0;
    }

    // Metode getter și setter pentru a respecta principiul încapsulării
    public String getCod() {
        return cod;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        if (pret >= 0) {
            this.pret = pret;
        } else {
            throw new IllegalArgumentException("Prețul nu poate fi negativ");
        }
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        if (stoc >= 0) {
            this.stoc = stoc;
        } else {
            throw new IllegalArgumentException("Stocul nu poate fi negativ");
        }
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public boolean isInOferta() {
        return inOferta;
    }

    public double getProcentReducere() {
        return procentReducere;
    }

    /**
     * Metodă care aplică o reducere la prețul produsului
     * @param procentReducere Procentul de reducere (0-100)
     * @return Noul preț după aplicarea reducerii
     * @throws IllegalArgumentException dacă procentul de reducere nu este valid
     */
    public double aplicaReducere(double procentReducere) {
        if (procentReducere < 0 || procentReducere > 100) {
            throw new IllegalArgumentException("Procentul de reducere trebuie să fie între 0 și 100");
        }

        this.procentReducere = procentReducere;
        this.inOferta = (procentReducere > 0);

        // Calculăm noul preț
        double pretRedus = pret - (pret * procentReducere / 100);
        return pretRedus;
    }

    /**
     * Verifică dacă produsul este disponibil în stoc
     * @return true dacă produsul este disponibil, false în caz contrar
     */
    public boolean esteDisponibil() {
        return stoc > 0;
    }

    /**
     * Metodă pentru actualizarea stocului după o vânzare
     * @param cantitate Cantitatea vândută
     * @return Stocul rămas după vânzare
     * @throws IllegalArgumentException dacă cantitatea nu este validă
     */
    public int actualizeazaStocDupaVanzare(int cantitate) {
        if (cantitate <= 0) {
            throw new IllegalArgumentException("Cantitatea vândută trebuie să fie pozitivă");
        }

        if (cantitate > stoc) {
            throw new IllegalArgumentException("Stoc insuficient. Disponibil: " + stoc);
        }

        stoc -= cantitate;
        return stoc;
    }

    /**
     * Returnează informații despre produs sub formă de string
     * @return String cu informațiile principale despre produs
     */
    @Override
    public String toString() {
        String statusOferta = inOferta ? " (REDUCERE " + procentReducere + "%)" : "";
        return "Produs: " + nume + statusOferta +
                "\nCod: " + cod +
                "\nCategorie: " + categorie +
                "\nPreț: " + pret + " RON" +
                "\nStoc: " + stoc +
                "\nDescriere: " + descriere;
    }

    /**
     * Clasă principală pentru a demonstra funcționalitatea clasei Produs
     */
    public static void main(String[] args) {
        // Creăm un nou produs
        Produs laptop = new Produs("LP12345", "Laptop Gaming ASUS ROG",
                "Laptop cu procesor Intel i7, 16GB RAM, 1TB SSD, placă video RTX 3080",
                6999.99, 10, "Laptopuri Gaming");

        // Afișăm detaliile produsului inițial
        System.out.println("DETALII INIȚIALE:");
        System.out.println(laptop);

        // Aplicăm o reducere de 15%
        double pretRedus = laptop.aplicaReducere(15);
        System.out.println("\nDUPĂ APLICAREA REDUCERII:");
        System.out.println("Noul preț după reducere: " + pretRedus + " RON");
        System.out.println(laptop);

        // Simulăm o vânzare
        try {
            int stocRamas = laptop.actualizeazaStocDupaVanzare(3);
            System.out.println("\nDUPĂ VÂNZARE:");
            System.out.println("Stoc rămas: " + stocRamas);
            System.out.println(laptop);
        } catch (IllegalArgumentException e) {
            System.out.println("Eroare la vânzare: " + e.getMessage());
        }
    }
}