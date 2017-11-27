package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 10:54
 * 版本 1.0.0
 * 描述 TODO
 */
public class AContainer<T> implements MyContainer {

    public String data[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public MyIterator getIterator() {
        return new AIterator();
    }

    private class AIterator implements MyIterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        @SuppressWarnings("unchecked")
        public T next() {
            if (hasNext()) {
                return (T) data[index++];
            }
            return null;
        }
    }
}
