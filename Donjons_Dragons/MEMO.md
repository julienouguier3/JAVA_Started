# MEMO JAVA

## Légende

<span style="color: SeaGreen">// Représente un commentaire personnel</span>
<br><span style="color: DarkSeaGreen">// Représente la réponse au commentaire</span>

---

## Orientée Objet :

### Déclaration

#### Syntax de déclaration

```
public class Car {
    public static void main(String[] args) {
        // body of main method
    }
}
```

---

#### découpage

- `public class Car {}`

`public` Tout les autres classes peuent accèder à cette classe<br><span style="color: seagreen">// Normalement il y a 'public' 'private' 'protected' /-à vérifier-\ </span>

`class` Module pré intégré à java (comme System) pour spécifier le type

`Car` Nom que l'on souhaite donner à la classe (doit être un seule mot qui fait référence à un objet : Store, Car, lunettes, Maison, Humain...)

`{}` Curly Braces permet de définir le contexte (début, fin) de cette classe

- `public static void main(String[] args) {}`

`public` Idem que son prédécesseur

`static` Unknown<br><span style="color: SeaGreen">// Je ne connais pas toutes les autres possibilités, ce sont les paramètres par défaut</span>

`void` Type de retour attendu par la fonction (peux être String, int, boolean etc...)

`main` Nom de la fonction (une class doit constamment avoir une fonction main), cette fonction permet l'exécution de la class lors d'un appelle par une commande `javac Car.java`

`(String[] args)` Paramètres de la fonction main <b style="color: lightcoral">obligatoire</b><br>
<span style="color: SeaGreen">// Je ne sais pas si ont peux utiliser d'autres paramètres mais en tout cas celui-ci est obligatoire pour l'exécution de la fonction main</span>

`{}` Idem que son prédécesseur

- `// body of main method`

`//` Forme des commentaires pour une seule ligne

`/* texte */` Forme des commentaires multiligne

`/** texte */` Forme des commentaires type documentation
<br><span style="color: SeaGreen">// Je ne sais pas encore à quoi sert cette forme précise. J'imagine que c'est pour aider un programme à générer automatiquement une documentation </span>
<br><span style="color: DarkSeaGreen">// C'est juste. De préférence s'en servir à chaque déclaration d'attributs et méthodes dans la classe</span>

---

### Constructors

#### Syntax

```
public class Car {

    public Car() {
        // instructions for creating a Car instance
    }

    public static void main(String[] args) {
        // Invoke the constructor
        Car ferrari = new Car();
    }
}
```

#### Découpage

- `public Car() {}`

`public` Type d'accès

`Car` Doit être obligatoirement le nom de la classe pour qu'il soit considéré comme constructor par le programme

`()` Zone de paramètres peux être `(String name, int life, etc...)`

`{}` Curly Braces définie le contexte (début, fin) du constructor

- `Car ferrari = new Car();`

`Car ferrari` Déclare une variable `ferrari` avec comme type `Car` (comme pour les types primordiaux `String`, `boolean` etc...)

`new Car()` Créer une nouvelle instance (`new`) en faisant appelle au constructor (`Car()`)
<br><span style="color: SeaGreen">// Les parenthèses `()` à `Car` sont obligatoire vue que l'on fait référence à une fonction</span>

<br><br>

#### Note

Il peux y avoir plusieurs constructors tant que leur signature (nom + paramètres) est différente

```
public class Car {

    public Car() {
        // instructions for creating a Car instance
    }

    public Car(String brand, int horsePower) {
        // instructions for creating a Car instance
    }

    public Car(String brand, int horsePower, int price) {
        // instructions for creating a Car instance
    }

    public static void main(String[] args) {
        // Invoke the constructor
        Car ferrari = new Car();
    }
}
```

Les appelles ce feront sous cette forme :

`new Car()` Constructor 1

`Car("ferrari", 528)` Constructor 2

`Car("Audi", 115, 32000)` Constructor 3

---

### Attributs

#### Syntax

```
public class Car {
    String color;

    public Car() {
        /*
        instance fields available in
        scope of constructor method
        */
    }

    public static void main(String[] args) {
        // body of main method
    }
}
```

#### Découpage

`String color;` Declare un attribut de type `String` avec comme nom `color`. Il est conseiller de ne jamais initialiser les attributs à ce stade (`String color = "blue";`), elles seront initialiser dans les constructors.<br><b style="color: lightcoral">Aucun attribut ne doit être laissé à l'abandon par un constructor</b>

#### Accès

```
    Car ferrari = new Car("Ferarri", 528);
    System.out.println(ferrari.horsePower);
```

`Car ferrari = new Car("Ferarri", 528);` il faut obligatoirement créer une nouvelle instance d'un objet avec les attributs de renseigner.

`System.out.println();` Permet d'afficher sous format text ce qu'il y as de contenue dans les parenthèses `()`

`ferrari.horsePower` Accède a la valeur des Chevaux (`528`) grace aux point `.` (celui-ci doit être tout le temps collé à l'objet et ne fonction que si la variable avant le `.` est un objet)

---

### Methods

#### Syntax

```
public class Car {
    // attributs
    String color;
    boolean engineStatus = false;

    // constructors
    public Car() {
        /*
        instance fields available in
        scope of constructor method
        */
    }

    // methods
    public void startEngine(){
        engineStatus = true;
        System.out.println("Vroom!");
    }

    public boolean isEngineRunning(){
        return engineStatus; // vaux true
    }

    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.startEngine();
        System.out.println(ferrari.isEngineRunning());
    }
}
```

- `public void startEngine(){}`

`void` le type de valeur retourner par la method(`String`, `int`, `boolean`, etc...). Dans ce cas `void` ne retourne rien.
Quand il s'agit d'un DataType (`String`, `int`, etc ...) la method doit impérativement voir en dernière ligne un `return` du type éoncé;

