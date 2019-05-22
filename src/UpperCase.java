public class UpperCase extends TextDecorator{
    public UpperCase(Text decoText){
        super(decoText);
    }
    @Override
    public void write(){
        //decoText.write();
        setUpperOne(decoText);
    }
    private void setUpperOne(Text decoText){
        String S = new String("Then, everything changed when the Fire Nation attacked. ");
        System.out.println(S.toUpperCase());
    }
}