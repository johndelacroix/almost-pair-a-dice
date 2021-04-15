DROP TABLE IF EXISTS dice_simulation;

CREATE TABLE dice_simulation (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  dice_count INT,
  dice_side INT,
  roll_sum INT,
  frequency INT
);