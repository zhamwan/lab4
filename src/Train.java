package src;

public class Train{
    private String trainname;
    private City city;
    public Train(String trainname, City city){
        this.trainname = trainname;
        this.city = city;
    }
    public String  getnametrain(){
        return trainname;
    }
    public City  getcity(){
        return city;
    }
    public class Railway_carriage{
        private String name;
        public Railway_carriage(String name){
            this.name = name;
        }
        public String getnamerailway(){
            return name;
        }
        public void full(LoonHuman loonhuman){
            System.out.println(" Railway carriage full" + loonhuman.getname() );
        }
    }
}