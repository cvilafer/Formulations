## UML Data Model

#### CLASS Ingredient

```java
package org.example;

public class Ingredient {

    private int id;
    private String description;
    private Unit unit;
    private double cost;

    private List<Composition> compositions;

    public Ingredient(int id, String description, int idUnit) {
        this.id = id;
        this.description = description;
    }

}


```

#### CLASS Component

```java
public class Component {

    private int id;
    private String description;
    private Unit unit;
}

```


#### CLASS Formulation

```java

public class Formulation {

    private int id;
    private String description;
    private double lastCost;
    private List<Ingredient> ingredients;

}

```


#### CLASS Composition

```java

public class Composition {

    private Component component;
    private double quantity;



}


```


#### CLASS Unit

```java


public class Unit {

    private int id;
    private String description;


}

```


#### CLASS Solution

```java

public class Solution {

    private int id;
    private double cost;
    private Formulation formulation;
    private List<SolutionIngredient> solutionIngredients;



}

```

#### CLASS SolutionIngredient

```java

public class SolutionIngredient {

    private Ingredient ingredient;
    private double quantity;
}

```


### UML Formulations

```mermaid
classDiagram
    class App {

    } 

    class Ingredient{
      - String id
      - String description
      - Unit unit
      - double cost    
    }
    class Component{
        - int id
    - String description
    - Unit unit
    }
    class Formulation{
        - int id
    - String description
    - double lastCost
    - List<Ingredient> ingredients


    }

    class Composition {
- Component component
    - double quantity
    }

    class Unit {

     - int id
    - String description

    }

    class Solution {

    - int id
    - double cost
    - Formulation formulation
    - List<SolutionIngredient> solutionIngredients

     }


public class SolutionIngredient {

    - Ingredient ingredient
    - double quantity
}


    App --> FakeDataDBPopulator
    DataStore ..o App
    DataStore --* Car
    DataStore --* Booking
    DataStore --* Client
    Car --* Booking
    Client --* Booking
```













