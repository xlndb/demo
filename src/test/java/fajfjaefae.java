import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lide
 */
public class fajfjaefae {
    public static void main(String[] args) {
        List<ListNode> list = new LinkedList<>();
        list = list.stream().sorted(Comparator.comparingInt(a -> a.val)).collect(Collectors.toList());

    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
