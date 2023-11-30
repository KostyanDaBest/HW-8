package Zadanie1;


public class Terapevt extends DoctorSmes {
    @Override
    void reshenie(Pasient patient) {
        System.out.println(" Ya ne znau chto ya lechit, no lechit " + patient.getName());
    }
    public void ktoDoctor(Pasient pasient) {
        int planLecheniya = pasient.getPlanLecheniya();
        DoctorSmes doctorSmes;
        switch (planLecheniya) {
            case 1:
                doctorSmes = new Herurg();
                break;
            case 2:
                doctorSmes = new Dentist();
                break;
            default:
                doctorSmes = new Terapevt();
                break;
        }
        pasient.setDoctorSmes(doctorSmes);
        doctorSmes.reshenie(pasient);
        }
    }
