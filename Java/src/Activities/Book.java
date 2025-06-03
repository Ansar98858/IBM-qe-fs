package Activities;
abstract class Book {
    // Protected so subclass can access it directly
    protected String title;

    // Abstract method (no body)
    public abstract void setTitle(String s);

    // Concrete method
    public String getTitle() {
        return title;
    }
}