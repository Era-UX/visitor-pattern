import java.util.Collections;
import java.util.List;

public interface FsNode {
    void accept(FsVisitor visitor);

    default List<FsNode> getChildren() {
        return Collections.emptyList();
    }
}