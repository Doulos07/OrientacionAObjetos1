package JobScheduler.ejercicio10;

public class LIFOScheduler extends JobScheduler{

	@Override
	public JobDescription next() {
		JobDescription nextJob = jobs.get(jobs.size()-1);
		this.unschedule(nextJob);
		return nextJob;
	}
}
