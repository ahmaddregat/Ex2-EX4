package GIS;

import java.text.ParseException;

import Geom.Point3D;

public interface Meta_data {
	/** returns the Universal Time Clock associated with this data; */
	public long getUTC();
	/** return a String representing this data */
	public String toString();
	/**
	 * @return the orientation: yaw, pitch and roll associated with this data;
	 */
	public Point3D get_Orientation();
	public void setColor(String Color);
	public void setUTC(String DateAndTime) throws ParseException;
	
}
