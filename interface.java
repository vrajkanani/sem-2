interface class EventListener{
	public void performEvent();
}
interface class MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}
interface class KeyListener{
	public void keyPressed();
	public void keyReleased();
}
class EventDemo implements MouseListener,KeyListener{
	public void performEvent();
	System.out.println("event performed");

	public void mouseClicked();
	System.out.println("mouse clicked");

	public void mousePressed();
	System.out.println("mouse presed");

	public void mouseReleased();
	System.out.println("mouse released");

	public void mouseMoved();
	System.out.println("mouse movede");

	public void mouseDragged();
	System.out.println("mouse dragged");

	public void keyPressed();
	System.out.println("key pressed");

	public void keyReleased();
	System.out.println("key released");
}
