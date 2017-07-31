package com.abdymalikmulky.firebasejoblocationexample;

import android.util.Log;

import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;

/**
 * Bismillahirrahmanirrahim
 * Created by abdymalikmulky on 7/31/17.
 */

public class MyJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters job) {
        // Do some work here
        Log.d("JOBSERVICES", "START");
        Log.d("JOBSERVICES", job.getTag());
        Log.d("JOBSERVICES", job.getExtras().toString());
        return false; // Answers the question: "Is there still work going on?"
    }

    @Override
    public boolean onStopJob(JobParameters job) {
        Log.d("JOBSERVICES", "END");

        return false; // Answers the question: "Should this job be retried?"
    }
}