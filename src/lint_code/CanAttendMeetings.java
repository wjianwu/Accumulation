package lint_code;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wjianwu 2019/6/5 14:28
 */
public class CanAttendMeetings {

    private static boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return true;
        }
        Set<Integer> times = new HashSet<>();
        times.add(intervals.get(0).start);
        times.add(intervals.get(0).end);
        Object[] r = times.toArray();
        for (int i = 1; i < intervals.size(); i++) {
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;
            int j = 0;
            while (j < r.length - 1) {
                int x = (int) r[j];
                int y = (int) r[j + 1];
                if (start > x && j % 2 == 0 && start < y) {
                    return false;
                }
                if (end > x && j % 2 == 0 && end < y) {
                    return false;
                }
                j++;
            }
            times.add(start);
            times.add(end);
        }
        return true;
    }

    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        Interval interval = new Interval(0, 30);
        Interval interval1 = new Interval(5, 10);
        Interval interval2 = new Interval(15, 20);
        list.add(interval);
        list.add(interval1);
        list.add(interval2);
        System.out.println(canAttendMeetings(list));
    }

}

class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}