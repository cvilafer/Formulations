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


#### CLASS Unit

```java

public class Solutions {

    private int id;
    private double cost;
    private Formulation formulation;
    private List<SolutionIngredient> solutionIngredients;



}

```
