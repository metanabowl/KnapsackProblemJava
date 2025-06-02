# Laboratorium 5 – Problem plecakowy w Javie

## Autor
**Imię i nazwisko:** Kacper Karkosz 

**Przedmiot:** Platformy Programistyczne .NET i Java  

**Prowadzący:** mgr inż. Michał Jaroszczuk

---

## 🎯 Cel laboratorium

Celem ćwiczenia było stworzenie aplikacji konsolowej w języku Java, rozwiązującej **nieograniczony problem plecakowy**, w tym:

- zaprojektowanie klas i generatora danych wejściowych,
- implementację algorytmu zachłannego (Dantzig, 1957),
- utworzenie testów jednostkowych z wykorzystaniem JUnit.

---

## 📌 Opis problemu

Nieograniczony problem plecakowy polega na maksymalizacji sumy wartości przedmiotów wkładanych do plecaka, bez przekroczenia jego pojemności. Każdy typ przedmiotu może być użyty dowolną ilość razy.

**Dane wejściowe:**
- `n` – liczba typów przedmiotów,
- `vi` – wartość przedmiotu i,
- `wi` – waga przedmiotu i,
- `C` – maksymalna pojemność plecaka.

**Ograniczenie:**
```
Σ(xi * wi) ≤ C,  xi ∈ N
```

**Funkcja celu:**
```
Maximize Σ(xi * vi)
```

---

## ✅ Zakres zrealizowanych zadań

### 🔹 1. Generator instancji problemu (`Problem.java`)
- Losowe generowanie `n` przedmiotów z wagami i wartościami w przedziale [1, 10].
- Deterministyczne generowanie na podstawie ziarna (`seed`).
- Metoda `toString()` pozwala na szybki podgląd danych.

### 🔹 2. Algorytm rozwiązujący (`solve(int capacity)`)
- Sortowanie przedmiotów wg stosunku `value / weight`.
- Dodawanie najbardziej opłacalnych przedmiotów, aż do wyczerpania pojemności plecaka.
- Wynik zwracany jako obiekt `Result`, zawierający:
  - mapę przedmiotów i ich liczności,
  - sumaryczną wagę i wartość.

### 🔹 3. Testy jednostkowe (`ProblemTest.java`)
Zaimplementowano testy:
1. Sprawdzenie, czy zwracany jest wynik przy dostępnych przedmiotach.
2. Sprawdzenie pustego wyniku dla zbyt małej pojemności.
3. Weryfikacja, czy wygenerowane dane mieszczą się w zadanym zakresie.
4. Sprawdzenie poprawności konkretnego rozwiązania (waga i wartość).

---

## 📂 Struktura projektu

```
KnapsackProblemJava-main/
├── src/
│   ├── main/java/knapsack/
│   │   ├── Main.java
│   │   ├── Problem.java
│   │   ├── Item.java
│   │   └── Result.java
│   └── test/java/knapsack/
│       └── ProblemTest.java
├── pom.xml
└── README.md
```

---

## ⚙️ Technologie

- **Java** (JDK 17+)  
- **Maven** (do zarządzania zależnościami)  
- **JUnit 5** (do testów jednostkowych)  
- **IntelliJ IDEA** (zalecane środowisko IDE)

---

## 💻 Przykład działania

```
--- Problem instance ---
Item 0: weight=3, value=9
Item 1: weight=4, value=6
Item 2: weight=5, value=5

--- Solved ---
Selected items: {0=6, 1=1}
Total value: 60
Total weight: 22
```

---

## 📌 Wnioski

Projekt pozwolił zapoznać się z podstawami języka Java, strukturą projektów Maven, a także z implementacją algorytmu aproksymacyjnego. Dzięki testom jednostkowym możliwe było weryfikowanie poprawności działania kodu. Porównanie z analogicznym rozwiązaniem w .NET pozwala lepiej zrozumieć różnice w podejściu do projektowania aplikacji w tych dwóch technologiach.

