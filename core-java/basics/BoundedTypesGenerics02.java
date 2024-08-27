interface SampleInterface {
    void displayClass();
}

class BoundTest<T extends SampleClass & SampleInterface> {
    private T objRef;

    public BoundTest(T obj) {
        this.objRef = obj;
    }

    public void doRunTest() {
        objRef.displayClass();
    }
}

class SampleClass implements SampleInterface {
    public void displayClass() {
        System.out.println("Inside super Class A");
    }
}

public class BoundedTypesGenerics02 {
    public static void main(String[] args) {
        BoundTest<SampleClass> b = new BoundTest<>(new SampleClass());
        b.doRunTest();
    }
}
