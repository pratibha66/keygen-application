Create table available_urls(short_url VARCHAR(6) Primary Key)
											ENGINE=INNODB;
Create table occupied_urls(short_url VARCHAR(6) Primary Key, occupied_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP)
											ENGINE=INNODB;