package lab_04_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class HTMLComponent {

	private String tagName;
	private Map<String, Object> attributes;

	private Collection<HTMLComponent> children = new ArrayList<>();

	public void print() {
		print("");
	}

	public abstract void print(String prefix);

	public void addItem(HTMLComponent item) {
		children.add(item);
	}

	public HTMLComponent(String tagName) {
		this.tagName = tagName;
		attributes = new HashMap<>();
	}

	public String getTagName() {
		return this.tagName;
	}

	public Collection<HTMLComponent> getChildren() {
		return this.children;
	}

	public String getAttributes() {
		StringBuffer attString = new StringBuffer();
		for (Entry<?, ?> e : attributes.entrySet()) {
			attString.append(e.getKey());
			if (e.getValue() instanceof String) {
				attString.append("=\"");
				attString.append(e.getValue());
				attString.append("\"");
			} else {
				attString.append("=");
				attString.append(e.getValue());
			}
		}
		return attString.toString();
	}

	public void setAttribute(String name, String value) {
		this.attributes.put(name, value);
	}

}
