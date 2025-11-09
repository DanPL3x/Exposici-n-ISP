package com.expocision;

interface ITrabajo {
    void programar();
    void disenar();
    void probar();
}

class Desarrollador implements ITrabajo {
    @Override
    public void programar() {
        System.out.println("El desarrollador está programando...");
    }

    @Override
    public void disenar() {
        // No debería tener que implementar esto
        System.out.println("El desarrollador no diseña, pero está obligado a implementar este método.");
    }

    @Override
    public void probar() {
        // Tampoco debería tener que implementar esto
        System.out.println("El desarrollador no prueba, pero está obligado a implementar este método.");
    }
}
public class violacionISP {
    public static void main(String[] args) {
        Desarrollador dev = new Desarrollador();
        dev.programar();
        dev.disenar();
        dev.probar();

}

}