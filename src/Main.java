import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        int money = 100;  // Сумма на телефоне
        int replenishmentAmount = 1500;  // Сумма пополнения
        int bonusStart = 100; // Старт начисления бонуса
        int bonus;  // Ваш бонус

        int bonusStart1 = 50;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / bonusStart;
        } else {
            bonus = 0;
        }


        int totalAmount = money + replenishmentAmount + bonus; // Общая сумма

        System.out.println("Ваш бонус: " + bonus);
        System.out.println("Общая сумма: " + totalAmount);



    }


}