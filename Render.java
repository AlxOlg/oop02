public class Render {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    //*Печать индикатора */
    private static void printIndicator(int currentValue, int maxValue) {

        int maxLength = 30; // Длина индикатора (символов)
        int currentLength = maxLength * currentValue / maxValue; // Длина значения индикатора (символов)

        char symbol = '#'; // Символ индикатора
        String filledPart = ""; // Заполненная часть индикатора
        String emptyPart = ""; // Пустая часть индикатора
        for (int i = 0; i < maxLength; i++) {
            if (i <= currentLength) {
                filledPart += symbol;
            } else {
                emptyPart += symbol;
            }
        }

        //*Выбор цвета и печать */
        if ((float) currentValue / maxValue < 0.2) {
            System.out.println(ANSI_RED + filledPart + ANSI_RESET + emptyPart);
        } else if ((float) currentValue / maxValue < 0.5) {
            System.out.println(ANSI_YELLOW + filledPart + ANSI_RESET + emptyPart);
        } else {
            System.out.println(ANSI_GREEN + filledPart + ANSI_RESET + emptyPart);
        }
    }

    //*Вывод индикатора */
    public void showIndicator(Object object) {

        if (object instanceof Health) {
            Health healthObj = (Health) object;
            System.out.printf("health: " + healthObj.getCurrentHealth() + "/" + healthObj.getMaxHealth() + " ");
            printIndicator(healthObj.getCurrentHealth(), healthObj.getMaxHealth());
        }

        if (object instanceof Mana) {
            Mana manaObj = (Mana) object;
            System.out.printf("mana: " + manaObj.getCurrentMana() + "/" + manaObj.getMaxMana() + " ");
            printIndicator(manaObj.getCurrentMana(), manaObj.getMaxMana());
        }
        System.out.println();
    }
}
