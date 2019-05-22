public class ColorText extends TextDecorator{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public ColorText(Text decoText){
        super(decoText);
    }
    @Override
    public void write(){
        //decoText.write();
        setColorOne(decoText);
    }
    private void setColorOne(Text decoText){
        System.out.println(ANSI_RED + "Only the Avatar, master of all four elements, could stop them, but when the world needed him most, he vanished." + ANSI_RESET);
    }
}