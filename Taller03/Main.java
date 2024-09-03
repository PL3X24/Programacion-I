/*LEE LA LISTA ANTES DE HACER ALGO
El profe quiere usar objetos y metodos nada directo
 */

class Main {
    public static void main(String[] args) {
        
        // Crear un objeto de la clase obj
        obj formulaGeneral = new obj();
        
        if (formulaGeneral.getdiscr()< 0){
            System.out.println("No se puede ejecutar el programa saliendo....");
        }
        else if (formulaGeneral.getdiscr()> 0){
            System.out.println("La raíz x1 es: " + formulaGeneral.getX1());
            System.out.println("La raíz x2 es: " + formulaGeneral.getX2());
        }
    }
}
