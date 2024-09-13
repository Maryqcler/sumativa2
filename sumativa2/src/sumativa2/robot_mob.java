package sumativa2;

public class robot_mob {
	private mobManos manos_mob;
    private mobPiernas piernas_mob;
    private mobTorso torso_mob;
    private mobCabeza cabeza_mob;

    public robot_mob() {
        manos_mob = new mobManos();
        piernas_mob = new mobPiernas();
        torso_mob = new mobTorso();
        cabeza_mob = new mobCabeza();
}
    public void mostrarComponentes_mob() {
        System.out.println("Componentes del robot:");
        manos_mob.mostrarManos_mob();
        piernas_mob.mostrarPiernas_mob();
        torso_mob.mostrarTorso_mob();
        cabeza_mob.mostrarCabeza_mob();
    }
    public static void main(String[] args) {
        // Crear el robot y mostrar los componentes
        robot_mob robot_mob = new robot_mob();
        robot_mob.mostrarComponentes_mob();
        
        // Crear y aplicar outfits
        mobOutfit casual_mob = new mobCasual();
        mobOutfit deportivo_mob = new mobDeportivo();

        System.out.println("\nAplicando outfits:");
        casual_mob.mostrarOutfit_mob();
        deportivo_mob.mostrarOutfit_mob();
    }
}