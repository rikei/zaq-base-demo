CREATE USER 'zaq-base-demo-user'@'%' IDENTIFIED BY 'dEuS7LniYQZe9rXA';

GRANT ALL PRIVILEGES ON `zaq-base-demo-db`.* TO 'zaq-base-demo-user'@'%';

FLUSH PRIVILEGES;