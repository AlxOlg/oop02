public class Hero implements Health, Mana {

    private int maxHealth;
    private int currentHealth;

    private int maxMana;
    private int currentMana;

    public Hero() {
        this(100, 100);
    }

    public Hero(int maxHealth, int maxMana) {
        this.maxHealth = maxHealth;
        this.maxMana = maxMana;

        this.currentHealth = maxHealth;
        this.currentMana = maxMana;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }
}
