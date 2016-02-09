/**
 * Describes a 3D vector
 * @author AgentDen
 *
 */

import java.lang.Math;

public class Vector3D {
	/**
	 * Vector's coordinates
	 */
	private double x1;
	private double x2;
	private double x3;
	
	/**
	 * Coordinates' getters and setters
	 */
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public double getX3() {
		return x3;
	}
	public void setX3(double x3) {
		this.x3 = x3;
	}
	
	/**
	 * A method for adding another 3D vector to this
	 */
	public void add(Vector3D other) {
		this.x1 += other.getX1();
		this.x2 += other.getX2();
		this.x3 += other.getX3();
	}
	
	/**
	 * A scalar product of this and other 3D vector
	 */
	public void prodScalar(Vector3D other) {
		this.x1 *= other.getX1();
		this.x2 *= other.getX2();
		this.x3 *= other.getX3();
	}
	
	/**
	 * A vector product of this and other 3D vector
	 */
	public void prodVector(Vector3D other) {
		this.x1 = this.x2 * other.getX3() - this.x3 * other.getX2();
		this.x2 = this.x3 * other.getX1() - this.x1 * other.getX3();
		this.x3 = this.x1 * other.getX2() - this.x2 * other.getX1();
	}
	
	/**
	 * Vector's module
	 */
	public double getModule() {
		return Math.sqrt(x1*x1 + x2*x2 + x3*x3);
	}
}
