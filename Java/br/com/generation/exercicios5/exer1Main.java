package exercicios5;

public class exer1Main {
    public static void main(String[] args) {

        exer1Dog dog = new exer1Dog("Mike", 3);
        exer1Cavalo Horse = new exer1Cavalo("White Horse", 12);
        exer1Preguica slowdown = new exer1Preguica("Nicolas", 18);


        dog.emitirSom();
        Horse.emitirSom();
        slowdown.subirArvore();

    }
}

