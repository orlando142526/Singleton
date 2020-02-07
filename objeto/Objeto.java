
package objeto;




public class Objeto {

  
  public static void main(String[] args) {
       Persona obx1= Persona.getInstance("Pepe", 12, "Hernandez");
       Persona obx2=Persona.getInstance("Luis",96,"Sanchez");
        System.out.println(obx1.getNombre());
        System.out.println(obx2.getNombre());
    }
}
