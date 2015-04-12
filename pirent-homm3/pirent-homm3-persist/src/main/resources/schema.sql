SET storage_engine=INNODB;

CREATE DATABASE pirent_homm3;

CREATE TABLE creature
(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(100) UNIQUE NOT NULL,
	faction_id INT NOT NULL,
	tier INT,
	upgraded BOOLEAN DEFAULT 0,
	health INT NOT NULL,
	attack INT NOT NULL,
	defense INT NOT NULL,
	damage_min INT NOT NULL,
	damage_max INT NOT NULL,
	speed INT NOT NULL,
	shots INT
);

CREATE TABLE faction
(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE special_ability
(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(100) UNIQUE NOT NULL
);

# =================================================================
# ADD RELATIONSHIP BETWEEN EACH TABLE
# =================================================================
ALTER TABLE creature
ADD CONSTRAINT faction_faction_id_fk FOREIGN KEY (faction_id)
REFERENCES faction (id);

CREATE TABLE creature_special_ability
(
	creature_id INT NOT NULL,
	special_ability_id INT NOT NULL
);

ALTER TABLE creature_special_ability
ADD PRIMARY KEY (creature_id, special_ability_id),
ADD CONSTRAINT creature_creature_id_fk FOREIGN KEY (creature_id)
REFERENCES creature (id),
ADD CONSTRAINT special_ability_special_ability_id_fk FOREIGN KEY (special_ability_id)
REFERENCES special_ability (id);

