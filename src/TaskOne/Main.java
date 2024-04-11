package TaskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient();
        Therapist therapist = new Therapist();
        System.out.println("Вы находитесь на приеме у терапевта.\n" +
                           "Если Вам болит живот - введите 1.\n" +
                           "Если Вам болит зуб - введите 2.\n" +
                           "Если у Вас температура - введите любое целое число.");
        patient.setHealingPlan(scanner.nextInt());
        patient.setDoctor(therapist.getDoctor(patient.getHealingPlan()));
        patient.getDoctor().heal();
    }
}