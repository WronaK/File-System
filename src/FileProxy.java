import static java.nio.charset.StandardCharsets.UTF_8;

public class FileProxy extends Node{
    private File file;
    private byte[][] content;

    public FileProxy(String name, String[] content) {
        super(name);
        this.content = new byte[content.length][];
        for(int i = 0; i < content.length; i++) {
            this.content[i] = content[i].getBytes(UTF_8);
        }
    }

    @Override
    public void rename() {
        if (file == null) {
            file = new File(this.getName(), content);
        }
        file.rename();
        this.setName(file.getName());
    }

}
