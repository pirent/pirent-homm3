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

# Conflux faction
INSERT INTO pirent_homm3.creature (name, faction_id, tier, upgraded, health, attack, defense, damage_min, damage_max, speed, shots) VALUES 
	("Pixie", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 1, 0, 3, 2, 2, 1, 2, 7, NULL),
	("Sprite", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 1, 1, 3, 2, 2, 1, 3, 9, NULL),
	("Air Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 2, 0, 25, 9, 9, 2, 8, 7, NULL),
	("Storm Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 2, 1, 25, 9, 9, 2, 8, 8, 24),
	("Water Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 3, 0, 30, 8, 10, 3, 7, 5, NULL),
	("Ice Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 3, 1, 30, 8, 10, 3, 7, 6, 24),
	("Fire Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 4, 0, 35, 10, 8, 4, 6, 6, NULL),
	("Energy Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 4, 1, 35, 12, 8, 4, 6, 8, NULL),
	("Earth Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 5, 0, 40, 10, 10, 4, 8, 4, NULL),
	("Magma Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 5, 1, 40, 11, 11, 6, 10, 6, NULL),
	("Psychic Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 6, 0, 75, 15, 13, 10, 20, 7, NULL),
	("Magic Elemental", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 6, 1, 80, 15, 13, 15, 25, 9, NULL),
	("Firebird", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 7, 0, 150, 18, 18, 30, 40, 15, NULL),
	("Phoenix", (SELECT id FROM pirent_homm3.faction WHERE name = "Conflux"), 7, 1, 200, 21, 18, 30, 40, 21, NULL);

# Dungeon
INSERT INTO pirent_homm3.creature (name, faction_id, tier, upgraded, health, attack, defense, damage_min, damage_max, speed, shots) VALUES 
	("Troglodyte", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 1, 0, 5, 4, 3, 1, 3, 4, NULL),
	("Infernal Troglodyte", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 1, 1, 6, 5, 4, 1, 3, 5, NULL),
	("Harpy", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 2, 0, 14, 6, 5, 1, 4, 6, NULL),
	("Harpy Hag", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 2, 1, 14, 6, 6, 1, 4, 9, NULL),
	("Beholder", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 3, 0, 22, 9, 7, 3, 5, 5, 12),
	("Evil Eye", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 3, 1, 22, 10, 8, 3, 5, 7, 24),
	("Medusa", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 4, 0, 25, 9, 9, 6, 8, 5, 4),
	("Medusa Queen", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 4, 1, 30, 10, 10, 6, 8, 6, 8),
	("Minotaur", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 5, 0, 50, 14, 12, 12, 20, 6, NULL),
	("Minotaur King", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 5, 1, 50, 15, 12, 12, 20, 8, NULL),
	("Manticore", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 6, 0, 80, 15, 13, 14, 20, 7, NULL),
	("Scorpicore", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 6, 1, 80, 16, 14, 14, 20, 11, NULL),
	("Red Dragon", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 7, 0, 180, 19, 19, 40, 50, 11, NULL),
	("Black Dragon", (SELECT id FROM pirent_homm3.faction WHERE name = "Dungeon"), 7, 1, 300, 25, 25, 40, 50, 15, NULL);

# Fortress
INSERT INTO pirent_homm3.creature (name, faction_id, tier, upgraded, health, attack, defense, damage_min, damage_max, speed, shots) VALUES 
	("Gnoll", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 1, 0, 6, 3, 5, 2, 3, 4, NULL),
	("Gnoll Marauder", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 1, 1, 6, 4, 6, 2, 3, 5, NULL),
	("Lizardman", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 2, 0, 14, 5, 6, 2, 3, 4, 12),
	("Lizard Warrior", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 2, 1, 15, 6, 8, 2, 5, 5, 24),
	("Serpent Fly", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 3, 0, 20, 7, 9, 2, 5, 9, NULL),
	("Dragon Fly", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 3, 1, 20, 8, 10, 2, 5, 13, NULL),
	("Basilisk", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 4, 0, 35, 11, 11, 6, 10, 5, NULL),
	("Greater Basilisk", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 4, 1, 40, 12, 11, 6, 10, 7, NULL),
	("Gorgon", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 5, 0, 70, 10, 14, 12, 16, 5, NULL),
	("Mighty Gorgon", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 5, 1, 70, 11, 16, 12, 16, 6, NULL),
	("Wyvern", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 6, 0, 70, 14, 14, 14, 18, 7, NULL),
	("Wyvern Monarch", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 6, 1, 70, 14, 14, 18, 22, 11, NULL),
	("Hydra", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 7, 0, 175, 16, 18, 25, 45, 5, NULL),
	("Chaos Hydra", (SELECT id FROM pirent_homm3.faction WHERE name = "Fortress"), 7, 1, 250, 18, 18, 25, 45, 7, NULL);

#Inferno
INSERT INTO pirent_homm3.creature (name, faction_id, tier, upgraded, health, attack, defense, damage_min, damage_max, speed, shots) VALUES 
	("Imp", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 1, 0, 4, 2, 3, 1, 2, 5, NULL),
	("Familiar", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 1, 1, 4, 4, 4, 1, 2, 7, NULL),
	("Gog", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 2, 0, 13, 6, 4, 2, 4, 4, 12),
	("Magog", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 2, 1, 13, 7, 4, 2, 4, 6, 24),
	("Hell Hound", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 3, 0, 25, 10, 6, 2, 7, 7, NULL),
	("Cerberus", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 3, 1, 25, 10, 8, 2, 7, 8, NULL),
	("Demon", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 4, 0, 35, 10, 10, 7, 9, 5, NULL),
	("Horned Demon", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 4, 1, 40, 10, 10, 7, 9, 6, NULL),
	("Pit Fiend", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 5, 0, 45, 13, 13, 13, 17, 6, NULL),
	("Pit Lord", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 5, 1, 45, 13, 13, 13, 17, 7, NULL),
	("Efreet", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 6, 0, 90, 16, 12, 16, 24, 9, NULL),
	("Efreet Sultan", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 6, 1, 90, 16, 14, 16, 24, 13, NULL),
	("Devil", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 7, 0, 160, 19, 21, 30, 40, 11, NULL),
	("Arch Devil", (SELECT id FROM pirent_homm3.faction WHERE name = "Inferno"), 7, 1, 200, 26, 28, 30, 40, 17, NULL);

#Necropolis
INSERT INTO pirent_homm3.creature (name, faction_id, tier, upgraded, health, attack, defense, damage_min, damage_max, speed, shots) VALUES 
	("Skeleton", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 1, 0, 6, 5, 4, 1, 3, 4, NULL),
	("Skeleton Warrior", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 1, 1, 6, 6, 6, 1, 3, 5, NULL),
	("Walking Dead", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 2, 0, 15, 5, 5, 2, 3, 3, NULL),
	("Zombie", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 2, 1, 20, 5, 5, 2, 3, 4, NULL),
	("Wight", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 3, 0, 18, 7, 7, 3, 5, 5, NULL),
	("Wraith", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 3, 1, 18, 7, 7, 3, 5, 7, NULL),
	("Vampire", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 4, 0, 30, 10, 9, 5, 8, 6, NULL),
	("Vampire Lord", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 4, 1, 40, 10, 10, 5, 8, 9, NULL),
	("Lich", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 5, 0, 30, 13, 10, 11, 13, 6, 12),
	("Power Lich", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 5, 1, 40, 13, 10, 11, 15, 7, 24),
	("Black Knight", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 6, 0, 120, 16, 16, 15, 30, 7, NULL),
	("Dread Knight", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 6, 1, 120, 18, 18, 15, 30, 9, NULL),
	("Bone Dragon", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 7, 0, 150, 17, 15, 25, 50, 9, NULL),
	("Ghost Dragon", (SELECT id FROM pirent_homm3.faction WHERE name = "Necropolis"), 7, 1, 200, 19, 17, 25, 50, 14, NULL);

#Rampart
INSERT INTO pirent_homm3.creature (name, faction_id, tier, upgraded, health, attack, defense, damage_min, damage_max, speed, shots) VALUES 
	("Centaur", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 1, 0, 8, 5, 3, 2, 3, 6, NULL),
	("Centaur Captain", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 1, 1, 10, 6, 3, 2, 3, 8, NULL),
	("Dwarf", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 2, 0, 20, 6, 7, 2, 4, 3, NULL),
	("Battle Dwarf", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 2, 1, 20, 7, 7, 2, 4, 5, NULL),
	("Wood Elf", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 3, 0, 15, 9, 5, 3, 5, 6, 24),
	("Grand Elf", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 3, 1, 15, 9, 5, 3, 5, 7, 24),
	("Pegasus", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 4, 0, 30, 9, 8, 5, 9, 8, NULL),
	("Silver Pegasus", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 4, 1, 30, 9, 10, 5, 9, 12, NULL),
	("Dendroid Guard", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 5, 0, 55, 9, 12, 10, 14, 3, NULL),
	("Dendroid Soldier", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 5, 1, 65, 9, 12, 10, 14, 4, NULL),
	("Unicorn", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 6, 0, 90, 15, 14, 18, 22, 7, NULL),
	("War Unicorn", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 6, 1, 110, 15, 14, 18, 22, 9, NULL),
	("Green Dragon", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 7, 0, 180, 18, 18, 40, 50, 10, NULL),
	("Gold Dragon", (SELECT id FROM pirent_homm3.faction WHERE name = "Rampart"), 7, 1, 250, 27, 27, 40, 50, 16, NULL);

#Stronghold
INSERT INTO pirent_homm3.creature (name, faction_id, tier, upgraded, health, attack, defense, damage_min, damage_max, speed, shots) VALUES 
	("Goblin", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 1, 0, 5, 4, 2, 1, 2, 5, NULL),
	("Hobgoblin", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 1, 1, 5, 5, 3, 1, 2, 7, NULL),
	("Wolf Rider", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 2, 0, 10, 7, 5, 2, 4, 6, NULL),
	("Wolf Raider", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 2, 1, 10, 8, 5, 3, 4, 8, NULL),
	("Orc", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 3, 0, 15, 8, 4, 2, 5, 4, 12),
	("Orc Chieftain", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 3, 1, 20, 8, 4, 2, 5, 5, 24),
	("Orge", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 4, 0, 40, 13, 7, 6, 12, 4, NULL),
	("Orge Mage", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 4, 1, 60, 13, 7, 6, 12, 5, NULL),
	("Roc", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 5, 0, 60, 13, 11, 11, 15, 7, NULL),
	("Thunderbird", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 5, 1, 60, 13, 11, 11, 15, 11, NULL),
	("Cyclops", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 6, 0, 70, 15, 12, 16, 20, 6, 16),
	("Cyclops King", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 6, 1, 70, 17, 13, 16, 20, 8, 24),
	("Behemoth", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 7, 0, 160, 17, 17, 30, 50, 6, NULL),
	("Ancient Behemoth", (SELECT id FROM pirent_homm3.faction WHERE name = "Stronghold"), 7, 1, 300, 19, 19, 30, 50, 9, NULL);

#Tower
INSERT INTO pirent_homm3.creature (name, faction_id, tier, upgraded, health, attack, defense, damage_min, damage_max, speed, shots) VALUES 
	("Gremlin", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 1, 0, 4, 3, 3, 1, 2, 4, NULL),
	("Master Gremlin", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 1, 1, 4, 4, 4, 1, 2, 5, 8),
	("Gargoyle", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 2, 0, 16, 6, 6, 2, 3, 6, NULL),
	("Obsidian Gargoyle", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 2, 1, 16, 7, 7, 2, 3, 9, NULL),
	("Stone Golem", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 3, 0, 30, 7, 10, 4, 5, 3, NULL),
	("Iron Golem", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 3, 1, 35, 9, 10, 4, 5, 5, NULL),
	("Mage", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 4, 0, 25, 11, 8, 7, 9, 5, 24),
	("Arch Mage", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 4, 1, 30, 12, 9, 7, 9, 7, 24),
	("Genie", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 5, 0, 40, 12, 12, 13, 16, 7, NULL),
	("Master Genie", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 5, 1, 40, 12, 12, 13, 16, 11, NULL),
	("Naga", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 6, 0, 110, 16, 13, 20, 20, 5, NULL),
	("Naga Queen", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 6, 1, 110, 16, 13, 30, 30, 7, NULL),
	("Giant", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 7, 0, 150, 19, 16, 40, 60, 7, NULL),
	("Titan", (SELECT id FROM pirent_homm3.faction WHERE name = "Tower"), 7, 1, 300, 24, 24, 40, 60, 11, 24);
