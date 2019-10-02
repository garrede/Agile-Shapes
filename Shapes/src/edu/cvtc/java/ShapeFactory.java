package edu.cvtc.java;

public class ShapeFactory {
	
	private Dialog dialog;

	private Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public ShapeFactory(Dialog dialog) {
		setDialog(dialog);
	}
	
	public Shape make(ShapeType type){
		
		if (type.equals(ShapeType.Cuboid)) {
			return new Cuboid(getDialog(), 5, 5, 5);
		} else if (type.equals(ShapeType.Cylinder)) {
			return new Cylinder(getDialog(), 5, 5);
		} else if (type.equals(ShapeType.Sphere)) {
			return new Sphere(getDialog(), 5);
		} 		
		return null;
	}
}