--users
INSERT IGNORE INTO User VALUES (1,'Foo','foo@bar.org', 'foobar');
INSERT IGNORE INTO User VALUES (2,'Bar','bar@foo.org', 'barfoo');

--todos

INSERT IGNORE INTO Todo VALUES (1,1,'Prepare birthday party', true, 1,'2014-05-25');
INSERT IGNORE INTO Todo VALUES (2,1,'Wash the car', true, 1,'2014-02-02');
INSERT IGNORE INTO Todo VALUES (3,1,'Take out the trash', false, 2,'2014-10-11');
INSERT IGNORE INTO Todo VALUES (4,1,'Buy a gift for mom', true, 2,'2014-07-25');
INSERT IGNORE INTO Todo VALUES (5,1,'Remember the milk', false, 0,'2014-08-12');
INSERT IGNORE INTO Todo VALUES (6,1,'Prepare for interview', true, 0,'2014-08-12');
INSERT IGNORE INTO Todo VALUES (7,1,'Email David about project', true, 2,'2014-10-10');
INSERT IGNORE INTO Todo VALUES (8,1,'Feed the dog', false, 0,'2014-12-12');
INSERT IGNORE INTO Todo VALUES (9,1,'Change password', false, 1,'2014-04-30');
INSERT IGNORE INTO Todo VALUES (10,1,'Send weekly reports', false, 2,'2014-08-22');