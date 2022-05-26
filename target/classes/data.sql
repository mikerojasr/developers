DROP ALL OBJECTS DELETE FILES;

CREATE TABLE programming_languages (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(200) NOT NULL
);

INSERT INTO programming_languages (name) VALUES
  ('Python'),
  ('Java'),
  ('JavaScript'),
  ('Swift'),
  ('Ruby');

CREATE TABLE developer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(200) NOT NULL
);

INSERT INTO developer (name) VALUES
  ('Fowler'),
  ('Josh'),
  ('Roshi'),
  ('Neumann'),
  ('Yukihiro');
  
CREATE TABLE programming_languages_developer (
  developer_id int(6) unsigned NOT NULL,
  programming_language_id int(3) unsigned NOT NULL,
   PRIMARY KEY (developer_id, programming_language_id),
   FOREIGN KEY (developer_id)
      REFERENCES developer(id)
      ON UPDATE CASCADE ON DELETE RESTRICT,
  FOREIGN KEY (programming_language_id)
      REFERENCES programming_languages(id)
      ON UPDATE CASCADE ON DELETE RESTRICT
);

INSERT INTO programming_languages_developer (developer_id, programming_language_id) VALUES
  ('1', '2'),
  ('2', '2'),
  ('3', '2'),
  ('3', '1'),
  ('4', '1'),
  ('4', '2'),
  ('4', '3'),
  ('4', '4'),
  ('5', '5');
