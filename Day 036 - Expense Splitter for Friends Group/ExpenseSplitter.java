import java.util.*;
import java.text.DecimalFormat;

public class ExpenseSplitter {
static class Person {
String name;
double paid;
double net;
Person(String name, double paid) {
this.name = name;
this.paid = paid;
}
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#0.00");

    System.out.print("Enter number of friends : ");
    int n = Integer.parseInt(sc.nextLine().trim());

    List<Person> people = new ArrayList<>();
    double total = 0.0;

    for (int i = 0; i < n; i++) {
        System.out.print("\nEnter name of friend " + (i + 1) + " : ");
        String name = sc.nextLine().trim();
        System.out.print("Enter amount paid by " + name + " : ");
        double paid = Double.parseDouble(sc.nextLine().trim());

        people.add(new Person(name, paid));
        total += paid;
    }

    double share = total / n;

    System.out.println("\nTotal Expense: " + df.format(total));
    System.out.println("Each Person Should Pay : " + df.format(share) + "\n");

    for (Person p : people) {
        p.net = Math.round((p.paid - share) * 100.0) / 100.0;
    }

    Queue<Person> creditors = new LinkedList<>();
    Queue<Person> debtors = new LinkedList<>();

    for (Person p : people) {
        if (p.net > 0) creditors.add(p);
        else if (p.net < 0) debtors.add(p);
    }

    System.out.println("Settlements:");
    while (!creditors.isEmpty() && !debtors.isEmpty()) {
        Person c = creditors.peek();
        Person d = debtors.peek();

        double amount = Math.min(c.net, -d.net);

        System.out.println(d.name + " pays " + df.format(amount) + " to " + c.name);

        c.net = Math.round((c.net - amount) * 100.0) / 100.0;
        d.net = Math.round((d.net + amount) * 100.0) / 100.0;

        if (Math.abs(c.net) < 0.01) creditors.poll();
        if (Math.abs(d.net) < 0.01) debtors.poll();
    }

    System.out.println("\nAll expenses are settled.");
    sc.close();
}


}
