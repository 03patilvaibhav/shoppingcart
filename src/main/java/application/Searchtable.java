package application;

public class Searchtable {
    String pro_name,pro_desc ;
    int pro_id,pro_price;

    public int getPro_id()
    {
        return pro_id;
    }

    public String getPro_name()
    {
        return pro_name;
    }

    public int getPro_price()
    {
        return pro_price;
    }
    public String getPro_desc()
    {
        return pro_desc;
    }




    public Searchtable(int pro_id,String pro_name,int pro_price,String pro_desc) {
        this.pro_id = pro_id;
        this.pro_name = pro_name;
        this.pro_price = pro_price;
        this.pro_desc = pro_desc;
    }

}

