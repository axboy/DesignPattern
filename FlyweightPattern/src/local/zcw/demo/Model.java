package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/1 15:19
 * 描述 数据模型
 */
public class Model {

    private int id;

    private String value;

    public Model(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
