package gregtech.api.recipes.ingredients.fluid;

import java.util.Arrays;
import java.util.Objects;

public class AmountFluidIngredient {

    private FluidIngredient ingredient;
    private int amount;
    private boolean dynamicAmount;

    public AmountFluidIngredient(FluidIngredient ingredient, int amount) {
        this(ingredient, amount, false);
    }

    public AmountFluidIngredient(FluidIngredient ingredient, boolean dynamicAmount) {
        this(ingredient, 1, dynamicAmount);
    }

    public AmountFluidIngredient(FluidIngredient ingredient, int amount, boolean dynamicAmount) {
        this.ingredient = ingredient;
        this.amount = amount;
        this.dynamicAmount = dynamicAmount;
    }

    public FluidIngredient getIngredient() {
        return ingredient;
    }

    public int getAmount() {
        return amount;
    }

    public AmountFluidIngredient copy() {
        return new AmountFluidIngredient(ingredient, amount);
    }

    public boolean isDynamic() {
        return dynamicAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmountFluidIngredient that = (AmountFluidIngredient) o;
        return amount == that.amount &&
            Objects.equals(ingredient, that.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredient, amount);
    }

    @Override
    public String toString() {
        return "CountableIngredient{" +
            "ingredient=" + Arrays.toString(ingredient.getMatchingStacks()) +
            ", count=" + amount +
            '}';
    }

}
