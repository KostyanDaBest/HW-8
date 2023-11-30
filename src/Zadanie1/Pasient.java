package Zadanie1;

public class Pasient {
private String name;
private int planLecheniya;
private DoctorSmes doctorSmes;
public Pasient (String name, int planLecheniya) {
    this.name = name;
    this.planLecheniya = planLecheniya;
}

    public Pasient(String volodia) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlanLecheniya() {
        return planLecheniya;
    }

    public void setPlanLecheniya(int planLecheniya) {
        this.planLecheniya = planLecheniya;
    }

    public DoctorSmes getDoctorSmes() {
        return doctorSmes;
    }

    public void setDoctorSmes(DoctorSmes doctorSmes) {
        this.doctorSmes = doctorSmes;
    }
}

