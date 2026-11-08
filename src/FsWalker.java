public class FsWalker {
    public static void walk(FsNode node, FsVisitor visitor) {
        node.accept(visitor);

        for (FsNode child : node.getChildren()) {
            walk(child, visitor);
        }
    }
}