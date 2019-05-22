public class TextDecorator implements Text{
    protected Text decoText;
    public TextDecorator(Text decoText){
        this.decoText = decoText;
    }
    public void write(){
        decoText.write();
    }
}
