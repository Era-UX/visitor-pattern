import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FsVisitor {
    private String extension;
    private List<String> foundFiles;

    public SearchVisitor(String extension) {
        this.extension = extension;
        this.foundFiles = new ArrayList<>();
    }

    @Override
    public void visitFile(FsFile file) {
        System.out.print("[SearchVisitor] Checking file: " + file.getName());
        if (file.getName().endsWith(extension)) {
            foundFiles.add(file.getName());
            System.out.println(" -> Match! Added to the list.");
        } else {
            System.out.println(" -> Skipped (not " + extension + ").");
        }
    }

    @Override
    public void visitDirectory(FsDirectory directory) {
        System.out.println("[SearchVisitor] Entered directory: " + directory.getName());
    }

    public List<String> getFoundFiles() {
        return foundFiles;
    }
}