package Composite_Lab4_3;

import java.io.IOException;

public class Client {
	public static void main(String[] args) throws IOException {
		HTMLComponent html = new HTMLComposite("HTML");
		HTMLComponent head = new HTMLComposite("HEAD");
		HTMLComponent title = new HTMLLeaf("TITLE", "Your Title Here");
		head.addItem(title);
		html.addItem(head);

		HTMLComponent body = new HTMLComposite("BODY");
		HTMLComponent center = new HTMLComposite("CENTER");
		HTMLComponent img = new HTMLLeaf("IMG");
		img.setAttribute("SRC", "clouds.jpg");
		center.addItem(img);
		body.addItem(center);
		
		HTMLComponent a = new HTMLComposite("a");
		a.setAttribute("href", "http://somegreatsite.com");
		HTMLComponent lbl = new HTMLLeaf("i","Link Name");
		a.addItem(lbl);
		body.addItem(a);

		HTMLComponent h1 = new HTMLLeaf("H1", "This is a Header");
		body.addItem(h1);

		HTMLComponent h2 = new HTMLLeaf("H2", "This is a Medium Header");
		body.addItem(h2);

		HTMLComponent b = new HTMLLeaf("B", "This is a new paragraph!");
		body.addItem(b);

		b = new HTMLComposite("B");
		HTMLComponent i = new HTMLLeaf("I", "This is a new sentence without a paragraph break, in bold italics.");
		b.addItem(i);
		body.addItem(b);
		html.addItem(body);

		html.print();

	}
}
