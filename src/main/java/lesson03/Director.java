package lesson03;

import java.util.ArrayList;

public class Director extends Worker {
    public Director(String name, String birthDate) {
        super(name, birthDate);
        this.setSalary(this.getSalary() + 50);
    }

    public static void upSalaryForWorkers(ArrayList<Worker> workers, int summForUp) {
        for (Worker w : workers) {
            if (!(w instanceof Director)) {
                w.setSalary(w.getSalary() + summForUp);
            }
        }
    }

}
