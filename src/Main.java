public class Main {
    public static void main(String[] args) {
        FsDirectory root = new FsDirectory("root");
        FsDirectory src = new FsDirectory("src");

        src.add(new FsFile("Main.java", 250));
        src.add(new FsFile("Util.java", 150));
        root.add(src);
        root.add(new FsFile("README.md", 100));

        System.out.println(" SCENARIO 1: Calculating size (SizeCalculatorVisitor)");
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        FsWalker.walk(root, sizeVisitor);
        System.out.println("");
        System.out.println("Total calculated size: " + sizeVisitor.getTotalSize() + " bytes\n");

        System.out.println(" SCENARIO 2: Searching files (SearchVisitor)");
        SearchVisitor searchVisitor = new SearchVisitor(".java");
        FsWalker.walk(root, searchVisitor);
        System.out.println("");
        System.out.println("Found files: " + searchVisitor.getFoundFiles());
    }
}