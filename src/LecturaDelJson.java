/**
 * Clase que contiene todos los cálculos realizados para el correcto funcionamiento
 * de los reportes que se solicitaron en el programa
 *
 * @author Daniel Alfonso Suárez Solis
 * @author Ricardo Jared Cedeño Villota
 * @version POO - 2024-2025 C1
 * @since Desde 31-jul-2024, 20:00 horas
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.Comparator; // esta importación sirve para comparar elementos
import java.util.List;
import java.util.Optional; // esta importación sirve para manejar valores que pueden no estar presentes
import java.util.OptionalDouble; // esta importación sirve para manejar valores double que pueden no estar presentes

public class LecturaDelJson {
    /**
     *
     * Uso de ANSI escape codes para agregar colores a la salida en terminales que soportan ANSI
     *
     */
    public static final String RESET = "\u001B[0m";
    public static final String NEGRO = "\u001B[1m";
    public static final String CIAN = "\u001B[96m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[94m";
    public static void main(String[] args) {
        File archJson = new File("./src/Crypto.json");
        ObjectMapper mapper = new ObjectMapper();
        try {
            //Lectura del archivo json, referenciando que los datos se encuentran dentro de un Array
            List<Cripto> crips = mapper.readValue(archJson, new TypeReference<List<Cripto>>() {});
            for (Cripto cripto : crips) {
            }
            System.out.println(AZUL+"**************************** CRYPTO  DATA ***************************");
            System.out.println(CIAN+"************************* CANTIDAD Y PRECIO *************************");
            System.out.println(CIAN+"---------------------------------------------------------------------"+RESET);
            /**
             *
             * Mostrar el total de criptomonedas existentes, uso de un método de la interfaz list
             *
             */
            System.out.println(NEGRO+"El total de criptomonedas existentes es: "+crips.size());
            System.out.println(CIAN+"---------------------------------------------------------------------"+RESET);
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .min(Comparator.comparingDouble(Cripto::getPrecio)) encuentra la criptomoneda con el menor precio
             * .ifPresent(cripto -> ...) se usa para ejecutar una acción si el menor precio está presente
             *
             */
            Optional<Cripto> precioMenor = crips.stream().
                    min(Comparator.comparingDouble(Cripto::getPrecio));
            System.out.println(NEGRO+"La criptomoneda que tiene el precio menor es: ");
            precioMenor.ifPresent(cripto -> System.out.println("Nombre: "+cripto.getNombre()+
                    ", precio: "+cripto.getPrecio()));
            System.out.println(CIAN+"---------------------------------------------------------------------"+RESET);
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .max(Comparator.comparingDouble(Cripto::getPrecio)) encuentra la criptomoneda con el mayor precio
             * .ifPresent(cripto -> ...) se usa para ejecutar una acción si el precio mayor está presente
             *
             */
            Optional<Cripto> precioMayor = crips.stream().
                    max(Comparator.comparingDouble(Cripto::getPrecio));
            System.out.println(NEGRO+"La criptomoneda que tiene el precio mayor es: ");
            precioMayor.ifPresent(cripto -> System.out.println("Nombre: "+cripto.getNombre()+
                    ", precio: "+cripto.getPrecio()));
            System.out.println(CIAN+"---------------------------------------------------------------------"+RESET);
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .mapToDouble(Cripto::getPrecio) transforma elementos en un flujo de double
             * .average() calcula el promedio de los elementos en el flujo y devuelve un OptionalDouble
             * .ifPresent(avg -> ...) se usa para ejecutar una acción si el valor del promedio está presente
             *
             */
            OptionalDouble promPrecio = crips.stream().
                    mapToDouble(Cripto::getPrecio).average();
            System.out.print(NEGRO+"El promedio del precio de las criptomonedas es: ");
            promPrecio.ifPresent(avg -> System.out.println(avg));

            System.out.println(CIAN+"*************************** TRANSACCIONES ***************************"+RESET);
            System.out.println(CIAN+"---------------------------------------------------------------------"+RESET);
            System.out.println(NEGRO+"La criptomoneda que ha realizado la mayor " +
                    "cantidad de transacciones en las ultimas 24 horas es: ");
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .max(Comparator.comparingDouble(Cripto::getVolTrans24hrs)) encuentra la
             *  criptomoneda con la mayor cantidad de transacciones
             *  .ifPresent(cripto -> ...) se usa para ejecutar una acción si la criptomoneda
             *  con mayor cantidad de transacciones está presente
             *
             */
            Optional<Cripto> transMayor = crips.stream().
                    max(Comparator.comparingDouble(Cripto::getVolTrans24hrs));
            transMayor.ifPresent(cripto -> System.out.println(NEGRO+"Nombre: "+cripto.getNombre()+
                    ", cantidad de transacciones: "+cripto.getVolTrans24hrs()));
            System.out.println(CIAN+"---------------------------------------------------------------------"+RESET);
            System.out.println(NEGRO+"La criptomoneda que ha realizado la menor " +
                    "cantidad de transacciones en las ultimas 24 horas es: ");
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .min(Comparator.comparingDouble(Cripto::getVolTrans24hrs)) encuentra la
             *  criptomoneda con la menor cantidad de transacciones
             *  .ifPresent(cripto -> ...) se usa para ejecutar una acción si la criptomoneda
             *  con menor cantidad de transacciones está presente
             *
             */
            Optional<Cripto> transMenor = crips.stream().
                    min(Comparator.comparingDouble(Cripto::getVolTrans24hrs));
            transMenor.ifPresent(cripto -> System.out.println(NEGRO+"Nombre: "+cripto.getNombre()+
                    ", cantidad de transacciones: "+cripto.getVolTrans24hrs()));
            System.out.println(CIAN+"---------------------------------------------------------------------"+RESET);
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .mapToDouble(Cripto::getPrecio) transforma elementos en un flujo de double
             * .average() calcula el promedio de los elementos en el flujo y devuelve un OptionalDouble
             * .ifPresent(avg -> ...) se usa para ejecutar una acción si el valor del promedio está presente
             *
             */
            OptionalDouble transProm = crips.stream().
                    mapToDouble(Cripto :: getVolTrans24hrs).average();
            System.out.print(NEGRO+"El promedio de las transacciones de las criptomonedas " +
                    "en las últimas 24 horas es: ");
            transProm.ifPresent(avg -> System.out.println(avg));
            System.out.println(CIAN+"---------------------------------------------------------------------"+RESET);
            System.out.println(CIAN + "************************** MONTO CIRCULANTE *************************" + RESET);
            System.out.println(CIAN + "---------------------------------------------------------------------" + RESET);
            System.out.println(NEGRO + "La criptomoneda con mayor monto circulante es: ");
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .max(Comparator.comparingDouble(Cripto::getCantCriptoCirculando)) encuentra la
             *  criptomoneda con el mayor monto circulante
             *  .ifPresent(cripto -> ...) se usa para ejecutar una acción si la criptomoneda
             *  con el mayor monto circulante está presente
             *
             */
            Optional<Cripto> mayorCirculante = crips.stream().max(Comparator
                    .comparingDouble(Cripto::getCantCriptoCirculando));
            mayorCirculante.ifPresent(cripto -> System.out.println("Nombre: " + cripto.getNombre() +
                    ", monto circulante: " + cripto.getCantCriptoCirculando()));
            System.out.println(CIAN + "---------------------------------------------------------------------" + RESET);
            System.out.println(NEGRO + "La criptomoneda con menor monto circulante es: ");
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .min(Comparator.comparingDouble(Cripto::getCantCriptoCirculando)) encuentra la
             *  criptomoneda con el menor monto circulante
             *  .ifPresent(cripto -> ...) se usa para ejecutar una acción si la criptomoneda
             *  con el menor monto circulante está presente
             *
             */
            Optional<Cripto> menorCirculante = crips.stream().min(Comparator
                    .comparingDouble(Cripto::getCantCriptoCirculando));
            menorCirculante.ifPresent(cripto -> System.out.println("Nombre: " + cripto.getNombre() +
                    ", monto circulante: " + cripto.getCantCriptoCirculando()));
            System.out.println(CIAN + "---------------------------------------------------------------------" + RESET);
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .mapToDouble(Cripto::getCantCriptoCirculando) transforma elementos en un flujo de double
             * .average() calcula el promedio de los elementos en el flujo y devuelve un OptionalDouble
             * .ifPresent(avg -> ...) se usa para ejecutar una acción si el valor del promedio está presente
             *
             */
            OptionalDouble promCirculante = crips.stream().
                    mapToDouble(Cripto::getCantCriptoCirculando).average();
            System.out.print(NEGRO + "El promedio del monto circulante de las criptomonedas es: ");
            promCirculante.ifPresent(avg -> System.out.println(avg));
            System.out.println(CIAN + "---------------------------------------------------------------------" + RESET);
            System.out.println(CIAN + "*************************** OFERTA TOTAL ***************************" + RESET);
            System.out.println(CIAN + "---------------------------------------------------------------------" + RESET);
            System.out.println(NEGRO + "La criptomoneda con mayor oferta total es: ");
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .max(Comparator.comparingDouble(Cripto::getCantTotal)) encuentra la
             *  criptomoneda con la mayor oferta total
             *  .ifPresent(cripto -> ...) se usa para ejecutar una acción si la criptomoneda
             *  con la mayor oferta total está presente
             *
             */
            Optional<Cripto> mayorOferta = crips.stream().
                    max(Comparator.comparingDouble(Cripto::getCantTotal));
            mayorOferta.ifPresent(cripto -> System.out.println("Nombre: " + cripto.getNombre() +
                    ", precio: " + cripto.getPrecio() +
                    ", capitalización: " + cripto.getCapitalizacion() +
                    ", oferta total: " + cripto.getCantTotal()));
            System.out.println(CIAN + "---------------------------------------------------------------------" + RESET);
            System.out.println(NEGRO + "La criptomoneda con menor oferta total es: ");
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .max(Comparator.comparingDouble(Cripto::getCantTotal)) encuentra la
             *  criptomoneda con la menor oferta total
             *  .ifPresent(cripto -> ...) se usa para ejecutar una acción si la criptomoneda
             *  con la menor oferta total está presente
             *
             */
            Optional<Cripto> menorOferta = crips.stream().
                    min(Comparator.comparingDouble(Cripto::getCantTotal));
            menorOferta.ifPresent(cripto -> System.out.println("Nombre: " + cripto.getNombre() +
                    ", precio: " + cripto.getPrecio() +
                    ", capitalización: " + cripto.getCapitalizacion() +
                    ", oferta total: " + cripto.getCantTotal()));
            System.out.println(CIAN + "---------------------------------------------------------------------" + RESET);
            /**
             *
             * .stream() crean un flujo de la lista Cripto
             * .mapToDouble(Cripto::getCantTotal) transforma elementos en un flujo de double
             * .average() calcula el promedio de los elementos en el flujo y devuelve un OptionalDouble
             * .ifPresent(avg -> ...) se usa para ejecutar una acción si el valor del promedio está presente
             *
             */
            OptionalDouble promOferta = crips.stream().
                    mapToDouble(Cripto::getCantTotal).average();
            System.out.print(NEGRO + "El promedio de la oferta total de las criptomonedas es: ");
            promOferta.ifPresent(avg -> System.out.println(avg));
            System.out.println(CIAN + "---------------------------------------------------------------------" + RESET);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
