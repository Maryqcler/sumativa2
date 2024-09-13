package sumativa2;

public class mobManos {
	 private int dedos_mob;
	    private String tamaño_mob;

	    public mobManos() {
	        this.dedos_mob = 5;
	        this.tamaño_mob = "Medianas";
	    }
	    public void mostrarManos_mob() {
	        System.out.println("Manos con " + dedos_mob + " dedos y tamaño " + tamaño_mob);
	    }
	}