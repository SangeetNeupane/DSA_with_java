class reezu {
    int size;
    int t = -1;
    int ar[];

    reezu(int a) {
        ar = new int[a];
        size = a;
    }

    void push(int b) {
        t++;
        if (size <= t) {
            System.out.println("Stack Is Full.");
        } else {
            ar[t] = b;
            System.out.println("Pushed Data is " + b);
        }
    }

    void pop() {
        if (t < 0) {
            System.out.println("Stack Is Empty.");
        } else {
            int c = ar[t];
            System.out.println("Poped Data is " + c);

            t--;
        }

    }
    void peek()
    {
        if (t < 0) {
            System.out.println("Stack Is Empty.");
        } else 
        {
            System.out.println("Peeked Data is " +ar[t]); 
        }
    }
}

public class examstack {
    public static void main(String[] args) {
        reezu rz = new reezu(10);
        rz.pop();
        rz.push(10);
        rz.push(5);
        rz.pop();
        rz.push(4);
        rz.push(2);
        rz.peek();
    }

}
