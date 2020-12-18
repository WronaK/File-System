import java.util.Scanner;

import static java.nio.charset.StandardCharsets.*;

public class File extends Node{
    private byte[][] content;
    private static int numberOfFiles = 0;

    public File(String name, String[] content) {
        super(name);
        this.content = new byte[content.length][];
        for(int i = 0; i < content.length; i++) {
            this.content[i] = content[i].getBytes(UTF_8);
        }
    }

    public File(String name, byte[][] content) {
        super(name);
        this.content = content;
    }

    public void more() {
        this.more(5);
    }

    public void more(int numberOfLines) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        for(int i = 0; i < content.length; i++) {
            String line = new String(content[i]);
            System.out.println(line);
            if(i % numberOfLines == numberOfLines - 1) {
                if(i != content.length - 1) {
                    System.out.println("Wyświetlono (" + (100 * (i + 1) / content.length) + "%) ---->");
                    System.out.println("Wpisz \"quit\" aby skończyć wyświetlanie, albo wciśnij enter aby wyświetlić dalszy ciąg tekstu.");
                    String answer = scanner.nextLine();
                    if (answer.equals("quit")) {
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void rename() {
        if(!this.checkCorrectnessName()) {
            numberOfFiles++;
            this.setName("NewFile" + numberOfFiles);
        }
        System.out.println("Nowa nazwa pliku to: \"" + this.getName() + "\"");
    }

}
