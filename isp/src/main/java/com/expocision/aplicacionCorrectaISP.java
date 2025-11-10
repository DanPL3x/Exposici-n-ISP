package com.expocision;

interface IProgramador {
    void programar();
}

interface IDisenador {
    void disenar();
}

interface ITester {
    void probar();
}

// Clases que implementan solo lo que necesitan
class DesarrolladorCorrecto implements IProgramador {
    @Override
    public void programar() {
        System.out.println("El desarrollador está programando...");
    }
}

class DisenadorGrafico implements IDisenador {
    @Override
    public void disenar() {
        System.out.println("El diseñador está creando interfaces gráficas...");
    }
}

class TesterQA implements ITester {
    @Override
    public void probar() {
        System.out.println("El tester está probando el sistema...");
    }
}

public class aplicacionCorrectaISP {
    public static void main(String[] args) {
        DesarrolladorCorrecto dev = new DesarrolladorCorrecto();
        DisenadorGrafico dis = new DisenadorGrafico();
        TesterQA tester = new TesterQA();

        dev.programar();
        dis.disenar();
        tester.probar();
    }
}

