public class DataBaseLogger extends BaseLogger{
    @Override
    public void Log(String message){
        System.out.println("Logged to Database : " + message);
    }
}
