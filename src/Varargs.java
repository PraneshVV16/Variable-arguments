class Varargs
{
    static void fun(String str, int ...a)
    {
        System.out.println("String: " + str);
        System.out.println("Number of arguments is: "+ a.length);


        for (int i: a)
            System.out.print(i + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        fun("Anywhereworks", 100, 200);
        fun("CWA", 1, 2, 3, 4, 5);
        fun("Developer");
    }
}