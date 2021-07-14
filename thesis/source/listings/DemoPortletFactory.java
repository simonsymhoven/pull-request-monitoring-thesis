@Extension(optional = true) (*@ \label{listing:DemoPortletFactory1} @*)
public static class DemoPortletFactory extends MonitorPortletFactory {

	@Override
	public Collection<MonitorPortlet> getPortlets(final Run<?, ?> build) {
		List<MonitorPortlet> portlets = new ArrayList<>();
		portlets.add(new DemoPortlet("Good First Portlet", "first-demo-portlet"));
		portlets.add(new DemoPortlet("Another Portlet", "second-demo-portlet"));
		return portlets;
	}

	@Override
	public String getDisplayName() {
		return "Pull Request Monitoring (Demo)";
	}

}