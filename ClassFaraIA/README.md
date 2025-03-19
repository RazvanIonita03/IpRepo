Sumarizarea claselor și funcționalităților
Acest cod Java definește un sistem simplu de gestiune a utilizatorilor și produselor, fără utilizarea AI. Există trei clase principale:

ClasaFaraIA – Clasa principală care conține metoda main(), unde sunt testate funcționalitățile.
Database – Simulează o bază de date pentru gestionarea utilizatorilor și produselor.
Produce – Reprezintă un produs, având atribute precum nume și preț.
1. Clasa Database (simulează baza de date)
Atribute:

users – Stochează utilizatorii și parolele lor.
connected – Ține evidența utilizatorilor conectați.
products – Asociază fiecare utilizator cu o listă de produse.
Metode principale:

createAccount(username, password) – Creează un cont nou.
connectUser(username, password) – Permite autentificarea unui utilizator.
addProduct(username, name, price) – Adaugă un produs în lista unui utilizator conectat.
addMultipleProducts(username, products) – Adaugă mai multe produse simultan.
removeProduct(username, name) – Elimină un produs după nume.
removeMultipleProducts(username, productsToBeRemoved) – Elimină mai multe produse.
getProducts(username) – Afișează toate produsele unui utilizator conectat.
2. Clasa Produce (reprezintă un produs)
Atribute:

name – Numele produsului.
price – Prețul produsului.
Metode:

getName() – Returnează numele produsului.
getPrice() – Returnează prețul produsului.
increasePrice(amount) – Crește prețul produsului.
decreasePrice(amount) – Scade prețul produsului.
