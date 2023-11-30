package Zadanie1;

public class Herurg extends DoctorSmes{
    @Override
    void reshenie(Pasient patient) {
        System.out.println("Ya lechit tvoy vse" + patient.getName());
    }
}

