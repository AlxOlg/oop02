public class game {
    public static void main(String[] args) {

        Render render = new Render();

        Building building = new Building();
        building.setCurrentHealth(90);
        render.showIndicator(building);

        Hero hero = new Hero();
        hero.setCurrentHealth(70);
        hero.setCurrentMana(40);
        render.showIndicator(hero);
    
        Neutral neutral = new Neutral();
        neutral.setCurrentHealth(15);
        render.showIndicator(neutral);
    }
}
