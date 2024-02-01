package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Vuelta Nº " + i);
        }

        System.out.println("*****************************************************************************************");*/

        //--------------------------------------------------------------------------------------------------------------

        /*double sueldoBase = 21000; //monto de ejemplo
        String dni = "12345678"; //dni de ejemplo
        double sueldoConAumento;

        if (sueldoBase > 45000) {
            sueldoConAumento = sueldoBase * 1.05;
        } else {
            if (sueldoBase > 20000 || sueldoBase == 45000) {
                sueldoConAumento = sueldoBase * 1.1;
            } else {
                sueldoConAumento = sueldoBase * 1.2;
            }
        }

        System.out.println("El nuevo sueldo del empleado es de: " + sueldoConAumento);

        System.out.println("*****************************************************************************************");*/

        //--------------------------------------------------------------------------------------------------------------

        /*int[] serviciosCli = new int[7]; //vector de 7 posiciones con tipos de servicios

        serviciosCli[0] = 1;
        serviciosCli[1] = 1;
        serviciosCli[2] = 2;
        serviciosCli[3] = 2;
        serviciosCli[4] = 2;
        serviciosCli[5] = 1;
        serviciosCli[6] = 2;

        double totalFactura;

        for (int i = 0; i < serviciosCli.length; i++) {
            if (serviciosCli[i] == 1) {

                totalFactura = 1500;

                System.out.println("El tipo de servicio es: " + serviciosCli[i]);
                System.out.println("El monto de la factura es de: " + totalFactura);
            } else {

                totalFactura = 1500 + 700;

                System.out.println("El tipo de servicio es: " + serviciosCli[i]);
                System.out.println("El monto de la factura es de: " + totalFactura);
            }
        }

        System.out.println("*****************************************************************************************");*/

        //--------------------------------------------------------------------------------------------------------------

        /*
         * Un portal de noticias tiene registrados datos de las diferentes temperaturas
         * que obtuvieron algunas ciudades del mundo durante el año pasado; a partir de estos registros,
         * pudieron determinar la más baja y la más alta para cada una de las ciudades.
         * Por ejemplo, se determinó que para Londres, la mínima fue de -2º C y la máxima de 33º C.
         * Sin embargo, actualmente necesitan armar una noticia en donde especifiquen cuál es la temperatura máxima
         * que hubo entre todas las ciudades registradas y cuál fue la mínima. Para ello cuentan con un vector
         * con los nombres de cada una de las ciudades y una matriz de dos columnas que especifican su
         * temperatura máxima y mínima, los cuales se especifican a continuación:
         *
         * Sabiendo que cada índice de fila representa a una ciudad. Se necesita conocer la mayor y la menor temperatura
         * entre todas las ciudades; al mismo tiempo se deberá especificar el nombre de la ciudad. Por ejemplo,
         * la menor temperatura la tuvo Tokio, con -10 º C.
         */

        /*String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        String ciudadMaxima = "";
        String ciudadMinima = "";

        int tempMaxima = Integer.MIN_VALUE;
        int tempMinima = Integer.MAX_VALUE;

        for (int f = 0; f < ciudades.length; f++) {
            if (temperaturas[f][0] < tempMinima) {
                tempMinima = temperaturas[f][0];
                ciudadMinima = ciudades[f];
            }
            if (temperaturas[f][1] > tempMaxima) {
                tempMaxima = temperaturas[f][1];
                ciudadMaxima = ciudades[f];
            }
        }

        System.out.println("la menor temperatura la tuvo " + ciudadMinima + ", con " + tempMinima + "º C.");
        System.out.println("la mayor temperatura la tuvo " + ciudadMaxima + ", con " + tempMaxima + "º C.");

        System.out.println("*****************************************************************************************");*/

        //--------------------------------------------------------------------------------------------------------------

        /*

        Todos los años en la provincia de Misiones, al norte de Argentina se lleva a cabo un evento conocido como
        “Carrera de la Selva”. El mismo se trata de una competición donde los mejores maratonistas y corredores de
        Latinoamérica se reúnen para desafiar sus habilidades deportivas.

        La competencia cuenta con 3 categorías dependiendo de su dificultad y de ellas se guarda una
        id, el nombre y una breve descripción:
        * Circuito chico: 2 km por selva y arroyos.
        * Circuito medio: 5 km por selva, arroyos y barro.
        * Circuito avanzado: 10 km por selva, arroyos, barro y escalada en piedra.

        Para poder conocer en qué categoría competirá cada participante se manejarán inscripciones.
        Cada inscripción debe contar con un número de inscripción, una categoría, un participante y el monto a abonar
        por el participante.

        Cada participante puede inscribirse únicamente a una categoría y necesita, para dicha inscripción,
        proporcionar los siguientes datos: número de participante, dni, nombre, apellido, edad, celular,
        número de emergencia y grupo sanguíneo.

        Para concluir con la inscripción, se debe calcular el monto a abonar por cada participante.
        Para ello se tienen en cuenta los siguientes valores:
        - Inscripción Circuito chico: Menores de 18 años $1300. Mayores de 18 años $1500.
        - Inscripción Circuito medio: Menores de 18 años $2000. Mayores de 18 años $2300.
        - Inscripción Circuito Avanzado: No se permite inscripciones a menores de 18 años. Mayores de 18 años $2800

        A partir de estos datos brindados, los organizadores de la carrera manifestaron que necesitan
        de una aplicación que sea capaz de:

        * Crear 3 objetos de tipo categoría (uno por cada categoría) con sus respectivos datos.

        * Crear un nuevo participante e inscribirlo en una categoría.
        Calcular el monto de inscripción que deberá abonar
        (Por ejemplo: si el participante se inscribe a la categoría Circuito chico y tiene 21 años,
        el monto a abonar es de $1500).

        * Inscribir al azar algunos participantes en diferentes categorías (al menos uno en cada una).

        * Mostrar por pantalla todos los inscriptos a una determinada categoría con sus correspondientes
        datos y número de inscripción.

        * Desinscribir a un participante. Mostrar como queda la lista de inscriptos en la categoría
        donde se encontraba.

        * Calcular el monto total recaudado por cada categoría y el total de toda la carrera incluyendo
        todas las categorías.

        */

        Scanner sc = new Scanner(System.in);
        double totalCarrera = 0.0;
        double totalCategoriaA = 0.0;
        double totalCategoriaB = 0.0;
        double totalCategoriaC = 0.0;

        List<String> inscriptosCatA = new ArrayList<String>();
        List<String> inscriptosCatB = new ArrayList<String>();
        List<String> inscriptosCatC = new ArrayList<String>();

        Categoria circuitoChico = new Categoria(1, "Circuito chico", "2 km por selva y arroyos.");
        Categoria circuitoMedio = new Categoria(2, "Circuito medio", "Selva, aroyo, barro");
        Categoria circuitoAvanzado = new Categoria(3, "Circuito avanzado", "selva, arroyos, barro y escalada en piedra");

        Participante participantePrincipal = new Participante(1, 46987001, "Juan", "Cena",
                21, 351112334, 351112335, "A+");

        Participante participanteRandom1 = new Participante(2, 46987002, "Pancho", "Salchicha",
                17, 351112334, 351112335, "B+");
        Participante participanteRandom2 = new Participante(3, 46987003, "Marcela", "Pérez",
                18, 351112344, 351112366, "O+");
        Participante participanteRandom3 = new Participante(4, 46987004, "Victoria", "Rodríguez",
                55, 351112355, 351112377, "AB+");

        Inscripcion inscripcionPrincipal = new Inscripcion(1, circuitoChico, participantePrincipal, 0.0);
        double montoTotal = inscripcionPrincipal.calcularMonto(participantePrincipal, circuitoChico);
        inscripcionPrincipal.setMonto(montoTotal);

        Inscripcion inscripcionRandom1 = new Inscripcion(2, circuitoChico, participanteRandom1, 0.0);
        double montoTotalRandom1 = inscripcionRandom1.calcularMonto(participanteRandom1, circuitoChico);
        inscripcionRandom1.setMonto(montoTotalRandom1);

        Inscripcion inscripcionRandom2 = new Inscripcion(3, circuitoMedio, participanteRandom2, 0.0);
        double montoTotalRandom2 = inscripcionRandom2.calcularMonto(participanteRandom2, circuitoMedio);
        inscripcionRandom2.setMonto(montoTotalRandom2);

        Inscripcion inscripcionRandom3 = new Inscripcion(4, circuitoAvanzado, participanteRandom3, 0.0);
        double montoTotalRandom3 = inscripcionRandom3.calcularMonto(participanteRandom3, circuitoAvanzado);
        inscripcionRandom3.setMonto(montoTotalRandom3);

        Map<Integer, Inscripcion> inscripciones = new HashMap();
        inscripciones.put(1, inscripcionPrincipal);
        inscripciones.put(2, inscripcionRandom1);
        inscripciones.put(3, inscripcionRandom2);
        inscripciones.put(4, inscripcionRandom3);

        for (Map.Entry<Integer, Inscripcion> inscripcionEntry : inscripciones.entrySet()) {
            Inscripcion ins = inscripcionEntry.getValue();

            if (ins.getCategoria().getId() == 3) {
                inscriptosCatC.add(ins.toString());
                totalCategoriaC += ins.getMonto();
            } else if (ins.getCategoria().getId() == 2) {
                inscriptosCatB.add(ins.toString());
                totalCategoriaB += ins.getMonto();
            } else {
                inscriptosCatA.add(ins.toString());
                totalCategoriaA += ins.getMonto();
            }
        }

        inscriptosCatA.remove(1);

        System.out.println("-------------INSCRIPTOS EN CAT. A-------------");
        for (int i = 0; i < inscriptosCatA.size(); i++) {
            System.out.println(inscriptosCatA.get(i));
        }
        System.out.println("-------------MONTO CAT. A: $" + totalCategoriaA + "-------------");

        System.out.println("-------------INSCRIPTOS EN CAT. B-------------");
        for (int i = 0; i < inscriptosCatB.size(); i++) {
            System.out.println(inscriptosCatB.get(i));
        }
        System.out.println("-------------MONTO CAT. B: $" + totalCategoriaB + "-------------");

        System.out.println("-------------INSCRIPTOS EN CAT. C-------------");
        for (int i = 0; i < inscriptosCatC.size(); i++) {
            System.out.println(inscriptosCatC.get(i));
        }
        System.out.println("-------------MONTO CAT. C: $" + totalCategoriaC + "-------------");

        totalCarrera = totalCategoriaA + totalCategoriaB + totalCategoriaC;
        System.out.println("-------------MONTO TOTAL DE CARRERA: $" + totalCarrera + "-------------");


    }
}
