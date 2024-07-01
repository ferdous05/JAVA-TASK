
package Task14;


public class MovableCircle implements Movable {
	
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.radius = radius;
		center  = new MovablePoint(x, y , xSpeed, ySpeed);
	}
	

	public void moveUp() {
		center.y = center.y + center.ySpeed;
		
	}


	public void moveDown() {
		center.y = center.y - center.ySpeed;
	}

	@Override
	public void moveLeft() {
		center.x = center.x - center.xSpeed;
	}

	@Override
	public void moveRight() {
		center.x = center.x + center.xSpeed;
	}
	
	public String toString() {
        return "Movablecircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
	}

    @Override
    public void moveup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
