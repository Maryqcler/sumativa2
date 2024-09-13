package sumativa2;

public class mobTorso {

	private String forma_mob;
    private String material_mob;

    public mobTorso() {
        this.forma_mob = "Rectangular";
        this.material_mob = "Acero";
    }

    public void mostrarTorso_mob() {
        System.out.println("Torso de forma " + forma_mob + " y material " + material_mob);
    }
}
