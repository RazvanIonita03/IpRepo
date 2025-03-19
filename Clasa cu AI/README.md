Voi crea o clasă Java inspirată de firma eMAG, urmând principiile programării orientate pe obiecte (OOP). Am ales să modelez un produs din sistemul eMAG, deoarece produsele sunt entități esențiale într-un sistem de e-commerce.

Am creat clasa `Produs` care reprezintă un produs din sistemul eMAG, respectând principiile programării orientate pe obiecte:

### 1. Definirea clasei și atributelor:
- Am definit clasa `Produs` cu mai multe atribute relevante: cod, nume, descriere, preț, stoc, categorie, stare de ofertă și procent de reducere.
- Am aplicat principiul **încapsulării** prin:
  - Definirea atributelor ca private
  - Implementarea metodelor getter și setter corespunzătoare
  - Validarea datelor în setter-uri (exemplu: prețul și stocul nu pot fi negative)

### 2. Implementarea metodelor importante:
- `aplicaReducere()` - aplică o reducere de preț și returnează noul preț
- `esteDisponibil()` - verifică dacă produsul este disponibil în stoc
- `actualizeazaStocDupaVanzare()` - actualizează stocul după o vânzare
- `toString()` - suprascrisă pentru afișarea detaliilor produsului

### 3. Crearea și utilizarea unui obiect:
- În metoda `main()`, am instanțiat un obiect `laptop` de tip `Produs`
- Am demonstrat funcționalitatea prin:
  - Afișarea informațiilor inițiale
  - Aplicarea unei reduceri de 15%
  - Simularea unei vânzări și actualizarea stocului

### Bune practici aplicate:
- Cod structurat clar, cu comentarii explicative în format Javadoc
- Constructor care permite inițializarea tuturor atributelor necesare
- Validări pentru date de intrare
- Tratarea excepțiilor pentru cazurile de eroare
- Metodă `toString()` pentru afișarea informațiilor despre produs

Codul este complet, funcțional și respectă principiile OOP cerute în enunț.

----------------------------------------------------------------------------------

Complexitatea clasei `Produs` create poate fi analizată din mai multe perspective:

### Complexitatea structurală
- **Complexitate moderată**: Clasa conține 8 atribute (cod, nume, descriere, preț, stoc, categorie, inOferta, procentReducere), ceea ce reprezintă o complexitate medie pentru o entitate de business.
- **Încapsulare bună**: Toate atributele sunt private, accesibile doar prin metode getter și setter, ceea ce reduce complexitatea externă (cum este percepută clasa din afară).

### Complexitatea funcțională
- **Metodele de business**: Clasa include trei metode principale de business (`aplicaReducere()`, `esteDisponibil()`, `actualizeazaStocDupaVanzare()`).
- **Complexitate algoritmică**: Metodele implementate au complexitate O(1) - timp constant de execuție, neexistând bucle sau structuri de date complexe.
- **Validări**: Există validări pentru intrările de date în metode și în setters, ceea ce adaugă robustețe dar și ceva complexitate suplimentară.

### Complexitatea ciclomatică
- **Complexitate ciclomatică redusă**: Numărul de căi de execuție independente prin cod este relativ mic.
- Fiecare metodă conține maxim 1-2 decizii (if-uri), ceea ce menține complexitatea ciclomatică scăzută.

### Aspecte OOP
- **Coeziune bună**: Clasa are o responsabilitate clară și bine definită - gestiunea unui produs.
- **Cuplaj scăzut**: Nu există dependențe externe către alte clase (cu excepția claselor standard Java).
- **Extensibilitate**: Clasa este proiectată pentru a putea fi extinsă, deși nu implementează interfețe sau moștenire.

### Evaluare generală
Clasa `Produs` are o complexitate medie, adecvată pentru scopul ei. Este suficient de complexă pentru a modela în mod realist un produs într-un sistem de e-commerce, dar nu este supraîncărcată cu funcționalități inutile. Conceptele OOP sunt aplicate corect, ceea ce face clasa ușor de utilizat, de întreținut și de extins.

Pentru a crește complexitatea, s-ar putea adăuga:
- Relații cu alte clase (de exemplu, o listă de recenzii sau o clasă pentru specificații tehnice)
- Implementarea unor interfețe
- Adăugarea de comportamente mai complexe (de exemplu, calculul TVA, diferite tipuri de reduceri)
- Persistența datelor (metode de serializare/deserializare)
