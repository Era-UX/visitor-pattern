public class SizeCalculatorVisitor implements FsVisitor {
    private long totalSize = 0;

    @Override
    public void visitFile(FsFile file) {
        totalSize += file.getSize();
        System.out.println("[SizeCalculator] Visiting file: " + file.getName() +
                " | Size: " + file.getSize() + " bytes | Current total: " + totalSize);
    }

    @Override
    public void visitDirectory(FsDirectory directory) {
        System.out.println("[SizeCalculator] Visiting directory: " + directory.getName() +
                " | Size: 0 bytes | Going deeper...");
    }

    public long getTotalSize() {
        return totalSize;
    }
}