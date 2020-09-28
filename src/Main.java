public class Main {

    static void func1(int n)
    {
        int k = 0;

        for (int i = 0; i < n; i++)
        {
            if (i != n - 1) System.out.print((k + 1) + ", ");
            else System.out.println(k + 1);

            if (i == k * (k + 1))
                k++;
        }
    }

    static void func2(int n)
    {
        func3(1, n);
    }

    static void func3(int t0, int t1)
    {
        if (t0 < t1) vozr(t0,t1);
        else ubiv(t0,t1);
    }

    static void vozr(int t0, int t1) {
        if (t0 > t1) return;
        if (t0 != t1) System.out.print(t0 + ", ");
        else System.out.println(t0);
        vozr(t0 + 1, t1);
    }

    static void ubiv(int t0, int t1) {
        if (t0 < t1) return;
        if (t0 != t1) System.out.print(t0 + ", ");
        else System.out.println(t0);
        ubiv(t0-1, t1);
    }

    public static void main(String[] args) {
        func1(5);
        System.out.println();
        func2(8);
        System.out.println();
        func3(7, 2);
        System.out.println();
        func3(5, 10);
    }
}