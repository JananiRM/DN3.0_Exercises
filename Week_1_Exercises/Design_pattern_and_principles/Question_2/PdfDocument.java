public class PdfDocument implements Document {
    @Override
    public void edit() {
        System.out.println("Edit the PDF document.");
    }

    @Override
    public void save() {
        System.out.println("Save the  PDF document.");
    }
}
