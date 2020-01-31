
package objeto;




public class Objeto {

  
  public static void main(String[] args) {
       Persona obx1= Persona.getInstance("Pepe", 34, "Guerrero");
       Persona obx2=Persona.getInstance("Roberto",36,"DosSantos");
        System.out.println(obx1.getNombre());
        System.out.println(obx2.getNombre());
    }
}
