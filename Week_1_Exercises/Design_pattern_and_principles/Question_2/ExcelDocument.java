public class ExcelDocument implements Document {
    @Override
    public void edit() {
        System.out.println("Edit the Excel document.");
    }

    @Override
    public void save() {
        System.out.println("Save the Excel document.");
    }
}
