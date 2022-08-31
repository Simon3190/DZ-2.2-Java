public class Main {
    public static void main(String[] args) {

        int monyClient = 500; // Стартовый баланс
        int replenishment = 1500; // Пополнение баланса
        int bonus;
        int totalAmount;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
            totalAmount = replenishment + bonus + monyClient;

        } else {
            bonus = 0;
            totalAmount = replenishment + monyClient;
        }

        System.out.println("Общая сумма на счете" + totalAmount);
        System.out.println("Бонусы:" + bonus);


    }
}