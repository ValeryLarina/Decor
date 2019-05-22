public class Main {

    public static void main(String[] args) {
        Text text = new BeautifulText();
        Text lowText = new LowerCase(new BeautifulText());
        Text uppText = new UpperCase(new BeautifulText());
        Text redText = new ColorText(new BeautifulText());
        text.write();
        lowText.write();
        uppText.write();
        redText.write();
    }
}
