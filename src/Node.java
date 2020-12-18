public abstract class Node {
    private String name;
    private int levelNode = 0;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelNode() {
        return levelNode;
    }

    public void setLevelNode(int levelNode) {
        this.levelNode = levelNode;
    }

    public boolean checkCorrectnessName() {
        for(int i = 0; i < name.length(); i++) {
            Character character = name.charAt(i);
            if(!(Character.isLetterOrDigit(character) || character.equals('.'))) {
                return false;
            }
        }
        return true;
    }

    public abstract void rename();
}
