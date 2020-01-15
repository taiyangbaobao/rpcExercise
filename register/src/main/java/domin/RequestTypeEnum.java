package domin;


public enum RequestTypeEnum {
    PROVIDER(1,"provider"),
    CONSUMER(2,"consumer"),
    ;


    int type;
    String desc;

    RequestTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
