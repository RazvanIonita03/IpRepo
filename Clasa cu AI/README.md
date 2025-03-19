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