public abstract class MonitorPortlet {

	public abstract String getTitle(); (*@ \label{listing:MonitorPortlet3} @*)

	public abstract String getId(); (*@ \label{listing:MonitorPortlet5} @*)

	public boolean isDefault() { (*@ \label{listing:MonitorPortlet7} @*)
		return false;
	}

	public abstract int getPreferredWidth(); (*@ \label{listing:MonitorPortlet11} @*)

	public abstract int getPreferredHeight(); (*@ \label{listing:MonitorPortlet13} @*)

	public Optional<String> getIconUrl() { (*@ \label{listing:MonitorPortlet15} @*)
		return Optional.empty();
	}

	public Optional<String> getDetailViewUrl() { (*@ \label{listing:MonitorPortlet19} @*)
		return Optional.empty();
	}

	@Override
	public String toString() {
		return "MonitorPortlet{'" + getId() + "'}";
	}
}
