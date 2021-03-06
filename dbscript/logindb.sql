SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
CREATE SCHEMA IF NOT EXISTS `login_db` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;
USE `login_db` ;

-- -----------------------------------------------------
-- Table `login_db`.`login`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `login_db`.`login` (
  `username` VARCHAR(45) NOT NULL ,
  `password` VARCHAR(45) NULL DEFAULT NULL ,
  `user_type` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`username`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
