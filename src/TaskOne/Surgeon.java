package TaskOne;

public class Surgeon extends Doctor {
    @Override
    public void heal() {
        System.out.println("Вас лечит хирург!");
    }
}