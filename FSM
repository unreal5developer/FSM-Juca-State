public class FSM {

    public static void main(String[] args) {

        // Cria o Juca
        Juca juca = new Juca();

        // Quantidade de iterações
        int contador = 0;

        // Executa a máquina de estados
        while (contador <= 20) {

            // Executa o estado atual do Juca
            juca.update();

            // Incrementa o contador
            contador++;
        }
    }
}


// Interface que representa um estado
interface State {

    void execute(Juca juca);
}


// Estado Trabalhando
class WorkingState implements State {

    @Override
    public void execute(Juca juca) {

        // Juca trabalha
        juca.working();

        // Verifica se está cansado
        if (juca.getFatigue() > 50) {

            System.out.println("Bateu um sono...");

            // Muda para o estado dormindo
            juca.setState(new SleepingState());

        } else if (juca.getHunger() > 10) {

            System.out.println("Bateu uma fome...");

            // Muda para o estado comendo
            juca.setState(new EatingState());
        }

        // Log
        System.out.println("------------------------");
        System.out.println("Estou trabalhando..");
        System.out.println("Fome: " + juca.getHunger());
        System.out.println("Cansaço: " + juca.getFatigue());
        System.out.println("------------------------");
    }
}


// Estado Comendo
class EatingState implements State {

    @Override
    public void execute(Juca juca) {

        // Juca come
        juca.eating();

        // Verifica se já está satisfeito
        if (juca.getHunger() <= 0) {

            // Impede que a fome fique negativa
            juca.setHunger(0);

            System.out.println("Ufa! Já estou cheio.");
            System.out.println("Hora de ir trabalhar!");

            // Muda para o estado trabalhando
            juca.setState(new WorkingState());
        }

        // Log
        System.out.println("------------------------");
        System.out.println("Estou comendo...");
        System.out.println("Fome: " + juca.getHunger());
        System.out.println("Cansaço: " + juca.getFatigue());
        System.out.println("------------------------");
    }
}


// Estado Dormindo
class SleepingState implements State {

    @Override
    public void execute(Juca juca) {

        // Juca dorme
        juca.sleeping();

        // Verifica se já descansou
        if (juca.getFatigue() <= 0) {

            // Impede que o cansaço fique negativo
            juca.setFatigue(0);

            // Verifica se acordou com fome
            if (juca.getHunger() <= 10) {

                System.out.println("Hora de ir trabalhar!");

                // Muda para o estado trabalhando
                juca.setState(new WorkingState());

            } else {

                System.out.println("Bateu uma fome...");

                // Muda para o estado comendo
                juca.setState(new EatingState());
            }
        }

        // Log
        System.out.println("------------------------");
        System.out.println("Estou dormindo...");
        System.out.println("Fome: " + juca.getHunger());
        System.out.println("Cansaço: " + juca.getFatigue());
        System.out.println("------------------------");
    }
}
