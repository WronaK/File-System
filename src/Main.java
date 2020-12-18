public class Main {
    public static void main(String[] args) {
        FileProxy fileProxy = new FileProxy("kjdb39*(v.dse", new String[]{"Treść pliku"});
        fileProxy.rename();
        File file11 = new File("lfbekj(*ne.vrer", new String[]{"Treść pliku"});
        file11.rename();

        FolderProxy folderProxy = new FolderProxy("0329047&&*97gd");
        Folder folder = new Folder("289yfhol2&*(");
        folderProxy.rename();
        folder.rename();

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("podFolder");
        Folder folder3 = new Folder("podPodfolder");
        Folder folder4 = new Folder("podFolder2");
        Folder folder5 = new Folder("podPodPodfolder5");
        File file1 = new File("plik1.txt", new String[]{"Treść pliku"});
        File file2 = new File("plik2.pdf", new String[]{"Treść pliku."});
        File file3 = new File("plik3.txt", new String[]{"Treść pliku"});
        File file4 = new File("plik4.pdf", new String[]{"Treść pliku."});
        File file5 = new File("plik5.txt", new String[]{"Treść pliku"});
        File file6 = new File("plik6.pdf", new String[]{"Treść pliku."});
        File file7 = new File("plik7.txt", new String[]{"Treść pliku"});
        File file8 = new File("plik8.pdf", new String[]{"Treść pliku."});
        File file9 = new File("plik9.txt", new String[]{"Treść pliku"});
        File file10 = new File("plik10.pdf", new String[]{"Treść pliku."});

        folder3.addNode(file4);
        folder3.addNode(file5);

        folder5.addNode(file9);
        folder5.addNode(file10);

        folder2.addNode(folder3);
        folder2.addNode(file2);
        folder2.addNode(file3);

        folder3.addNode(folder5);

        folder1.addNode(folder2);
        folder1.addNode(file1);
        folder1.addNode(folder4);
        folder1.addNode(file7);
        folder1.addNode(file8);

        folder4.addNode(file6);

        System.out.println("\nWyświetlenie drzewa katalogów dla \"folder1\":");
        folder1.tree();

        System.out.println("\nWyświetlenie drzewa katalogów dla \"podFolder\":");
        folder2.tree();

        System.out.println("\nZawartość katalogu \"folder1\":");
        folder1.ls();

        System.out.println("\nZawartość katalogu \"podFolder\":");
        folder2.ls();

        String[] fileContent = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "Proin convallis vehicula facilisis. Donec tempus ut tellus et feugiat.",
                "Etiam ligula lorem, aliquam ut interdum a, auctor quis lectus.",
                "Nulla aliquam ante a ligula pellentesque, at pretium felis finibus.",
                "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.",
                "Cras vel rhoncus diam, in accumsan arcu.",
                "Sed blandit velit vel est aliquet, pharetra tincidunt lorem semper.",
                "Etiam bibendum tortor et urna lobortis dictum.",
                "Quisque ultricies purus elementum, dignissim lorem."};

        File file = new File("pliczek.txt", fileContent);
        file.more(3);

    }
}
