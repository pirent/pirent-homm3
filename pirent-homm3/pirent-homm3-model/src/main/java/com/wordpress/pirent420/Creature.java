package com.wordpress.pirent420;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Creature {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private Integer tier;
	private Boolean upgraded;
	private Integer health;
	private Integer attack;
	private Integer defense;
	private Integer damageMin;
	private Integer damageMax;
	private Integer speed;
	private Integer shots;
	
	@ManyToOne
	// TODO: add mapping value here
	private Faction faction;
	
	@ManyToMany
	// TODO: add mapping value here
	private Collection<SpecialAbility> specialAbilities;

	public Creature() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTier() {
		return tier;
	}

	public void setTier(Integer tier) {
		this.tier = tier;
	}

	public Boolean getUpgraded() {
		return upgraded;
	}

	public void setUpgraded(Boolean upgraded) {
		this.upgraded = upgraded;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getDamageMin() {
		return damageMin;
	}

	public void setDamageMin(Integer damageMin) {
		this.damageMin = damageMin;
	}

	public Integer getDamageMax() {
		return damageMax;
	}

	public void setDamageMax(Integer damageMax) {
		this.damageMax = damageMax;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getShots() {
		return shots;
	}

	public void setShots(Integer shots) {
		this.shots = shots;
	}

	public Faction getFaction() {
		return faction;
	}

	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	public Collection<SpecialAbility> getSpecialAbilities() {
		return specialAbilities;
	}

	public void setSpecialAbilities(Collection<SpecialAbility> specialAbilities) {
		this.specialAbilities = specialAbilities;
	}
	
	
}
