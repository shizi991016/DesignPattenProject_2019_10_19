/**
 * 迭代器模式接口，提供判断是否还有内容以及获得内容的方法
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
}