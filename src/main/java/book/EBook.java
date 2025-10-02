package book;

public class EBook extends Book {
    private final String ebook;
    private final String fileSize;

    public EBook(String ebook, String fileSize) {
     super(ebook, fileSize);
        this.ebook = ebook;
        this.fileSize = fileSize;
    }
    public void showInfo() {
        super.showInfo();
        String title = "";
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("파일 크기 : " + fileSize + "MB");
    }

}

