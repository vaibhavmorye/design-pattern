package bulider;

public class Main {

    public static void main(String[] args) {
        Payement payement = Payement.builder()
                .build();
        System.out.println(payement.toString());
        Payement payement2 = Payement.builder().id("1").status("Sucess").amount(123L)
                .build();
        System.out.println(payement2);
    }
}
