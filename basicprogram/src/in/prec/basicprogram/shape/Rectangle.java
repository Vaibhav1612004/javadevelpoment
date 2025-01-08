package in.prec.basicprogram.shape;

 public class Rectangle {
  float height=1F;
  float width=1F;

 public Rectangle () {
	 height =1F;
	 width =1F;
 }
 
 
 
 
 public Rectangle(float height, float width) {
	 this.height = height;
	 this.width = width;
 }






public void setHeight (float height) {
	this.height = height;
}
 
 public void setWidth (float width) {
	 this.width = width;
 }

public float getHeight () {
	return height;
}

public float getWidth() {
	return width;
}

public float calculateArea() {
 return width * height;
}






}