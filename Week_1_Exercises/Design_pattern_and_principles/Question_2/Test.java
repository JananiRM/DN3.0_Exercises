public class Test {
    public static void main(String[] args) {
        
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        Document wordDocument = wordFactory.createDocument();
        Document pdfDocument = pdfFactory.createDocument();
        Document excelDocument = excelFactory.createDocument();

        wordDocument.edit();
        wordDocument.save();

        pdfDocument.edit();
        pdfDocument.save();

        excelDocument.edit();
        excelDocument.save();
    }
}
