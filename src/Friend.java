public class Friend{

    private static int idGenerator = 0;
    private final int id ;
    private final String name;

    public Friend(String name) {
        idGenerator++;
        this.name = name;
        this.id = idGenerator;
    }

    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }

}