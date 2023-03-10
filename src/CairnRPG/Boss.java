package CairnRPG;

public class Boss extends Enemy{
    private int ultrasLeft;

    public Boss(){
        name = "generic Boss";
        health = 200;
        attackPower = 75;
        isAlive = true;
    }
    Boss( double health, double attackPower, boolean isAlive) {
        super("Big Bad Wolf",health,attackPower,isAlive);
        this.ultrasLeft = 3;
    }
    public boolean fight(Hero Hero){
        System.out.println("You are fighting" + Hero.getName());
        return false;
    }
    public String info() {
        return "Name: " + this.name + "\nHealth: " + this.health + "\nAttack Power:" + attackPower + "\nIs Alive:" + isAlive + "\nUltras left :" + ultrasLeft;
    }

    public int getUltrasLeft() {
        return ultrasLeft;
    }

    public void setUltrasLeft(int ultrasLeft) {
        this.ultrasLeft = ultrasLeft;
    }
}
