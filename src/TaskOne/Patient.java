package TaskOne;

public class Patient {
    private Doctor doctor;
    private int healingPlan;

    public void setHealingPlan(int healingPlan) {
        this.healingPlan = healingPlan;
    }

    public int getHealingPlan() {
        return healingPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
