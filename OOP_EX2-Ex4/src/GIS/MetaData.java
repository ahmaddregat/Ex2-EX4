package GIS;
import java.util.Date;
import Geom.Point3D;

public class MetaData implements Meta_data {


private long data;
	private String color;	
	Point3D Orientation;


	public MetaData() {	
	this.color=color;
	this.data=data;
	this.Orientation=Orientation;
	}
	/**
	 * returns the Universal Time Clock associated with this data;
	 */
	@Override
	public long getUTC() {
		// TODO Auto-generated method stub
		Long data = new Date().getTime();
		return data;	}
	/**
	 * @return the orientation: yaw, pitch and roll associated with this data;
	 */
	@Override
	public Point3D get_Orientation() {
		// TODO Auto-generated method stub
		return Orientation ;
	}
	public String getColor() {
		return this.color;
	}

	public void setColor(String Color) {
		this.color = Color;
	}
	/**
	 * return a String representing this data
	 */
	@Override
	public String toString() {
		return ""+data+ "," + Orientation + "," + color+"";

	}

}
