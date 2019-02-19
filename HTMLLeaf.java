package lab_04_03;

public class HTMLLeaf extends HTMLComponent {

	private String text;

	public HTMLLeaf(String tagName, String text) {
		super(tagName);
		this.text = text;
	}

	public HTMLLeaf(String tagName) {
		super(tagName);
	}

	@Override
	public void print(String prefix) {
		String attributeString = getAttributes();
		System.out.println(prefix + "<" + getTagName() + (attributeString.isEmpty() ? "" : " " + attributeString) + ">"
				+ text + "</" + getTagName() + ">");
	}

}
