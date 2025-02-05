import java.util.Set;
import java.util.TreeSet;

import Models.Contacto;
import Utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();
        runEjercicio();
    }

    private static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("----- HashSet -----");
        System.out.println("Elementos del HashSet (no se garantiza orden) :");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        } 
    }

    private static void runLinkedHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("----- LinkedHashSet -----");
        System.out.println("Elementos del LinkedHashSet (respeta orden de inserción) :");
        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }
    
    private static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("----- TreeSet -----");
        System.out.println("Elementos del TreeSet (orden alfabético) :"); //AVL inOrder
        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    private static void runTreeSetConComparador() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSetComparador = sets.construirTreeSetConComparador();
        System.out.println("----- TreeSetComparator -----");
        System.out.println("Elementos del TreeSetComparator (ordenados por longitud y luego alfabéticamente):");
        for (String elemento : ejemploTreeSetComparador) {
            System.out.println(elemento);
        }
    }

    private static void runEjercicio() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        // Agregar algunos contactos a la agenda
        //Contacto c1 = new Contacto(Pedro, Lopez, 123456789);
        //Contacto c2 = new Contacto(Pedro, Lopez, 123456789); 

        //System.out.println(c1);
        //System.out.println(c2);

        //System.out.println("Referencia en memoria");
        //boolean comparacionReferencia = c1 = 
        agenda.add(new Contacto("Pedro", "Lopez", "2222222222"));
        agenda.add(new Contacto("Luis", "Perez", "1111111111"));
        agenda.add(new Contacto("Ana", "Perez", "01072502345"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        //agenda.add(new Contacto("Cris", "Loja", "0107240608"));

        //Mostrar los contactos ordenados
        System.out.println("\nLista de contactos ordenada:");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}
