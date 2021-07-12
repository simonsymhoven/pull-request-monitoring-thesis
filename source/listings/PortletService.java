public final class PortletService {

	public static List<? extends MonitorPortletFactory> getFactories() {
		return ExtensionList.lookup(MonitorPortletFactory.class);
	}
	
	public static List<? extends MonitorPortlet> getAvailablePortlets(final Run<?, ?> build) {
		return getFactories()
				.stream()
				.map(factory -> factory.getPortlets(build))
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
	}
}