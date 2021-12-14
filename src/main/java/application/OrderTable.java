package application;

public class OrderTable {
    String p_name;
    int pro_id, p_Quantity,p_price;
    float dis_amt,total_amt;


    public int getPro_id() {
        return pro_id;
    }

    public String getP_name() {
        return p_name;
    }

    public int getP_price() {
        return p_price;
    }

    public int getP_Quantity() {
        return p_Quantity;
    }
    public float getDis_amt() {
        return dis_amt;
    }
    public float getTotal_amt() {
        return total_amt;
    }



    public OrderTable(int pro_id, String p_name, int p_price, int p_Quantity,float dis_amt,float total_amt) {
        this.pro_id = pro_id;
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_Quantity =p_Quantity;
        this.dis_amt =dis_amt;
        this.total_amt =total_amt;
    }
}
