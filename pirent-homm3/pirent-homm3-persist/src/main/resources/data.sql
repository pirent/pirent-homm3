# ======================================================================
# ORIGINAL DATA FOR PIRENT-HOMM3 APP
# ======================================================================

# ==============================
# May 13 2015
# ==============================

# --------- DATA FOR FACTION ---------
INSERT INTO pirent_homm3.faction (name) VALUES ("Castle"), ("Conflux"), ("Dungeon"), ("Fortress"), ("Inferno"), ("Necropolis"), ("Rampart"), ("Stronghold"), ("Tower");

# --------- DATA FOR CREATURE ---------
# Castle faction
INSERT INTO pirent_homm3.creature (name, faction_id, tier, upgraded, health, attack, defense, damage_min, damage_max, speed, shots) VALUES 
	("Pikeman", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 1, 0, 10, 4, 5, 1, 3, 4, NULL), 
	("Halberdier", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 1, 1, 10, 6, 6, 2, 3, 5, NULL), 
	("Archer", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 2, 0, 10, 6, 3, 2, 3, 4, 12), 
	("Marksman", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 2, 1, 10, 6, 3, 2, 3, 6, 24), 
	("Griffin", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 3, 0, 25, 8, 8, 3, 6, 6, NULL),
	("Royal Griffin", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 3, 1, 25, 9, 9, 3, 6, 9, NULL),
	("Swordsman", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 4, 0, 35, 10, 12, 6, 9, 5, NULL),
	("Crusader", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 4, 1, 35, 12, 12, 7, 10, 6, NULL),
	("Monk", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 5, 0, 30, 12, 7, 10, 12, 5, 12),
	("Zealot", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 5, 1, 30, 12, 10, 10, 12, 7, 24),
	("Cavalier", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 6, 0, 100, 15, 15, 15, 25, 7, NULL),
	("Champion", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 6, 1, 100, 16, 16, 20, 25, 9, NULL),
	("Angel", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 7, 0, 200, 20, 20, 50, 50, 12, NULL),
	("Archangel", (SELECT id FROM pirent_homm3.faction WHERE name = "Castle"), 7, 1, 250, 30, 30, 50, 50, 18, NULL);
