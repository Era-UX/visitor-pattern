import java.util.ArrayList;
import java.util.List;

public class FsDirectory implements FsNode {
    private String name;
    private List<FsNode> children;

    public FsDirectory(String name, List<FsNode> children) {
        this.name = name;
        this.children = new ArrayList<>(children);
    }

    public FsDirectory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public FsDirectory() {
        this.name = "unnamed_dir";
        this.children = new ArrayList<>();
    }

    public void add(FsNode node) {
        children.add(node);
    }

    public String getName() {
        return name;
    }

    @Override
    public List<FsNode> getChildren() {
        return children;
    }

    @Override
    public void accept(FsVisitor visitor) {
        visitor.visitDirectory(this);
    }
}