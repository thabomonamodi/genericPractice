public class genericPractice<T>
{
    private static Object param;
    /*private int intArray;
    String stringArray;*/
    public genericPractice()
    {}

    public static <T> void printArrayContent(T[] arr)
    {
        for (T element: arr)
        {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

//    public T get1()
//    {
//        return ;
//    }
    public void set(Object Array)
    {
        param = Array;
    }
    public Object get()
    {
        System.out.println(param);
        return param;
    }

    public static void main(String[] args)
    {
        genericPractice<String> stringInstance = new genericPractice<>();
        genericPractice<Integer> integerInstance = new genericPractice<>();

        Integer[] intArray = {100,95,0};
        String[] stringArray = {"hello","Julie"};

        genericPractice gen = new genericPractice();
        System.out.print("Array content: ");
        gen.printArrayContent(intArray);
        System.out.println("String instance:");
        stringInstance.set("Test");
        stringInstance.get();
        System.out.println("Integer instance:");
        integerInstance.set(1000);
        integerInstance.get();
    }
}
