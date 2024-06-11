// You are given an array of jobs, where each job has a deadline and an associated profit if the job is finished before its deadline. Each job takes exactly one unit of time to complete, and you can only schedule one job at a time.

// Objective
// Maximize the total profit by scheduling the jobs in such a way that the jobs with higher profit are prioritized and completed within their respective deadlines.

import java.util.ArrayList;
import java.util.*;

public class JobSequencingProblem {
    static class Job {
        int deadline;
        int profit;
        int id;

        Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String args[]) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max job: " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i));
        }
    }
}
