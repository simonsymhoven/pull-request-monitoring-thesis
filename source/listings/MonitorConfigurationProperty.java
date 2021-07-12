public static Optional<MonitorConfigurationProperty> forCurrentUser() {
	final User current = User.current();
	return current == null ? Optional.empty() : Optional.ofNullable(current.getProperty(MonitorConfigurationProperty.class));
}