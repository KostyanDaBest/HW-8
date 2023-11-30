package Zadanie1;

public class Dentist extends DoctorSmes{
    @Override
    void reshenie(Pasient patient) {
        System.out.println("Ya lechit tvoi zubi" + patient.getName());
    }
}
