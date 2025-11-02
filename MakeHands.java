import java.util.*;

public class MakeHands {

    static class Card {
        int value;
        int suit;
        Card(int v, int s) { value = v; suit = s; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int N = sc.nextInt();

        List<Card> list1 = new ArrayList<>();
        List<Card> list2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String c1 = sc.next();
            int s1 = sc.nextInt();
            String c2 = sc.next();
            int s2 = sc.nextInt();
            list1.add(new Card(parseValue(c1), s1));
            list2.add(new Card(parseValue(c2), s2));
        }
        int[] suitOrder = new int[4];
        for (int i = 0; i < 4; i++) suitOrder[i] = sc.nextInt();

        int[] priorityRank = new int[5]; // suits are 1..4
        for (int i = 0; i < 4; i++) {
            int suit = suitOrder[i];
            priorityRank[suit] = 4 - i; // highest gets 4, lowest gets 1
        }

        Comparator<Card> rearrangeComparator = new Comparator<Card>() {
            @Override
            public int compare(Card a, Card b) {
                if (a.value != b.value) return a.value - b.value;
                return priorityRank[a.suit] - priorityRank[b.suit];
            }
        };

        Collections.sort(list1, rearrangeComparator);
        Collections.sort(list2, rearrangeComparator);

        Queue<Card> p1 = new LinkedList<>(list1); // Vaishnavi
        Queue<Card> p2 = new LinkedList<>(list2); // Suraj

        String result = simulateGame(p1, p2, priorityRank, rearrangeComparator);
        System.out.println(result);
        sc.close();
    }

    static int parseValue(String c) {
        if (c.equals("A")) return 1;
        if (c.equals("J")) return 11;
        if (c.equals("Q")) return 12;
        if (c.equals("K")) return 13;
        return Integer.parseInt(c);
    }

    static String simulateGame(Queue<Card> p1, Queue<Card> p2, final int[] priorityRank, Comparator<Card> rearrangeComparator) {
        Deque<Card> hand = new ArrayDeque<>();
        boolean turnP1 = true;

        while (true) {
            if (p1.isEmpty() && p2.isEmpty()) return "TIE";
            if (turnP1 && p1.isEmpty()) {
                if (p2.isEmpty()) return "TIE";
                return "LOSER";
            }
            if (!turnP1 && p2.isEmpty()) {
                if (p1.isEmpty()) return "TIE";
                return "WINNER";
            }
            Card current = turnP1 ? p1.poll() : p2.poll();
            if (hand.isEmpty()) {
                hand.addFirst(current);
                turnP1 = !turnP1;
                continue;
            }

            Card top = hand.peekFirst();
            if (current.value == top.value && priorityRank[current.suit] > priorityRank[top.suit]) {
                hand.addFirst(current);
                List<Card> collected = new ArrayList<>(hand);
                hand.clear();
                Collections.sort(collected, rearrangeComparator);
                if (turnP1) {
                    for (Card c : collected) p1.add(c);
                } else {
                    for (Card c : collected) p2.add(c);
                }
            } else {
                hand.addFirst(current);
                turnP1 = !turnP1;
            }
        }
    }
}
