public class SomeClass {
    public static int doubleANumber(int num) {
        return num * 2;
    }

    public static boolean returnABoolean(String inputData) {
        if ("Save".equalsIgnoreCase(inputData)) {
            return true;
        } else {
            return false;
        }
    }

    public static int voidFoo(String inputData) {
        if ("Ok".equalsIgnoreCase(inputData)) {
            System.out.println("doing something.");;
        } else {
            throw new IllegalArgumentException("Bad argument:" + inputData);
        }
        return 0;
    }
}
