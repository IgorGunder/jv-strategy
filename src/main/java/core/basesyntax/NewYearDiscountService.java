package core.basesyntax;

public class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return (double) 20;
    }
}