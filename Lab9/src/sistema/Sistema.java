package sistema;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Sistema {

	private Map<String, String> tagsLinks;
	private Set<String> openTags;
	private Set<String> closeTags;
	private Stack<String> stack;

	public Sistema() {
		tagsLinks = buildTagsLinks();
		openTags = buildOpenTags();
		closeTags = buildCloseTags();
		stack = new Stack<String>();
	}

	public boolean validaTag(String text) {
		String[] textList = text.split(" "); // divide a string por palavras e adiciona ao array

		int i = 0;
		boolean validate = true;
		while (i < textList.length && validate) {

			String string = textList[i];
			if (openTags.contains(string)) { // se contain uma tag de abertura
				stack.push(string); // entao adiciona na pilha

			} else if (closeTags.contains(string)) { // se nao, se contem tag fechando
				if (!stack.empty() && stack.peek().equals(tagsLinks.get(string))) { // if a pilha nao estah vazia e o
																					// topo da pilha eh igual ah uma tag
																					// do map abrindo,
					stack.pop();													// entao exclua a tag da pilha

				} else {
					validate = false;
				}
			}
			i++;
		}

		if (!stack.isEmpty()) {
			validate = false;
		}

		return validate;

	}

	private Map<String, String> buildTagsLinks() {
		Map<String, String> tagsLinks = new HashMap<>();
		tagsLinks.put("</body>", "<body>");
		tagsLinks.put("</center>", "<center>");
		tagsLinks.put("</h1>", "<h1>");
		tagsLinks.put("</p>", "<p>");
		tagsLinks.put("</ol>", "<ol>");
		tagsLinks.put("</li>", "<li>");
		return tagsLinks;
	}
	
	
	
	
	
	
	
	
	
	

	private Set<String> buildOpenTags() {
		Set<String> openTags = new HashSet<>();
		openTags.add("<body>");
		openTags.add("<center>");
		openTags.add("<h1>");
		openTags.add("<p>");
		openTags.add("<ol>");
		openTags.add("<li>");
		return openTags;
	}

	private Set<String> buildCloseTags() {
		Set<String> closeTags = new HashSet<>();
		closeTags.add("</body>");
		closeTags.add("</center>");
		closeTags.add("</h1>");
		closeTags.add("</p>");
		closeTags.add("</ol>");
		closeTags.add("</li>");
		return closeTags;
	}

}
