public class MonitoringDefaultAction implements RunAction2, StaplerProxy {

	private transient Run<?, ?> run;

	public Run<?, ?> getRun() {
		return run;
	}

	public String getConfiguration() {

		MonitorConfigurationProperty monitorConfigurationProperty = MonitorConfigurationProperty
				.forCurrentUser().orElse(null);

		return monitorConfigurationProperty == null
				? resolvePortlets() (*@ \label{listing:MonitoringDefaultAction15} @*)
				: monitorConfigurationProperty.getConfiguration(getConfigurationId()).getConfig(); (*@ \label{listing:MonitoringDefaultAction16} @*)
	}

	public String getConfigurationId() {
		String id = getRun().getParent().getParent().getDisplayName();
		return StringUtils.toRootLowerCase(id).replaceAll(" ", "-");
	}

	public String resolvePortlets() {
		MonitoringCustomAction action = getRun().getAction(MonitoringCustomAction.class);
		return action == null
				? getPortlets() (*@ \label{listing:MonitoringDefaultAction27} @*)
				: action.getPortlets(); (*@ \label{listing:MonitoringDefaultAction28} @*)
	}

	public String getPortlets() {
		return PortletService.getDefaultPortletsAsConfiguration(getRun()); (*@ \label{listing:MonitoringDefaultAction32} @*)
	}
}
