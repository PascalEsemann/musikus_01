package de.pascal_esemann.musikus;

/**
 * Created by Pascal_2 on 19.06.2015.
 */
public class Datafactory {
    //Attributs
    private static final Datafactory datastore = new Datafactory();
    private Data[] datas = new Data();
    private Farben[] farben = new Farben();
    private String logoname = new String();
    private String title = new String();
    private Pages[] pages = new Pages();
    private Museumsdatas[] museumsdata = new Museumsdatas();
    private Fragen[] fragen = new Fragen();

    
    //Methods
    public Datafactory(){
    getDBData();
    }
    //singleton
    public static Datafactory getInstance(){
        return datastore;
    }
}
