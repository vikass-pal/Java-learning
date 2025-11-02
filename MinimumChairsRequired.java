import java.util.*;

public class MinimumChairsRequired {
    static class Order {
        int arrival;
        int packTime;
        int vip;
        int index;
        Order(int a, int p, int v, int i) {
            arrival = a;
            packTime = p;
            vip = v;
            index = i;
        }
    }

    public static int minChairsRequired(List<Order> orders) {
        Collections.sort(orders, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                if (o1.arrival != o2.arrival) return o1.arrival - o2.arrival;
                if (o1.vip != o2.vip) return o2.vip - o1.vip;
                return o1.index - o2.index;
            }
        });

        int n = orders.size();
        int i = 0, served = 0;
        int currentTime = 0;
        boolean busy = false;
        int finishTime = 0;
        int maxChairs = 0;

        Queue<Order> vipQ = new LinkedList<Order>();
        Queue<Order> regQ = new LinkedList<Order>();

        while (served < n) {
            int nextArrival = (i < n) ? orders.get(i).arrival : Integer.MAX_VALUE;

            if (busy) {
                if (nextArrival < finishTime) {
                    currentTime = nextArrival;
                    List<Order> vipBatch = new ArrayList<Order>();
                    List<Order> regBatch = new ArrayList<Order>();

                    while (i < n && orders.get(i).arrival == currentTime) {
                        Order o = orders.get(i++);
                        if (o.vip == 1) vipBatch.add(o);
                        else regBatch.add(o);
                    }
                    Collections.sort(vipBatch, new Comparator<Order>() {
                        public int compare(Order a, Order b) {
                            return a.packTime - b.packTime;
                        }
                    });
                    Collections.sort(regBatch, new Comparator<Order>() {
                        public int compare(Order a, Order b) {
                            return a.packTime - b.packTime;
                        }
                    });

                    vipQ.addAll(vipBatch);
                    regQ.addAll(regBatch);

                    maxChairs = Math.max(maxChairs, vipQ.size() + regQ.size());
                } else {
                    currentTime = finishTime;
                    busy = false;
                    served++;
                }
            } else {
                if (!vipQ.isEmpty() || !regQ.isEmpty()) {
                    Order next = !vipQ.isEmpty() ? vipQ.poll() : regQ.poll();
                    busy = true;
                    finishTime = Math.max(currentTime, next.arrival) + next.packTime;
                } else {
                    if (i < n) {
                        currentTime = orders.get(i).arrival;
                        List<Order> vipBatch = new ArrayList<Order>();
                        List<Order> regBatch = new ArrayList<Order>();

                        while (i < n && orders.get(i).arrival == currentTime) {
                            Order o = orders.get(i++);
                            if (o.vip == 1) vipBatch.add(o);
                            else regBatch.add(o);
                        }
                        Collections.sort(vipBatch, new Comparator<Order>() {
                            public int compare(Order a, Order b) {
                                return a.packTime - b.packTime;
                            }
                        });
                        Collections.sort(regBatch, new Comparator<Order>() {
                            public int compare(Order a, Order b) {
                                return a.packTime - b.packTime;
                            }
                        });

                        vipQ.addAll(vipBatch);
                        regQ.addAll(regBatch);

                        if (!vipQ.isEmpty() || !regQ.isEmpty()) {
                            Order next = !vipQ.isEmpty() ? vipQ.poll() : regQ.poll();
                            busy = true;
                            finishTime = currentTime + next.packTime;
                             maxChairs = Math.max(maxChairs, vipQ.size() + regQ.size());
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        return maxChairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        List<Order> orders = new ArrayList<Order>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();
            orders.add(new Order(a, p, v, i));
        }
        System.out.println(minChairsRequired(orders));
        sc.close();
    }
}
