import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {
    private List<Node> childNodes = new ArrayList<>();
    private static int numberOfFolders = 0;

    public Folder(String name) {
        super(name);
    }

    public void ls() {
        for(Node node: childNodes) {
            System.out.println(node.getName());
        }
    }
    private void printNode(int t) {
        for(int i = 0; i < t-1; i++) {
            System.out.print("|\t");
        }
    }
    public void tree() {
        System.out.println(".");
        this.nodeTree(this.getLevelNode());
    }

    private void nodeTree(int levelRoot) {
        if (levelRoot != this.getLevelNode()) {
            printNode(this.getLevelNode() - levelRoot);
            System.out.println("|--" + this.getName());
        }
        for(Node node: childNodes) {
            if(node instanceof Folder) {
                ((Folder) node).nodeTree(levelRoot);
            } else {
                printNode(node.getLevelNode() - levelRoot);
                System.out.println("|--" + node.getName());
            }
        }
    }

    public void addNode(Node node) {
        node.setLevelNode(getLevelNode()+1);
        childNodes.add(node);
        if (node instanceof Folder) {
            ((Folder) node).setLevelChildNode();
        }
    }

    private void setLevelChildNode() {
        for (Node child : childNodes) {
            if (child instanceof Folder) {
                child.setLevelNode(child.getLevelNode() + 1);
                ((Folder) child).setLevelChildNode();
            } else {
                child.setLevelNode(this.getLevelNode() + 1);
            }
        }

    }

    @Override
    public void rename() {
        if(!this.checkCorrectnessName()) {
            numberOfFolders++;
            this.setName("NewFolder" + numberOfFolders);
        }
        System.out.println("Nowa nazwa folderu to: \"" + this.getName() + "\"");
    }

    public void removeNode(Node node) {
        childNodes.remove(node);
    }
}
