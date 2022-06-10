CREATE TABLE ingredients (
                             id INT NOT NULL AUTO_INCREMENT,
                             name VARCHAR(30) NOT NULL,
                             price INT NOT NULL,
                             PRIMARY KEY (id),
                             UNIQUE (name)
);