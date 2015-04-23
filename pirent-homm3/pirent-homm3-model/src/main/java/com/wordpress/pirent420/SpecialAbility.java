package com.wordpress.pirent420;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SpecialAbility
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	@ManyToMany(mappedBy = "specialAbilities")
	// "Creature" is the owning side of this relationship
	private Collection<Creature> creatures;

	public SpecialAbility()
	{
		super();
	}

	public SpecialAbility(String name, Collection<Creature> creatures)
	{
		super();
		this.name = name;
		this.creatures = creatures;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Collection<Creature> getCreatures()
	{
		return creatures;
	}

	public void setCreatures(Collection<Creature> creatures)
	{
		this.creatures = creatures;
	}

}
