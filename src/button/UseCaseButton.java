package button;

public class UseCaseButton {
	private static final long serialVersionUID = 1L;
	public SelectButton(UMLCanvas canvas, String name) {
		super(canvas, name);
	}
	public void actionPerformed(ActionEvent e) {
		this.canvas.setCurrentMode(new SelectMode(canvas));
	}
}
