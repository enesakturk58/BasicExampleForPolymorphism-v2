public class FileLogger extends BaseLogger {
    @Override
    public void Log(String message){
        System.out.println("Logged to File : " + message);
    }
}
