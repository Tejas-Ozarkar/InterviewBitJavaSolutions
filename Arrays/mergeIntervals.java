/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        int start = newInterval.start, end=newInterval.end;
        for(int i = 0;i<intervals.size(); i++){
            Interval interval = intervals.get(i);
            if(newInterval.start > interval.end)
                result.add(interval);
            else if(newInterval.end < interval.start){
                result.add(new Interval(start, end));
                result.addAll(intervals.subList(i, intervals.size()));
                return result;
            }
            else{
                start = Math.min(interval.start, start);
                end = Math.max(interval.end, end);
            }
        }
        result.add(new Interval(start, end));
        return result;
    }
}
