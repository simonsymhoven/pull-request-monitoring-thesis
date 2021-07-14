@Override
public Void run() throws Exception {

    if (PullRequestFinder.isPullRequest(run.getParent())) {
        getContext().get(TaskListener.class).getLogger()
            .println("[Monitor] Build is part of a pull request. Add 'MonitoringCustomAction' now.");

        run.addAction(new MonitoringCustomAction(monitor.getPortlets()));
    }
    else {
        getContext().get(TaskListener.class).getLogger()
            .println("[Monitor] Build is not part of a pull request. Skip adding 'MonitoringCustomAction'.");
    }

    return null;
}