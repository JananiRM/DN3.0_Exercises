public class WordDocument implements Document {
    @Override
    public void edit() {
        System.out.println("Edit the Word document .");
    }

    @Override
    public void save() {
        System.out.println("Save the Word document.");
    }
}
