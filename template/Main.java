package template;

public class Main {
    
}
public abstract class CoffeeMaker {
    public final void makeCoffee() {
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndCream();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brewCoffee();

    private void pourInCup() {
        System.out.println("Pouring coffee in cup");
    }

    protected abstract void addSugarAndCream();
}

public class DripCoffeeMaker extends CoffeeMaker {
    @Override
    protected void brewCoffee() {
        System.out.println("Dripping coffee");
    }

    @Override
    protected void addSugarAndCream() {
        System.out.println("Adding sugar and cream (drip coffee style)");
    }
}

public class FrenchPressCoffeeMaker extends CoffeeMaker {
    @Override
    protected void brewCoffee() {
        System.out.println("Steeping coffee grounds");
    }

    @Override
    protected void addSugarAndCream() {
        System.out.println("Adding sugar and cream (French press style)");
    }
}