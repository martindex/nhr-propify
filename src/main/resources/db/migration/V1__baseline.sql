CREATE TABLE property (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  rent_price FLOAT NOT NULL,
  create_time VARCHAR(50),
  property_type_id INT,
  address_id INT NOT NULL,
  email VARCHAR(100),
  code VARCHAR(10) NOT NULL
-- TODO: Add missing columns, indices, constraints
);

CREATE TABLE address (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  street VARCHAR(100) NOT NULL,
  city VARCHAR(100) NOT NULL,
  state VARCHAR(2) NOT NULL,
  zip VARCHAR(5) NOT NULL,
  timezone VARCHAR(100)
);

CREATE TABLE property_type (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  type VARCHAR(10) NOT NULL
);

-- TODO constraints and indices will be add when endpoint is run

