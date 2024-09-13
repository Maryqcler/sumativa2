package sumativa2;

public class mobCabeza {

	private String tipoOjos_mob;
    private boolean tieneAntena_mob;

    public mobCabeza() {
        this.tipoOjos_mob = "LED";
        this.tieneAntena_mob = true;
    }

    public void mostrarCabeza_mob() {
        System.out.println("Cabeza con ojos tipo " + tipoOjos_mob + " y antena: " + (tieneAntena_mob ? "Sí" : "No"));
    }
}
