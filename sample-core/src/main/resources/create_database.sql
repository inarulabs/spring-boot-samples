CREATE user 'spring'@'%' identified by 'spring';
CREATE user 'spring'@'localhost' identified by 'spring';

CREATE DATABASE `SPRING_BOOT`;
GRANT ALL ON SPRING_BOOT.* to spring@'%';
GRANT ALL ON SPRING_BOOT.* to spring@'localhost';
FLUSH PRIVILEGES;