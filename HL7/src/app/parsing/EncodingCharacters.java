package app.parsing;

/**
 * @author Daniel Karner
 */
public class EncodingCharacters {
	private String fieldSeperator;
	private String componentSeperator;
	private String subcomponentSeperator;
	private String fieldRepeatSeperator;
	private String escapeCharacter;

	/**
	 * @param fieldSeperator
	 * @param componentSeperator
	 * @param subcomponentSeperator
	 * @param fieldRepeatSeperator
	 * @param escapeCharacter
	 */
	public EncodingCharacters(String fieldSeperator, String componentSeperator, String subcomponentSeperator,
			String fieldRepeatSeperator, String escapeCharacter) {
		String usedSeps = "";
		this.fieldSeperator = fieldSeperator != null && !usedSeps.contains(fieldSeperator) ? fieldSeperator : "|";
		this.componentSeperator = componentSeperator != null && !usedSeps.contains(componentSeperator)
				? componentSeperator
				: "^";
		this.subcomponentSeperator = subcomponentSeperator != null && !usedSeps.contains(subcomponentSeperator)
				? subcomponentSeperator
				: "&";
		this.fieldRepeatSeperator = fieldRepeatSeperator != null && !usedSeps.contains(fieldRepeatSeperator)
				? fieldRepeatSeperator
				: "~";
		this.escapeCharacter = escapeCharacter != null && !usedSeps.contains(escapeCharacter) ? escapeCharacter : "\\";
	}

	/**
	 * @see app.parsing.EncodingCharacters
	 */
	public EncodingCharacters() {
		this("|", "^", "&", "~", "\\");
	}

	public String getFieldSeperator() {
		return fieldSeperator;
	}

	public String getComponentSeperator() {
		return componentSeperator;
	}

	public String getSubcomponentSeperator() {
		return subcomponentSeperator;
	}

	public String getFieldRepeatSeperator() {
		return fieldRepeatSeperator;
	}

	public String getEscapeCharacter() {
		return escapeCharacter;
	}

	public String[] getSeperators() {
		return new String[] { "", this.fieldSeperator, this.componentSeperator, this.subcomponentSeperator,
				this.fieldRepeatSeperator, this.escapeCharacter };
	}
}
