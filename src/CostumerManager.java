public class CostumerManager {

    private BaseLogger logger;

    public CostumerManager(BaseLogger logger){
        this.logger=logger;

    }
    public void add(){
        System.out.println("Musteri Eklendi");
        this.logger.Log("Log Mesajı.");
    }
}
