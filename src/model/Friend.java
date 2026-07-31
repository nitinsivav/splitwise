package model;

/**
 * Will Store The Name And Id Of Friends
 */
public class Friend{

    private static int idGenerator = 0;
    private final int id ;
    private final String name;

    /**
     * Constructor
     * @param name Name Of The Friend
     */
    public Friend(String name) {
        idGenerator++;
        this.name = name;
        this.id = idGenerator;
    }

    /**
     *
     * @return The Name Of The User
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return The Unique ID
     */
    public int getId(){
        return id;
    }

}