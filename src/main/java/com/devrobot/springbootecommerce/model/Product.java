package com.devrobot.springbootecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * The Class Product.
 *
 * @author devrobot
 * @version 1.0
 */
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "type")
	private String type;

	@Column(name = "symb", nullable = false)
	private String symb;

	@Column(name = "description")
	private String description;

	@Column(name = "date", nullable = false)
	private String date;

	@Column(name = "bid")
	private double bid;

	@Column(name = "ask")
	private double ask;

	@Column(name = "delta")
	private double delta;

	@Column(name = "gamma")
	private double gamma;

	@Column(name = "theta")
	private double theta;

	@Column(name = "vega")
	private double vega;

	@Column(name = "rho")
	private double rho;


	@Column(name = "price")
	private double price;

	@Column(name = "volume")
	private int volume;

	@Column(name = "open")
	private int open;

	@Column(name = "strike")
	private double strike;

	@Column(name = "expiration")
	private String expiration;

	@ManyToOne
	private Category category;

	/**
	 * Empty Constructor. Instantiates a new product.
	 */
	public Product() {
	}

	/**
	 * Instantiates a new product.
	 *
	 * @param id          the id
	 * @param symb        the symb
	 * @param description the description
	 * @param date		  the date
	 * @param type        the type
	 * @param ask	      the ask
	 * @param bid 		  the bid
	 * @param price       the price
	 * @param delta       the delta
	 * @param gamma       the gamma
	 * @param theta       the theta
	 * @param vega        the vega
	 * @param rho         the rho
	 * @param volume       the volume
	 * @param open        the open
	 * @param strike      the strike
	 * @param expiration  the expiration
	 */
	public Product(Long id,  String type, String symb, String description, String date,
				   double bid, double ask, double price,
				   double delta, double gamma, double theta, double vega, double rho,
				   int volume, int open, double strike,
				   String expiration, Category category) {
		super();
		this.id = id;
		this.symb = symb;
		this.type = type;
		this.description = description;
		this.date = date;
		this.bid = bid;
		this.ask = ask;
		this.delta = delta;
		this.gamma = gamma;
		this.theta = theta;
		this.vega = vega;
		this.rho = rho;
		this.price = price;
		this.volume = volume;
		this.open = open;
		this.strike = strike;
		this.expiration = expiration;
		this.category = category;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getSymb() {
		return symb;
	}

	/**
	 * Sets the name.
	 *
	 * @param symb the new name
	 */
	public void setSymb(String symb) {
		this.symb = symb;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAsk() {
		return ask;
	}

	public void setAsk(double ask) {
		this.ask = ask;
	}

	public double getBid() {
		return bid;
	}

	public void setBid(double bid) {
		this.bid = bid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}

	public double getGamma() {
		return gamma;
	}

	public void setGamma(double gamma) {
		this.gamma = gamma;
	}

	public double getTheta() {
		return theta;
	}

	public void setTheta(double theta) {
		this.theta = theta;
	}

	public double getVega() {
		return vega;
	}

	public void setVega(double vega) {
		this.vega = vega;
	}

	public double getRho() {
		return rho;
	}

	public void setRho(double rho) {
		this.rho = rho;
	}

	public double getStrike() {
		return strike;
	}

	public void setStrike(double strike) {
		this.strike = strike;
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}

	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

