package ex8_19_interface_Multiple_inheritance;

class Label implements Changeable {
	String text, foreground, background, font;
	int width, height;
	
	Label(String text, int width, int height, String foreground, String background, String font) {
		this.text = text;
		this.width = width;
		this.height = height;
		this.foreground = foreground;
		this.background = background;
		this.font = font;
	}
	
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void moveTo(int x, int y) {
		
	}
	
	public void setForeground(String foreground) {
		this.foreground = foreground;
	}
	
	public void setBackground(String background) {
		this.background = background;
	}
	
	public void setFont(String font) {
		this.font = font;
	}
}
