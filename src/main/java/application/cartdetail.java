package application;

public class cartdetail {
    String p_name, p_price;
    int pro_id, p_Quantity;

    public int getPro_id() {
        return pro_id;
    }

    public String getP_name() {
        return p_name;
    }

    public String getP_price() {
        return p_price;
    }

    public int getP_Quantity() {
        return p_Quantity;
    }


    public cartdetail(int pro_id, String p_name, String p_price, int p_Quantity) {
        this.pro_id = pro_id;
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_Quantity = p_Quantity;
    }
}
