public class LowerCase extends TextDecorator {
    public LowerCase(Text decoText){
        super(decoText);
    }
    @Override
    public void write(){
        //decoText.write();
        setLowerOne(decoText);
    }
    private void setLowerOne(Text decoText){
        String S = new String("Long Ago, The Four Nations Lived Together In Harmony.");
        System.out.println(S.toLowerCase());
    }
}
