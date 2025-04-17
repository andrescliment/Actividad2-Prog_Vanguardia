package ar.edu.udeci.pv;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;

public class Main {
    // Crear instancia del logger
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        // Configurar opciones de línea de comandos
        Options options = new Options();

        Option nameOption = Option.builder("n")
                .longOpt("name")
                .hasArg()
                .desc("Tu nombre")
                .build();

        options.addOption(nameOption);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine cmd = parser.parse(options, args);

            String name = cmd.getOptionValue("name", "Mundo");

            logger.info("Aplicación iniciada con el nombre: " + name);

            System.out.printf("Hola y bienvenido, %s!\n", name);

            for (int i = 1; i <= 5; i++) {
                logger.debug("Iteración i = " + i);
                System.out.println("i = " + i);
            }

        } catch (ParseException e) {
            logger.error("Error al parsear argumentos: " + e.getMessage());
            formatter.printHelp("Actividad2", options);
            System.exit(1);
        }
    }
}

