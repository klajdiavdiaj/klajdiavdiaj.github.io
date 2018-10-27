package scheduler.klajdi.project;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Job2 implements Job{ 
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Job2 --->>> New Job to run. Time is " + new Date());
		} 
}