public class DriverMascota {
    public static void main(String[] args) {
        MascotaCanina mascota = new MascotaCanina();
        mascota.setNombre("Pacho");
        mascota.setCollar(true);
        mascota.setEdad(9);
        mascota.setRaza("Blue Heeler");
        mascota.setAlimentoFav("Pollito con arroz");
        mascota.setJuguete(new Pelota("Libe","mediana", "cuiky",10,"De picos"));
        System.out.println(mascota);
        System.out.println("---------------------------------------");
        mascota.jugar();
        mascota.setJuguete(new Zapato("Nike","mediano","swip swip",6, "cuero"));
        mascota.jugar();
        System.out.println("----Polimorfismo simple----");
        mascota.setJuguete(new Toy("chillon","pequeño","boing boing"));
        mascota.jugar();
        
    }
}
