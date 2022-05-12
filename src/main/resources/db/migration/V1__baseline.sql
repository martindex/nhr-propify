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
