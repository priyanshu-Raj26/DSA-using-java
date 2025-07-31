// Job Sequencing Problem

import java.util.*;

public class Problem_03 {

    static class Job {
        char id;
        int deadline, profit;

        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }

    }

    public static void maxProfit(Job[] jobs) {
        // Step 1: Sort jobs by deadline
        Arrays.sort(jobs, Comparator.comparingInt(j -> j.deadline));
        // Min-heap to keep jobs with least profit on top
        PriorityQueue<Job> pq = new PriorityQueue<>(Comparator.comparingInt(j -> j.profit));

        for (int i = 0; i < jobs.length; i++) {
            Job job = jobs[i];

            // If we have room to schedule within current deadline, add job
            if (pq.size() < job.deadline) {
                pq.offer(job);
            } else if (!pq.isEmpty() && pq.peek().profit < job.profit) {
                // Replace job with the least profit if this one is better
                pq.poll();
                pq.offer(job);
            }
        }

        // Collect scheduled jobs for output (since PQ doesn't preserve order)
        List<Job> result = new ArrayList<>(pq);
        // Optional: sort by deadline or as desired for display
        result.sort(Comparator.comparingInt(j -> j.deadline));

        // Print selected jobs in scheduled order
        System.out.print("Scheduled jobs: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).id);
            if (i != result.size() - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job('a', 4, 20),
                new Job('b', 1, 10),
                new Job('c', 1, 40),
                new Job('d', 1, 30)
        };
        maxProfit(jobs);
    }
}
