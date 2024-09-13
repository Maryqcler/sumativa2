package sumativa2;

public class mobPiernas {
	private int articulaciones_mob;
    private String fuerza_mob;

    public mobPiernas() {
        this.articulaciones_mob = 3;
        this.fuerza_mob = "Alta";
    }
    public void mostrarPiernas_mob() {
        System.out.println("Piernas con " + articulaciones_mob + " articulaciones y fuerza " + fuerza_mob);
    }
}
