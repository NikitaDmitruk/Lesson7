package TaskOne;

public class Therapist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Вас лечит терапевт!");
    }

    public Doctor getDoctor(int patientHealingPlan) {
        if (patientHealingPlan == 1) {
            return new Surgeon();
        } else if (patientHealingPlan == 2) {
            return new Dentist();
        } else {
            return new Therapist();
        }
    }
}
