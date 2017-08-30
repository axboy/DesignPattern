package local.zcw.demo;

import java.io.*;

/**
 * 作者 zcw
 * 时间 2017/8/30 15:01
 * 描述 TODO
 */
public abstract class Shape implements Cloneable {

    private String type;

    abstract void draw();


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    /**
     * FIXME 未测试
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private Object deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
