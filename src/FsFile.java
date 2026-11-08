public class FsFile implements FsNode {
    private String name;
    private long size;

    public FsFile(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public FsFile(String name) {
        this.name = name;
        this.size = 0;
    }

    public FsFile() {
        this.name = "unnamed_file";
        this.size = 0;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    @Override
    public void accept(FsVisitor visitor) {
        visitor.visitFile(this);
    }
}