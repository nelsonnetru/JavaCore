package lesson03;

import java.util.ArrayList;

public class Homework03 {

    public static void main(String[] args) {
        // Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
        // представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора
        Worker w1 = new Worker("Василий", "1995-01-15");
        Worker w2 = new Worker("Иван", "1993-11-01");
        System.out.println("Compare: " + Worker.compare(w1.getBirthDate(), w2.getBirthDate()));

        // Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения
        // зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную
        // плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий
        // массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя
        // не повысилась.
        Worker d3 = new Director("Владимир", "1990-05-30");
        System.out.println(w1 + "\n" + w2 + "\n" + d3);

        ArrayList<Worker> workersList = new ArrayList<>();
        workersList.add(w1);
        workersList.add(w2);
        workersList.add(d3);

        int sumForUp = 30;
        System.out.println("Повышаем зарплату на " + sumForUp);
        Director.upSalaryForWorkers(workersList, sumForUp);

        System.out.println(w1 + "\n" + w2 + "\n" + d3);
    }
}
