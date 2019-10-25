package Class.meal;

public class Director {    // 将一个复杂的构建过程与其表示相分离
    private Builder builder;    // 针对接口编程，而不是针对实现编程
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void constructA() {   // 控制（定义）一个复杂的构建过程
        builder.buildAPart1();
        builder.buildAPart2();
        builder.buildAPart3();
    }
    public void constructB() {   // 控制（定义）一个复杂的构建过程
        builder.buildBPart1();
        builder.buildBPart2();
        builder.buildBPart3();
    }
}
