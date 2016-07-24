-- DROP TABLE IF EXISTS User;
CREATE TABLE IF NOT EXISTS User (
  id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name varchar(32) DEFAULT NULL,
  email varchar(32) NOT NULL,
  password varchar(32) DEFAULT NULL,
  UNIQUE KEY emailUniqueKey (`email`)
);

-- DROP TABLE IF EXISTS Todo;
CREATE TABLE IF NOT EXISTS Todo (
  id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  userId int NOT NULL,
  title varchar(512) DEFAULT NULL,
  done boolean DEFAULT FALSE NOT NULL,
  priority tinyint NOT NULL,
  dueDate date DEFAULT NULL,
  FOREIGN KEY(userId) REFERENCES User(id)
);
