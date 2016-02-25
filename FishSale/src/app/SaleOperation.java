package app;

import java.time.*;
import java.time.temporal.*;

public class SaleOperation {
	private static final double OVERHEADS = 0.014;
	
	private String fishName;
	private double purchasePrice;
	private LocalDate purchaseDate;
	private double salePrice;
	private LocalDate saleDate;
	private double saleWeight;
	private int storeDays;
	
	public SaleOperation() {};
	
	/**
	 * 
	 * @param fn fish name
	 * @param pp purchase price (per kg)
	 * @param pd purchase date
	 * @param sp sale price (per kg)
	 * @param sd sale date
	 * @param sw sale weight (in tons)
	 */
	public SaleOperation(String fn,double pp, LocalDate pd, double sp, LocalDate sd,
			double sw) {
		if ( pd.isAfter(sd) ) {
			throw new NegativeStorageException("purchase price is AFTER sale price");
		}
		this.fishName = fn;
		this.purchasePrice = pp;
		this.purchaseDate = pd;
		this.salePrice = sp;
		this.saleDate = sd;
		this.saleWeight = sw;
		this.storeDays = (int) (pd.until(sd,ChronoUnit.DAYS) + 1);
	}

	public String getFishName() {
		return fishName;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

	public double getSaleWeight() {
		return saleWeight;
	}

	public void setSaleWeight(double saleWeight) {
		this.saleWeight = saleWeight;
	}
	
	public int getStoreDays() {
		return storeDays;
	}

	public static double getOverheads() {
		return OVERHEADS;
	}
	
	/**
	 * 
	 * @return income value of the operation
	 */
	public double calculateIncome() {
//		double netIncome = salePrice - purchasePrice;
//		System.out.println("net income: " + netIncome);
//		double overheadOutcome = storeDays * OVERHEADS;
//		System.out.println("total overheads: " + overheadOutcome);
		return (salePrice - purchasePrice - storeDays * OVERHEADS) * 1000 * saleWeight;
	}
}
