DROP TABLE IF EXISTS dice_simulation;

CREATE TABLE dice_simulation (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  dice_count VARCHAR(250),
  dice_side VARCHAR(250),
  roll_sum VARCHAR(250),
  frequency VARCHAR(250)
);