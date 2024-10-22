package JobScheduler.ejercicio10;

public class FIFOScheduler extends JobScheduler{
	
	public JobDescription next() {
		JobDescription nextJob = jobs.get(0);
		this.unschedule(nextJob);
		return nextJob;
	}
}
