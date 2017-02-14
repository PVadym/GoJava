CREATE TABLE  IF NOT EXISTS developers(
  id INT NOT NULL AUTO_INCREMENT UNIQUE ,
  name VARCHAR(50) NOT NULL,
  surname VARCHAR(50) NOT NULL ,
  address VARCHAR(100),
  email VARCHAR(100),
  join_date DATE,

  INDEX (surname),
  PRIMARY KEY (id)
);


CREATE TABLE  IF NOT EXISTS skills (
  id INT NOT NULL UNIQUE ,
  name VARCHAR(50) NOT NULL,

  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS projects (
  id INT NOT NULL UNIQUE ,
  name VARCHAR(100) NOT NULL ,

  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS companies (
  id INT NOT NULL UNIQUE PRIMARY KEY ,
  name VARCHAR(50) NOT NULL ,
  adress VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS customers (
  id INT NOT NULL UNIQUE PRIMARY KEY ,
  first_name VARCHAR(50) NOT NULL ,
  last_name VARCHAR(50) NOT NULL ,
  email VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS developers_skills (
  developer_id INT NOT NULL ,
  skills_id INT NOT NULL ,

  FOREIGN KEY (developer_id) REFERENCES developers(id),
  FOREIGN KEY (skills_id) REFERENCES skills(id),

  UNIQUE (developer_id,skills_id)
);

CREATE TABLE IF NOT EXISTS projects_developers (
  project_id INT NOT NULL ,
  developer_id INT NOT NULL ,

  FOREIGN KEY (project_id) REFERENCES projects(id),
  FOREIGN KEY (developer_id) REFERENCES developers(id),

  UNIQUE (project_id,developer_id)
);

CREATE TABLE IF NOT EXISTS companies_projecta (
  company_id INT NOT NULL ,
  project_id INT NOT NULL ,

  FOREIGN KEY (company_id) REFERENCES companies(id),
  FOREIGN KEY (project_id) REFERENCES projects(id),

  UNIQUE (company_id,project_id)
);

CREATE TABLE IF NOT EXISTS customers_projects (
  customer_id INT NOT NULL ,
  project_id INT NOT NULL ,

  FOREIGN KEY (customer_id) REFERENCES customers(id),
  FOREIGN KEY (project_id) REFERENCES projects(id),

  UNIQUE (customer_id,project_id)
)

