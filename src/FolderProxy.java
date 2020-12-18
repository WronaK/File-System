public class FolderProxy extends Node{
    private Folder folder;

    public FolderProxy(String name) {
        super(name);
    }

    @Override
    public void rename() {
        if(folder == null) {
            folder = new Folder(this.getName());
        }
        folder.rename();
        this.setName(folder.getName());
    }
}
