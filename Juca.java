public class Juca {

    // Atributos do Juca
    private int hunger = 0;
    private int fatigue = 0;

    // Estado atual do Juca
    private State state;


    // Construtor
    public Juca() {

        // Estado inicial
        this.state = new WorkingState();
    }


    // Executa o comportamento do estado atual
    public void update() {

        state.execute(this);
    }


    // Troca o estado atual
    public void setState(State state) {

        this.state = state;
    }


    // =========================
    // Comportamentos do Juca
    // =========================

    // Trabalhar
    public void working() {

        // Aumenta a fome
        this.hunger += 2;

        // Aumenta o cansaço
        this.fatigue += 5;
    }


    // Comer
    public void eating() {

        // Diminui a fome
        this.hunger -= 5;
    }


    // Dormir
    public void sleeping() {

        // Dormir aumenta um pouco a fome
        this.hunger += 1;

        // Dormir diminui o cansaço
        this.fatigue -= 10;
    }


    // =========================
    // Getters
    // =========================

    public int getHunger() {

        return hunger;
    }


    public int getFatigue() {

        return fatigue;
    }


    // =========================
    // Setters
    // =========================

    public void setHunger(int hunger) {

        this.hunger = hunger;
    }


    public void setFatigue(int fatigue) {

        this.fatigue = fatigue;
    }
}
