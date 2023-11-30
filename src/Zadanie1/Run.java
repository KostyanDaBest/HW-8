package Zadanie1;

public class Run {
    public static void main(String[] args) {



        Terapevt terapevt = new Terapevt();
        Pasient pasient = new Pasient("Volodia",1);
        terapevt.ktoDoctor(pasient);

    }
}