package lab_04_03;

public class HTMLComposite extends HTMLComponent {

	public HTMLComposite(String tagName) {
		super(tagName);
	}

	@Override
	public void print(String prefix) {
		String attributeString = getAttributes();
		System.out
				.println(prefix + "<" + getTagName() + (attributeString.isEmpty() ? "" : " " + attributeString) + ">");
		for (HTMLComponent component : getChildren()) {
			component.print("\t" + prefix);
		}
		System.out.println(prefix + "</" + getTagName() + ">");
	}

}
