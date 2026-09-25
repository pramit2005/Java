import java.util.HashMap;

class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        HashMap<Integer, Long> sch = new HashMap<>();
        long brk = 0;
        long day = 0;
        int i = 0;
        long j = 1;
        while (i < tasks.length) {
            if (!sch.containsKey(tasks[i])) {
                sch.put(tasks[i], j);
                day++;
                i++;
            }
            else if ((j - sch.get(tasks[i])) > space) {
                sch.put(tasks[i], j);
                day++;
                i++;
            }
            else {
                long breaks = space - (j - sch.get(tasks[i])) + 1;
                brk += breaks;
                j += breaks;
                continue;
            }
            j++;
        }
        return day + brk;
    }
}