package shop;

public enum DiscountType {
    TEN(90),
    TWENTY(80),
    FIFTY(50);

    private final int discount;

    DiscountType(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return this.discount;
    }
}
