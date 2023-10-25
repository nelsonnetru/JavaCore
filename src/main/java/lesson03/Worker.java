package lesson03;

import java.util.Date;

public class Worker {
    private String name;
    private Date birthDate;
    private double salary;

    public Worker() {
        this.salary = 100;
    }

    public Worker(String name, String birthDate) {
        this();
        this.name = name;
        this.birthDate = convertStringToDate(birthDate);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public static int compare(Date d1, Date d2) {
        if (d1.before(d2)) {
            return -1;
        } else if (d1.after(d2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public Date convertStringToDate(String strDate) {
        String[] strDateArr = strDate.split("-");
        int[] intDateArr = new int[3];
        for (int i = 0; i < strDateArr.length; i++) {
            intDateArr[i] = Integer.parseInt(strDateArr[i]);
        }
        return new Date(intDateArr[0] - 1900, intDateArr[1] - 1, intDateArr[2]);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}
