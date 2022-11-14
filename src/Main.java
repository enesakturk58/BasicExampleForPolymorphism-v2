public class Main {
    public static void main(String[] args) {

        System.out.println("----------- Burasi sadece bir örnek -------------"); // Bu satir Konsol gösterimi için yapilmistir.

        BaseLogger[] baseLoggers = new BaseLogger[]
                {new ConsoleLogger(),new DataBaseLogger(),new EmailLogger(),new FileLogger()};

        for (BaseLogger baseLogger:baseLoggers){
            baseLogger.Log("Log mesaji.");
        }
        System.out.println("-----------Asil göstermek istedigim asagidadir. -------------"); // Bu satir Konsol gösterimi için yapilmistir.

        CostumerManager costumerManager = new CostumerManager(new FileLogger());
        costumerManager.add();

    }
}