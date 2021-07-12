public abstract class MonitorPortletFactory implements ExtensionPoint {

	public abstract Collection<MonitorPortlet> getPortlets(Run<?, ?> build); (*@ \label{listing:MonitorPortletFactory3} @*)

	public abstract String getDisplayName(); (*@ \label{listing:MonitorPortletFactory5} @*)

}
