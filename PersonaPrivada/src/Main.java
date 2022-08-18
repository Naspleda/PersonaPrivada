public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Franklin");
        persona.setEdad(38);
        persona.setTelefono(01165474);

        String nombre = persona.getNombre();
        int edad = persona.getEdad();
        int telefono = persona.getTelefono();

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(telefono);

    }
    static class Persona{
        private String nombre;
        private int edad;
        private int telefono;

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return this.nombre;
        }

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad(){
            return this.edad;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public int getTelefono(){
            return this.telefono;
        }
    }



}