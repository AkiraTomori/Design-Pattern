package Creational.Builder.products;

public class Manual {
    private final StringBuilder text = new StringBuilder();

    public void addLine(String line) {
        text.append(line).append("\n");
    }

    public String getText() {
        return text.toString();
    }

    public void show() {
        System.out.println(text.toString());
    }
}
