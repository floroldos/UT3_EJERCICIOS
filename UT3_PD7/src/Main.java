public class Main {
    public static void main(String[] args) {

        //Ejercicio 2
        Conjunto<Integer> primerConjunto = new Conjunto<>();
        Conjunto<Integer> segundoConjunto = new Conjunto<>();

        Nodo<Integer> nodo1 = new Nodo<>(2, 2);
        Nodo<Integer> nodo2 = new Nodo<>(4, 4);
        Nodo<Integer> nodo3 = new Nodo<>(2, 2);
        Nodo<Integer> nodo4 = new Nodo<>(6, 6);

        primerConjunto.insertar(nodo1);
        primerConjunto.insertar(nodo2);
        segundoConjunto.insertar(nodo4);
        segundoConjunto.insertar(nodo3);

        Conjunto<Integer> opUnion = primerConjunto.opUnion(primerConjunto, segundoConjunto);
        System.out.println("Unión: ");
        opUnion.cImprimir();

        Conjunto<Integer> opInterseccion = primerConjunto.opInterseccion(primerConjunto, segundoConjunto);
        System.out.println("Intersección: ");
        opInterseccion.cImprimir();

        //Ejercicio 3 implementación con alumnos
        Conjunto<TAlumno> AED1 = new Conjunto<>();
        Conjunto<TAlumno> PF = new Conjunto<>();
        TAlumno alumno1 = new TAlumno(6666, "alumno1");
        TAlumno alumno2 = new TAlumno(7777, "alumno2");
        TAlumno alumno3 = new TAlumno(8888, "alumno3");
        TAlumno alumno4 = new TAlumno(9999, "alumno4");

        Nodo<TAlumno> a1= new Nodo<>(alumno1.getCedula(), alumno1);
        Nodo<TAlumno> a2= new Nodo<>(alumno2.getCedula(), alumno2);
        Nodo<TAlumno> a3= new Nodo<>(alumno3.getCedula(), alumno3);
        Nodo<TAlumno> a4= new Nodo<>(alumno4.getCedula(), alumno4);

        AED1.insertar(a1);
        AED1.insertar(a3);
        AED1.insertar(a4);
        PF.insertar(a2);
        PF.insertar(a4);

        Conjunto<TAlumno> opUnion2 = AED1.opUnion(AED1, PF);
        System.out.println("Unión: ");
        opUnion2.cImprimir();
        Conjunto<TAlumno> opInterseccion2 = AED1.opInterseccion(AED1, PF);
        System.out.println("Intersección: ");
        opInterseccion2.cImprimir();
    }
}