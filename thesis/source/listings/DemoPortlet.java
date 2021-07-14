public class DemoPortlet extends MonitorPortlet {
	private final String id;
	private final String title;

	public DemoPortlet(final String title, final String id) {
		super();
		this.id = id;
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	} (*@ \label{listing:DemoPortlet12} @*)

	@Override
	public String getId() {
		return id;
	}

	@Override
	public int getPreferredWidth() {
		return 300;
	}

	@Override
	public int getPreferredHeight() {
		return 200;
	}
}
