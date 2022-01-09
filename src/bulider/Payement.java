package bulider;

public class Payement {
    private String id;
    private String status;
    private Long amount;

    @Override
    public String toString() {
        return "Payement{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static PayementBuilder builder() {
        return new PayementBuilder();
    }

    public static class PayementBuilder {
        private Payement payement;

        public PayementBuilder() {
            this.payement = new Payement();
        }

        public PayementBuilder id(String id) {
            this.payement.id = id;
            return this;
        }

        public PayementBuilder status(String status) {
            this.payement.status = status;
            return this;
        }

        public PayementBuilder amount(Long amount) {
            this.payement.amount = amount;
            return this;
        }

        public Payement build() {
            return payement;
        }
    }

}
