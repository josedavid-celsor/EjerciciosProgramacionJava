package ud9Ficheros.MiniTerminal;

import java.util.Scanner;

/**
 * Clase del terminal el cual seria
 *
 * @author José David Rosales Rios <jdrrdaw@gmail.com>
 * @version 14-03-2022
 *
 */
public class MiniTerminal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean exit = false;
        String[] opcion;

        MiniFileManager terminal = new MiniFileManager();
        do {
            System.out.println("user@equipo: ");
            String res = teclado.nextLine();
            opcion = res.split(" ");

            switch (opcion[0]) {
                case "pwd":
                    System.out.println(terminal.getPWD());
                    break;
                case "cd":
                    terminal.changeDir(opcion[1]);
                    break;
                case "ls":
                    terminal.printList(false);
                    break;
                case "ll":
                    terminal.printList(true);
                    break;
                case "mkdir":
                    terminal.mkdir(opcion[1]);
                    break;
                case "rm":
                    break;
                case "mv":
                    break;
                case "help":
                    break;
                case "exit":
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}
